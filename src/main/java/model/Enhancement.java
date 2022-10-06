package model;

import java.util.List;

public class Enhancement extends ReportType {
    private String sugerenciaResultados;
    //aaaa
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

    @Override
    public String toString() {
        return "model.Enhancement{" +
                "sugerenciaResultados='" + sugerenciaResultados + '\'' +
                "} \n " + super.toString();
    }
}
