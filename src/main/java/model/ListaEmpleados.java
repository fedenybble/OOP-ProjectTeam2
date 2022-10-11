package model;

import interfaces.IListaEmpleados;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpleados implements IListaEmpleados {
    protected List<QA> qas = new ArrayList<>();
    protected List<Dev> devs = new ArrayList<>();

    public void testCasesCreatedByQA(String dni){
        QA qaEncontrado = buscarQA(dni);
        System.out.println("Test Cases creados por " + qaEncontrado.getName() + " son:");
        for (TestCase testCaseIterator :
                qaEncontrado.getTestCasesDone()) {
            System.out.println(testCaseIterator.toString());
        };
    }

    public QA buscarQA(String dni) {

        QA qaEncontrado = null;
        for (QA qa : qas) {
            if (qa.getDni() == dni) {
                qaEncontrado = qa;
                break;
            }
        }
        if (qaEncontrado != null)
            return qaEncontrado;
        else
            return null;
    }


    @Override
    public void printBugsAssigned(String dni) {
        Dev devEncontrado = buscarDev(dni);
        System.out.println("Los Bugs asignados a: "+devEncontrado.getName() +" son: ");
        for (Bug bugIterator: devEncontrado.getBugsAssigned()){
            System.out.println(bugIterator.toString());
        }
    }

    public Dev buscarDev(String dni) {

        Dev devEncontrado = null;
        for (Dev dev : devs) {
            if (dev.getDni() == dni) {
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
