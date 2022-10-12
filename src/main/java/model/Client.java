package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        ListaEmpleados listaEmpleados = new ListaEmpleados();

        Scanner sc = new Scanner(System.in);

        //Creacion de Empleados
        System.out.println("Datos a ingresar para crear un QA: name , lastname, email, address, dni and phonenumber");
        //QA qa1 = new QA(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(), listaEmpleados);
        System.out.println("Datos a ingresar para crear un DEV: name , lastname, email, address, dni and phonenumber");
        QA qa1 = new QA("roberto","lopez","a@a.com","aaa","12345","12345", listaEmpleados);
        //Dev dev1 = new Dev(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(), listaEmpleados);
        Dev dev1 = new Dev("julio","lopez","a@a.com","aaa","123456","12345", listaEmpleados);


        //Creacion de TestCases hechos por qa1
        System.out.println("Campos para crear un test case: titulo, descripcion y prioridad");
        qa1.reportTestCase("probar login", "descripcion1", 1);
        //qa1.reportTestCase("probar login", sc.nextLine(), Integer.valueOf(sc.nextLine()));
//        System.out.println("Campos para crear y agregar un Paso a un TestCase: titulo del Test Case(Ya creado) , titulo del Paso a crear, descripcion del paso a crear y el expected result" +
//                " del paso");

        //agregado de pasos al test case creado anteriormente
        qa1.buscarTestCase("probar login").addPaso("tocar boton login","tocar el boton que dice login","deberia logearse");
        qa1.buscarTestCase("probar login").addPaso("tocar boton login2","tocar el boton que dice login2","deberia 2");

        //Crea test suite 1
        qa1.crearTestSuite("TS1","10");
        //agrega tc1 a test suite 1
        qa1.buscarTestSuite("TS1").addTestCase(qa1.buscarTestCase("probar login"));
        //ejecuta test suite 1 tc1
        qa1.buscarTestSuite("TS1").excecuteTest("build1","failed",qa1,qa1.buscarTestCase("probar login"),null);
        //Crear un bug
        qa1.reportBug("no funciona login","descripcion no funciona",1,1,null,"No inicia sesion","Deberia funcionar");
        Bug bug = new Bug("no funciona login","descripcion no funciona","Deberia funcionar","No inicia sesion",qa1);
        bug.setSeveridad(1);
        dev1.addBug(bug);


        listaEmpleados.testCasesCreatedByQA("12345");
        listaEmpleados.printBugsAssigned("123456");
        listaEmpleados.printTCbyprioridad(1);
        listaEmpleados.printBugsbySeveridad(1);
        listaEmpleados.buscarTestSuite("TS2").contadorEstados();

    }
}
