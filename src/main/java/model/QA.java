package model;

import interfaces.IQA;

import java.util.ArrayList;
import java.util.List;

public class QA extends Owner implements IQA {

    private List<Bug> bugsReported= new ArrayList<>();
    private List<TestCase> testCasesDone = new ArrayList<>();

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
    @Override
    public void reportBug(String titulo, String descripcion, int prioridad, int severidad, List<Paso> pasos, String actualResult, String expectedResult){
        Bug bug = new Bug(titulo,descripcion,expectedResult,actualResult,this);
        bug.setSeveridad(severidad);
        bug.setPasos(pasos);
        this.addBug(bug);
    };
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
        for (Bug bugIterator:
                getBugsReported()) {
            if(bugIterator.getSeveridad() == severidad)
                System.out.println("El reporter es: " + this.getName() + " y el bug es: " + bugIterator.getTitulo() + " con severidad " + severidad);
        }
    }
}
