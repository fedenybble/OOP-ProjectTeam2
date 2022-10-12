package model;

import interfaces.IListaEmpleados;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpleados implements IListaEmpleados {
    protected List<QA> qas = new ArrayList<>();
    protected List<Dev> devs = new ArrayList<>();

    public void testCasesCreatedByQA(String dni){
        System.out.println("\n****************** TEST CASES CREADOS POR QA ******************");
        try {
            QA qaEncontrado = buscarQA(dni);
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
    public TestSuite buscarTestSuite(String titulo){
        TestSuite testSuiteEncontrado = null;

            for (QA qa : qas) {
                if (qa.buscarTestSuite(titulo) instanceof TestSuite) {
                    testSuiteEncontrado = qa.buscarTestSuite(titulo);
                    break;
                }
            }
            if (testSuiteEncontrado == null){
                System.out.println("\n********** El status de los test del Test Suite: " + titulo + " **********");
                System.out.println("No se encontro el Test Suite con titulo " + titulo);
                testSuiteEncontrado = new TestSuite(null,null);
                return testSuiteEncontrado;
            } else
                return testSuiteEncontrado;
    }

    public QA buscarQA(String dni) {

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

    public void printTCbyprioridad(int prioridad){
        System.out.println("\n****************** TEST CASES POR PRIORIDAD ******************");
        if(prioridad >=1 && prioridad <=4) {
            for (QA qa :
                    qas) {
                qa.printTestCaseByPrioridad(prioridad);
            }
        } else{
            System.out.println("La prioridad a buscar debe estar entre 1 y 4");
        }

    }
    public void printBugsbySeveridad(int severidad){
        System.out.println("\n****************** BUGS POR SEVERIDAD ******************");
        if(severidad >=1 && severidad <=4) {
            for (QA qa :
                    qas) {
                qa.printBugBySeveridad(severidad);
            }
        } else {
            System.out.println("La severidad a buscar debe estar entre 1 y 4");
        }
    }
    @Override
    public void printBugsAssigned(String dni) {
        System.out.println("\n****************** BUGS ASIGNADOS A DEV ******************");
        try {

            Dev devEncontrado = buscarDev(dni);
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
    public Dev buscarDev(String dni) {

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
