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

    public QA(String name, String lastname, String email, String address, String dni, String phoneNumber, EmployeeList lista) {
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
    public Bug reportBug(String title, String description, int priority, int severity, String actualResult, String expectedResult){
        Bug bug = new Bug(title,description,expectedResult,actualResult,this);
        bug.setSeverity(severity);
        bug.setPriority(priority);
        this.addBug(bug);
        return bug;
    }

    @Override
    public void reportTestCase(String title, String description, int priority) {
        TestCase testCase = new TestCase(title, this);
        testCase.setDescription(description);
        testCase.setPriority(priority);
        //testCase.setPasos(pasos);
        testCasesDone.add(testCase);
    }

    @Override
    public TestCase searchTestCase(String title) {
        TestCase testEncotnrado = null;
        for (TestCase testCase : testCasesDone) {
            if (testCase.getTitle().equals(title)) {
                testEncotnrado = testCase;
                break;
            }
        }
        return testEncotnrado;
    }
    @Override
    public Bug searchBug(String title) {
        Bug bugEncontrado = null;
        for (Bug bug : bugsReported) {
            if (bug.getTitle().equals(title)) {
                bugEncontrado = bug;
                break;
            }
        }
        return bugEncontrado;
    }

    @Override
    public void createTestSuite(String title, String sprint) {
        TestSuite testSuite = new TestSuite(title, sprint);
        testSuites.add(testSuite);
    }


    @Override
    public TestSuite searchTestSuite(String title) {
        TestSuite testSuiteEncotnrado = null;
        try {
            for (TestSuite testSuite : testSuites) {
                if (testSuite.getTitle().equals(title)) {
                    testSuiteEncotnrado = testSuite;
                    break;
                }
            }
            return testSuiteEncotnrado;
        } catch (Exception e){
            testSuiteEncotnrado = new TestSuite("","");
            System.out.println("No se encontro un Test Suite con titulo " + title);
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
    public void reportEHM(String title, String description, String actualResult, String suggestedResults, QA qa, int severity) {
        Enhancement enhancement = new Enhancement(title, description, actualResult, suggestedResults, this);
        enhancement.setSeverity(severity);
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
    public void printBugBySeverity(int severity) {
        boolean flag = true;
        for (Bug bugIterator:
                getBugsReported()) {

            if(severity == bugIterator.getSeverity()) {
                if (flag) {
                    System.out.println("El reporter es " + this.getName() + " y sus bugs, con severidad " + severity + ", son:");
                    flag = false;
                }
                System.out.println("    - Bug: " + bugIterator.getTitle());
            }
            if(flag)
                System.out.println("El QA " + this.getName() + " no tiene test cases reportados con esa severidad");
        }
    }

    @Override
    public void printTestCaseByPriority(int priority) {
        boolean flag = true;
        for (TestCase tcIterator:
                getTestCasesDone()) {
            if(tcIterator.getPriority() == priority) {
                if (flag) {
                    System.out.println("El reporter es " + this.getName() + " y sus test cases, reportados con Prioridad " + priority +", son:");
                    flag = false;
                }
                System.out.println("    - Test Case: " + tcIterator.getTitle());
            }
            if(flag)
                System.out.println("El QA " + this.getName() + " no tiene test cases reportados con esa prioridad");
        }
    }

    @Override
    public String toString() {
        return "QA {" + "\n" +
                "bugsReported=" + bugsReported + "\n" +
                ", testSuites=" + testSuites + "\n" +
                ", testCasesDone=" + testCasesDone + "\n" +
                ", enhancementsReported=" + enhancementsReported + "\n" +
                "} " + super.toString();
    }
}
