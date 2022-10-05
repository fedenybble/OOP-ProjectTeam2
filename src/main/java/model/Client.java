package model;

public class Client {

    public static void main(String[] args) {

        Dev dev1 = new Dev("Alan", "Duarte", "alanduarte@gmail.com", "Av. Hurlingham", 35234432, 12345);
        Dev dev2 = new Dev("Eynar", "Pari", "eynarpari@gmail.com", "Av. Cabildo", 35898232, 12345);

        Bug bug1 = new Bug("Mostrar main menu", "Se muestra un error");

        dev1.addBug(bug1);

        System.out.println();






    }
}
