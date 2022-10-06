package model;

import model.Paso;

import java.util.ArrayList;
import java.util.List;

public abstract class ReportType {

    private String titulo;
    private String descripcion;
    private int prioridad;
    private  int severidad;
    private List<Paso> pasos;
    private String actualReuslt;

    private QA reporter;
    //aaaa
    public ReportType(String titulo, String descripcion,String actualReuslt, QA reporter) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.actualReuslt = actualReuslt;
        this.pasos = new ArrayList<>();
        this.reporter = reporter;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getSeveridad() {
        return severidad;
    }

    public void setSeveridad(int severidad) {
        this.severidad = severidad;
    }

    public List<Paso> getPasos() {
        return pasos;
    }

    public void addPaso(Paso paso) {
        this.pasos.add(paso);
    }

    public String getActualReuslt() {
        return actualReuslt;
    }

    public void setActualReuslt(String actualReuslt) {
        this.actualReuslt = actualReuslt;
    }

    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    public QA getReporter() {
        return reporter;
    }

    public void setReporter(QA reporter) {
        this.reporter = reporter;
    }

    @Override
    public String toString() {
        return "model.ReportType{" +
                "titulo='" + titulo + "\n" +
                ", descripcion='" + descripcion + "\n" +
                ", prioridad=" + prioridad + "\n" +
                ", severidad=" + severidad + "\n" +
                ", pasos=" + pasos.toString() +
                '}';
    }
}
  /*enum Prioridad{
        UNO(1),DOS(2),TRES(3),CUATRO(4);
        private int num;
        private Prioridad(int num){
            this.num = num;
        }
        public int abrev(){
            return num;
        }
    }*/