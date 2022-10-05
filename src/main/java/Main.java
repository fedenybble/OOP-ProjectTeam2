public class Main {

    public static void main(String[] args) {
        Enhancement prueba = new Enhancement("Adicionar funciones nuevas");
        prueba.setDescripcion("hola");
        System.out.println(prueba.getDescripcion());
        System.out.println(prueba.getSugerenciaResultados());
    }
}
