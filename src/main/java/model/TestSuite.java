package model;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private String title;
    private String sprint;
    private List<TestCase> testCases= new ArrayList<>();
    private List<TestExcecution> testExcecutions = new ArrayList<>();

    public TestSuite(String title, String sprint) {
        this.title = title;
        this.sprint = sprint;
    }

    public void excecuteTest(String build, String state,Owner owner,TestCase testCase,Bug bug){
        TestExcecution testExcecution = new TestExcecution(testCase.getTitle(), testCase.getCreator());
        testExcecution.setPriority(testCase.getPriority());
        testExcecution.setDescription(testCase.getDescription());
        testExcecution.setSteps(testCase.getSteps());
        testExcecution.setBuild(build);
        testExcecution.setState(state);
        testExcecution.setOwner(owner);
        if (bug != null)
            testExcecution.setBug(bug);
        this.addTestExcecution(testExcecution);
    }

    public void statusCounter(){
        if (this.title!=null) {
            int contFail = 0;
            int contPass = 0;
            int contBlock = 0;
            System.out.println("\n********** El status de los test del Test Suite: " + this.getTitle() + " **********");
            for (TestExcecution testEx : testExcecutions) {
                switch (testEx.getState().toLowerCase()) {
                    case ("failed"):
                        contFail += 1;
                        break;
                    case ("passed"):
                        contPass += 1;
                        break;
                    case ("blocked"):
                        contBlock += 1;
                        break;
                    default:
                        break;
                }

            }

            System.out.println("La cantidad de tests con estado failed es: " + contFail);
            System.out.println("La cantidad de tests con estado passed es: " + contPass);
            System.out.println("La cantidad de tests con estado blocked es: " + contBlock);
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                "titulo='" + title + '\'' +
                ", sprint='" + sprint + '\'' +
                ", testCases=" + testCases +
                ", testExcecutions=" + testExcecutions +
                '}';
    }
}
