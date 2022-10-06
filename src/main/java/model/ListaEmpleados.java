package model;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpleados {
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
