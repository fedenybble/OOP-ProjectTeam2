package model;

import java.util.List;

public class Enhancement extends ReportType {
    private String sugerenciaResultados;

    public Enhancement(String titulo,String descripcion,String actualResult,String sugerenciaResultados,QA qa) {
        super(titulo,descripcion,actualResult, qa);
        this.sugerenciaResultados = sugerenciaResultados;
    }

    public String getSugerenciaResultados() {
        return sugerenciaResultados;
    }

    public void setSugerenciaResultados(String sugerenciaResultados) {
        this.sugerenciaResultados = sugerenciaResultados;
    }
    public void createPaso(String titulo, String descripcion, String expectedResult){
        Paso paso = new Paso(titulo, descripcion, expectedResult);
        this.addPaso(paso);
    }
    @Override
    public String toString() {
        return "\n - sugerenciaResultados = " + sugerenciaResultados +  "\n" +super.toString();
    }
}
