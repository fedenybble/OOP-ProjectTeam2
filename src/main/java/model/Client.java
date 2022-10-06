package model;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<QA> listQA = new ArrayList<>();
        List<Dev> listDev = new ArrayList<>();

       /* Enhancement enc = new Enhancement("Mejorar UI","En la pagina principal no encuentro el boton logout","boton dificil de " +
                "encontrar","hacer mas grande el boton");
        *//*System.out.println(enc.getPasos());
        System.out.println(enc.getTitulo());*//*
        enc.addPaso(paso1);
        enc.addPaso(paso2);
        System.out.println(enc.toString());*/

        Paso paso1 = new Paso("Hacer login","Pagina principal deberia mostrarse");
        Paso paso2 = new Paso("Click en logout","usario deberia deslogearse");
        List<Paso> pasos = new ArrayList<>();
        pasos.add(paso1);
        pasos.add(paso2);

        QA robertoQA = new QA("roberto","lopez","a@a.com","aaa","aaaa","12345",12312);
        listQA.add(robertoQA);

        robertoQA.reportBug("anda mal","anda muy mal",1,1, pasos,"deberia andar bien","anda mal");
        robertoQA.reportBug("anda mal2","anda muy mal",2,2, pasos,"deberia andar bien","anda mal");
        robertoQA.reportBug("anda mal3","anda muy mal",1,1, pasos,"deberia andar bien","anda mal");

        for (QA qa :
                listQA) {
            qa.printBugBySeveridad(1);
        }

        robertoQA.reportTestCase("Probar boton login", "El boton login ubicado abajo", 1, pasos);
        robertoQA.reportTestCase("Probar boton login2", "El boton login ubicado arriba", 2, pasos);
        robertoQA.reportTestCase("Probar boton login3", "El boton login ubicado en el medio", 1, pasos);

        for (QA qa : listQA) {
            qa.printTestCaseByPrioridad(1);
        }

        /*TestCase tc1 = new TestCase("tc1",robertoQA);

        TestSuite testS = new TestSuite("numero1","sprint1");
        testS.addTestCase(tc1);
        testS.excecuteTest("chorme","failed",robertoQA,tc1,null);

        testS.contadorEstados();*/

    }
}
