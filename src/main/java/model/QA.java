package model;

import java.util.List;

public class QA extends Owner{

    private List<Bug> bugsReported;
    private List<TestCase> testCasesDone;

    public QA(String name, String lastname, String role, String email, String address, String dni, int phoneNumber) {
        super(name, lastname, role, email, address, dni, phoneNumber);

    }

    public List<Bug> getBugsReported() {
        return bugsReported;
    }

    public void setBugsReported(List<Bug> bugsReported) {
        this.bugsReported = bugsReported;
    }

    public List<TestCase> getTestCasesDone() {
        return testCasesDone;
    }

    public void setTestCasesDone(List<TestCase> testCasesDone) {
        this.testCasesDone = testCasesDone;
    }
}
