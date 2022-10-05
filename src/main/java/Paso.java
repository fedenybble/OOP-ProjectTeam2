public class Paso {
    private String descripcion;
    private String resutladoEsperado;

    public Paso(String descripcion, String resutladoEsperado) {
        this.descripcion = descripcion;
        this.resutladoEsperado = resutladoEsperado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResutladoEsperado() {
        return resutladoEsperado;
    }

    public void setResutladoEsperado(String resutladoEsperado) {
        this.resutladoEsperado = resutladoEsperado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paso{");
        sb.append("descripcion='").append(descripcion).append('\'');
        sb.append(", resutladoEsperado='").append(resutladoEsperado).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
