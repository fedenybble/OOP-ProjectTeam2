package model;

public class Paso {
    private String descripcion;
    private String titulo;
    private String resultadoEsperado;
    //aaaa
    public Paso(String titulo,String descripcion, String resutladoEsperado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.resultadoEsperado = resutladoEsperado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResutladoEsperado() {
        return resultadoEsperado;
    }

    public void setResutladoEsperado(String resutladoEsperado) {
        this.resultadoEsperado = resutladoEsperado;
    }

    @Override
    public String toString() {
        return "\n            **** Step **** \n" +
                "                   - Descripcion = " + descripcion + "\n" +
                "                   - Titulo = " + titulo + "\n" +
                "                   - ResultadoEsperado = " + resultadoEsperado + "\n";
    }
}
