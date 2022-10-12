package model;

import interfaces.IQA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QA extends Owner implements IQA {

    private List<Bug> bugsReported= new ArrayList<>();
    private List<TestSuite> testSuites = new ArrayList<>();
    private Set<TestCase> testCasesDone = new HashSet<>();
    private List<Enhancement> enhancementsReported = new ArrayList<>();

    public QA(String name, String lastname, String email, String address, String dni, String phoneNumber,ListaEmpleados lista) {
        super(name, lastname, email, address, dni, phoneNumber);
        lista.addQa(this);
    }

    public List<Bug> getBugsReported() {
        return bugsReported;
    }


    public void setBugsReported(List<Bug> bugsReported) {
        this.bugsReported = bugsReported;
    }

    public Set<TestCase> getTestCasesDone() {
        return testCasesDone;
    }

    public void setTestCasesDone(Set<TestCase> testCasesDone) {
        this.testCasesDone = testCasesDone;
    }
    @Override
    public Bug reportBug(String titulo, String descripcion, int prioridad, int severidad, List<Paso> pasos, String actualResult, String expectedResult){
        Bug bug = new Bug(titulo,descripcion,expectedResult,actualResult,this);
        bug.setSeveridad(severidad);
        bug.setPasos(pasos);
        this.addBug(bug);
        return bug;
    }

    @Override
    public void reportTestCase(String titulo, String descripcion, int prioridad) {
        TestCase testCase = new TestCase(titulo, this);
        testCase.setDescripcion(descripcion);
        testCase.setPrioridad(prioridad);
        //testCase.setPasos(pasos);
        testCasesDone.add(testCase);
    }

    @Override
    public TestCase buscarTestCase(String titulo) {
        TestCase testEncotnrado = null;
        for (TestCase testCase : testCasesDone) {
            if (testCase.getTitulo().equals(titulo)) {
                testEncotnrado = testCase;
                break;
            }
        }
        return testEncotnrado;
    }
    @Override
    public Bug buscarBug(String titulo) {
        Bug bugEncontrado = null;
        for (Bug bug : bugsReported) {
            if (bug.getTitulo().equals(titulo)) {
                bugEncontrado = bug;
                break;
            }
        }
        return bugEncontrado;
    }

    @Override
    public void crearTestSuite(String titulo, String sprint) {
        TestSuite testSuite = new TestSuite(titulo, sprint);
        testSuites.add(testSuite);
    }


    @Override
    public TestSuite buscarTestSuite(String titulo) {
        TestSuite testSuiteEncotnrado = null;
        try {
            for (TestSuite testSuite : testSuites) {
                if (testSuite.getTitulo().equals(titulo)) {
                    testSuiteEncotnrado = testSuite;
                    break;
                }
            }
            return testSuiteEncotnrado;
        } catch (Exception e){
            testSuiteEncotnrado = new TestSuite("","");
            System.out.println("No se encontro un Test Suite con titulo " + titulo);
            return testSuiteEncotnrado;
        }

    }

    @Override
    public void printCreatedEHM() {

    }

    public List<TestSuite> getTestSuites() {
        return testSuites;
    }

    public void setTestSuites(List<TestSuite> testSuites) {
        this.testSuites = testSuites;
    }

    public List<Enhancement> getEnhancementsReported() {
        return enhancementsReported;
    }

    public void setEnhancementsReported(List<Enhancement> enhancementsReported) {
        this.enhancementsReported = enhancementsReported;
    }

    @Override
    public void reportEHM(String titulo, String descripcion, String actualResult, String sugerenciaResultados, QA qa, int severidad, List<Paso> pasos) {
        Enhancement enhancement = new Enhancement(titulo, descripcion, actualResult, sugerenciaResultados, this);
        enhancement.setSeveridad(severidad);
        enhancement.setPasos(pasos);
        enhancementsReported.add(enhancement);
    }


    @Override
    public void addBug(Bug bug) {
        this.bugsReported.add(bug);
    }

    @Override
    public void addTestCaseDone(TestCase testCase) {
        this.testCasesDone.add(testCase);
    }

    @Override
    public void printBugBySeveridad(int severidad) {
        boolean flag = true;
        for (Bug bugIterator:
                getBugsReported()) {

            if(severidad == bugIterator.getSeveridad()) {
                if (flag) {
                    System.out.println("El reporter es " + this.getName() + " y sus bugs son:");
                    flag = false;
                }
                System.out.println("    - Bug: " + bugIterator.getTitulo() + ", con severidad " + severidad);
            }
            if(flag)
                System.out.println("El QA " + this.getName() + " no tiene test cases reportados con esa severidad");
        }
    }

    @Override
    public void printTestCaseByPrioridad(int prioridad) {
        boolean flag = true;
        for (TestCase tcIterator:
                getTestCasesDone()) {
            if(tcIterator.getPrioridad() == prioridad) {
                if (flag) {
                    System.out.println("El reporter es " + this.getName() + " y sus test cases reportados son:");
                    flag = false;
                }
                System.out.println("    - Test Case: " + tcIterator.getTitulo() + ", con una prioridad " + prioridad);
            }
            if(flag)
                System.out.println("El QA " + this.getName() + " no tiene test cases reportados con esa prioridad");
        }
    }

    @Override
    public String toString() {
        return "QA{" +
                "bugsReported=" + bugsReported +
                ", testSuites=" + testSuites +
                ", testCasesDone=" + testCasesDone +
                ", enhancementsReported=" + enhancementsReported +
                "} " + super.toString();
    }
}
