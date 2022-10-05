package model;

public class Client {

    public static void main(String[] args) {

        /*Dev dev1 = new Dev("Alan", "Duarte", "alanduarte@gmail.com", "Av. Hurlingham", 35234432, 12345);
        Dev dev2 = new Dev("Eynar", "Pari", "eynarpari@gmail.com", "Av. Cabildo", 35898232, 12345);

        Bug bug1 = new Bug("Main menu roto", "No se muestra el main menu", "Mostrar main menu", "Se muestra un error");

        dev1.addBug(bug1);

        System.out.println();

        Paso paso1 = new Paso("Hacer login","Pagina principal deberia mostrarse");
        Paso paso2 = new Paso("Click en logout","usario deberia deslogearse");

        Enhancement enc = new Enhancement("Mejorar UI","En la pagina principal no encuentro el boton logout","boton dificil de " +
                "encontrar","hacer mas grande el boton");
        *//*System.out.println(enc.getPasos());
        System.out.println(enc.getTitulo());*//*
        enc.addPaso(paso1);
        enc.addPaso(paso2);
        System.out.println(enc.toString());*/
        QA robertoQA = new QA("roberto","lopez","a@a.com","aaa",123,12345);
        Owner robertoOwner = new Owner("roberto","lopez","QA");
        TestCase tc1 = new TestCase("tc1",robertoQA);

        TestSuite testS = new TestSuite("numero1","sprint1");
        testS.addTestCase(tc1);
        testS.excecuteTest("chorme","failed",robertoOwner,tc1,null);

        testS.contadorEstados();

    }
}
