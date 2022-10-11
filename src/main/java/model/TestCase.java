package model;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    private String titulo;
    private int prioridad;
    private String descripcion;
    private List<Paso> pasos = new ArrayList<>();
    private QA creador;


    public TestCase(String titulo, QA creador) {
        this.titulo = titulo;
        this.creador = creador;

    }

    public void printTestByPriority(int prioridad){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Paso> getPasos() {
        return pasos;
    }

    public void addPaso(String titulo, String descripcion,String expectedResult) {
        Paso paso = new Paso(titulo,descripcion,expectedResult);
        this.pasos.add(paso);
    }

    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    public QA getCreador() {
        return creador;
    }

    public void setCreador(QA creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        System.out.printf("");
        return  "    " + this.titulo + "{" + "\n"  +
                "       prioridad=" + prioridad + "\n" +
                "       descripcion='" + descripcion + '\'' + "\n"  +
                "       creador=" + creador.getName() + "\n"  +
                "   }";
    }
}
