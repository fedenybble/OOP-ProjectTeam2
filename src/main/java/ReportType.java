public abstract class ReportType {

    private String titulo;
    private String descripcion;
    private int prioridad;
    private  int severidad;
    //private List<Paso> pasos;



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