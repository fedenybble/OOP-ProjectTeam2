package model;

import interfaces.IEmployeeList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements IEmployeeList {
    protected List<QA> qas = new ArrayList<>();
    protected List<Dev> devs = new ArrayList<>();

    public void testCasesCreatedByQA(String dni){
        System.out.println("\n****************** TEST CASES CREADOS POR QA ******************");
        try {
            QA qaEncontrado = searchQA(dni);
            if (qaEncontrado.getTestCasesDone().size()==0)
                System.out.println("El QA " + qaEncontrado.getName() + " " + qaEncontrado.getLastname() + " no tiene TestCases reportados");
            else {
                System.out.println("Test Cases creados por " + qaEncontrado.getName() + " son:");
                for (TestCase testCaseIterator :
                        qaEncontrado.getTestCasesDone()) {
                    System.out.println(testCaseIterator.toString());
                }
            }
        } catch (Exception e){
            System.out.println("No se encontro un QA con documento " + dni);
        }
    }
    public TestSuite searchTestSuite(String title){
        TestSuite testSuiteEncontrado = null;

            for (QA qa : qas) {
                if (qa.searchTestSuite(title) instanceof TestSuite) {
                    testSuiteEncontrado = qa.searchTestSuite(title);
                    break;
                }
            }
            if (testSuiteEncontrado == null){
                System.out.println("\n********** El status de los test del Test Suite: " + title + " **********");
                System.out.println("No se encontro el Test Suite con titulo " + title);
                testSuiteEncontrado = new TestSuite(null,null);
                return testSuiteEncontrado;
            } else
                return testSuiteEncontrado;
    }

    public QA searchQA(String dni) {

        QA qaEncontrado = null;
        for (QA qa : qas) {
            if (qa.getDni().equals(dni)) {
                qaEncontrado = qa;
                break;
            }
        }
        if (qaEncontrado != null)
            return qaEncontrado;
        else
            return null;
    }

    public void printTCbyPriority(int priority){
        System.out.println("\n****************** TEST CASES POR PRIORIDAD ******************");
        if(priority >=1 && priority <=4) {
            for (QA qa :
                    qas) {
                qa.printTestCaseByPriority(priority);
            }
        } else{
            System.out.println("La prioridad a buscar debe estar entre 1 y 4");
        }

    }
    public void printBugsbySeverity(int severity){
        System.out.println("\n****************** BUGS POR SEVERIDAD ******************");
        if(severity >=1 && severity <=4) {
            for (QA qa :
                    qas) {
                qa.printBugBySeverity(severity);
            }
        } else {
            System.out.println("La severidad a buscar debe estar entre 1 y 4");
        }
    }
    @Override
    public void printBugsAssigned(String dni) {
        System.out.println("\n****************** BUGS ASIGNADOS A DEV ******************");
        try {

            Dev devEncontrado = searchDev(dni);
            if (devEncontrado.getBugsAssigned().size()==0)
                System.out.println("El Dev " + devEncontrado.getName() + " " + devEncontrado.getLastname() + " no tiene Bugs asignados");
            else {
                System.out.println("Los Bugs asignados a " + devEncontrado.getName() + " son: ");
                for (Bug bugIterator : devEncontrado.getBugsAssigned()) {
                    System.out.println(bugIterator.toString());
                }
            }
        } catch (Exception e){
            System.out.println("No se encontro un Dev con documento " + dni);
        }
    }
    public Dev searchDev(String dni) {

        Dev devEncontrado = null;
        for (Dev dev : devs) {
            if (dev.getDni().equals(dni)) {
                devEncontrado = dev;
                break;
            }
        }
        if (devEncontrado != null)
            return devEncontrado;
        else
            return null;
    }


    public List<QA> getQas() {
        return qas;
    }

    public void addQa(QA qa) {
        this.qas.add(qa);
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void addDev(Dev dev) {
        this.devs.add(dev);
    }


}
