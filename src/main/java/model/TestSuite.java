package model;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private String titulo;
    private String sprint;
    private List<TestCase> testCases= new ArrayList<>();
    private List<TestExcecution> testExcecutions = new ArrayList<>();

    public TestSuite(String titulo, String sprint) {
        this.titulo = titulo;
        this.sprint = sprint;
    }

    public void excecuteTest(String build, String estado,Owner owner,TestCase testCase,Bug bug){
        TestExcecution testExcecution = new TestExcecution(testCase.getTitulo(), testCase.getCreador());
        testExcecution.setPrioridad(testCase.getPrioridad());
        testExcecution.setDescripcion(testCase.getDescripcion());
        testExcecution.setPasos(testCase.getPasos());
        testExcecution.setBuild(build);
        testExcecution.setEstado(estado);
        testExcecution.setOwner(owner);
        if (bug != null)
            testExcecution.setBug(bug);
        this.addTestExcecution(testExcecution);
    }

    public void contadorEstados(){
        int contFail = 0;
        int contPass = 0;
        int contBlock = 0;
        for (TestExcecution testEx : testExcecutions) {
            switch (testEx.getEstado()){
                case ("failed"):
                    contFail +=1;
                    break;
                case ("passed"):
                    contPass +=1;
                    break;
                case ("blocked"):
                    contBlock +=1;
                    break;
                default:
                    break;
            }

        }
        System.out.println("La cantidad de tests con estado failed es: "+ contFail);
        System.out.println("La cantidad de tests con estado passed es: "+ contPass);
        System.out.println("La cantidad de tests con estado blocked es: "+ contBlock);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }

    public void addTestCase(TestCase testCase) {
        this.testCases.add(testCase);
    }

    public List<TestExcecution> getTestExcecutions() {
        return testExcecutions;
    }

    public void addTestExcecution(TestExcecution testExcecution) {
        this.testExcecutions.add(testExcecution);
    }

    @Override
    public String toString() {
        return "TestSuite{" +
                "titulo='" + titulo + '\'' +
                ", sprint='" + sprint + '\'' +
                ", testCases=" + testCases +
                ", testExcecutions=" + testExcecutions +
                '}';
    }
}
