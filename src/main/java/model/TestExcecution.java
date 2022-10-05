package model;

import java.util.List;

public class TestExcecution extends TestCase{
    private String build;
    private Owner owner;
    private Bug bug;
    private String estado;


    public TestExcecution(String titulo, QA creador) {
        super(titulo, creador);

    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
