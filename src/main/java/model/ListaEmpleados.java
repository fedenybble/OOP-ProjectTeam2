package model;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpleados {
    protected List<QA> qas = new ArrayList<>();
    protected List<Dev> devs = new ArrayList<>();

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

    @Override
    public String toString() {
        return "ListaEmpleados{" +
                "qas=" + qas +
                ", devs=" + devs +
                '}';
    }
}
