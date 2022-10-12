package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        ListaEmpleados listaEmpleados = new ListaEmpleados();

//        Scanner sc = new Scanner(System.in);

        //Creacion de QA
        QA qa1 = new QA("Federico", "Padin", "federicopadin@gmail.com", "Pilar", "40955637", "1136604778", listaEmpleados);
        QA qa2 = new QA("Agustin", "Spitale", "agusspitale@gmail.com", "Rosario", "39345678", "1134531223", listaEmpleados);

        //Creacion de DEVs
        Dev dev1 = new Dev("Enzo", "Lagos", "enzolagos@gmail.com", "Cabildo", "41345987", "1112332265", listaEmpleados);
        Dev dev2 = new Dev("Julian", "Barbieri", "julianbarbieri@gmail.com", "Pilar", "42866453", "1176453454", listaEmpleados);

        //Creacion de TestCases por cada QAs

        qa1.reportTestCase( "Verificar que el boton de login inicie sesion y muestre la pagina principal",
                            "Verificar que el boton de login muestre la pagina principal una vez que los campos esten completados",
                            1);

        qa1.reportTestCase( "Verificar que se pueda cerrar sesion",
                            "Verificar que el usuario pueda cerrar sesion con el boton 'Cerrar Sesion' ",
                            1);

        qa2.reportTestCase( "Verificar que el usuario no pueda ingresar con el campo de email vacio",
                            "Verificar que el usuario no puede dejar el campo de email vacio",
                            1);

        qa2.reportTestCase( "Verificar que se muestre el logo de la empresa en la parte superior de la pagina",
                            "El logo de la empresa debe estar ubicado en la parte superior de la pagina",
                            3);

        // Agregando pasos al Test Case creados anteriormente (se lo identifica al Test Case por Titulo y se agrega el paso a ese test case identificado).
        //Test Case 1
        qa1.buscarTestCase("Verificar que el boton de login inicie sesion y muestre la pagina principal").
                            addPaso("Llenar los campos email y contrasenia con informacion valida",
                                    "El email y la contrasenia deben ser correctos y el usuario debe estar registrado",
                                    "El usuario debe tener los campos necesarios completos");

        qa1.buscarTestCase("Verificar que el boton de login inicie sesion y muestre la pagina principal").
                            addPaso("Apretar el boton de Login",
                                    "Luego de haber llenado los campos obligatorios, el usuario debe hacer click en el boton Login",
                                    "El usuario debe poder iniciar sesion");

        //Test Case 2
        qa1.buscarTestCase("Verificar que se pueda cerrar sesion").
                            addPaso("Estar en el main page",
                                    "El usuario debe haber iniciado sesion y estar en el main page",
                                    "Se debe mostrar un boton para cerrar sesion abajo a la derecha");

        qa1.buscarTestCase("Verificar que se pueda cerrar sesion").
                            addPaso("Apretar el boton para cerrar sesion",
                                    "El usuario debe hacer click en el boton de cerrar sesion",
                                    "La sesion se debe cerrar, llevando al usuario al login");
        //Test Case 3
        qa2.buscarTestCase("Verificar que el usuario no pueda ingresar con el campo de email vacio").
                            addPaso("Dejar el campo 'Email' vacio",
                                    "El campo 'Email' debe quedar vacio",
                                    "El sistema debe notificarle al usuario que quedo un campo vacio.");

        qa2.buscarTestCase("Verificar que el usuario no pueda ingresar con el campo de email vacio").
                            addPaso("Clickear en el boton para Iniciar Sesion",
                                    "El usuario debe hacer click en el boton 'Iniciar Sesion'",
                                    "El usuario no debe poder iniciar sesion con un campo vacio");

        //Test Case 4
        qa2.buscarTestCase("Verificar que se muestre el logo de la empresa en la parte superior de la pagina").
                            addPaso("Estar en el main page",
                                    "El usuario debe haber iniciado sesion y estar ubicado en el main",
                                    "Se debe mostrar el logo de la empresa en la parte superior de la pagina" );

        // ----------------  Creacion de Test Suites, se agregan Test Cases y se ejecutan los TCs. ----------------

        // PARA QA 1

        // 1. Se crea el Test Suite.
        qa1.crearTestSuite("TS1", "Sprint 1");
        // 2. Se anade el Test Case al Test Suite.
        qa1.buscarTestSuite("TS1").addTestCase(qa1.buscarTestCase("Verificar que el boton de login inicie sesion y muestre la pagina principal"));
        // 3. Se busca el Test Suite por el Titulo y se ejecuta el Test Case que tiene dentro (tambien se lo busca al Test Case por el Titulo)
        qa1.buscarTestSuite("TS1").
                            excecuteTest("Google Chrome", "Passed", qa1, qa1.buscarTestCase("Verificar que el boton de login inicie sesion y muestre la pagina principal"), null);

        // 4. Se anade otro Test Case al Test Suite.
        qa1.buscarTestSuite("TS1").addTestCase(qa1.buscarTestCase("Verificar que se pueda cerrar sesion"));
        // 5. Se busca el Test Suite por el Titulo y se ejecuta el Test Case que tiene dentro (tambien se lo busca al Test Case por el Titulo)
        qa1.buscarTestSuite("TS1").
                            excecuteTest("Google Chrome", "Passed", qa1, qa1.buscarTestCase("Verificar que se pueda cerrar sesion"), null);

        // PARA QA 2

        // 1. Se crea el Test Suite
        qa2.crearTestSuite("TS2", "Sprint 2");
        // 2. Se anade el Test Case al Test Suite
        qa2.buscarTestSuite("TS2").addTestCase(qa2.buscarTestCase("Verificar que el usuario no pueda ingresar con el campo de email vacio"));
        // 3. Se busca el Test Suite por el Titulo y se ejecuta el Test Case que tiene dentro (tambien se lo busca al Test Case por el Titulo).
        // 4. Como el TC fallo, se reporta el Bug.

        qa2.buscarTestSuite("TS2").
                            excecuteTest("Google Chrome", "Failed", qa2, qa2.buscarTestCase("Verificar que el usuario no pueda ingresar con el campo de email vacio"),
                                    qa2.reportBug(  "Se puede iniciar sesion sin email",
                                                    "Si el usuario no completa el campo email e intenta iniciar sesion, aun asi puede iniciarse",
                                                    1,
                                                    1,
                                                    "El usuario puede iniciar sesion sin ingresar el email",
                                                    "El sistema deberia mostrar una advertencia de que el campo 'Email' esta vacio y no deberia permitir iniciar sesion" ));

        //5. Se crea un nuevo Test Suite
        qa2.crearTestSuite("TS3", "Sprint 3");
        //6. Se anade el Test Case al Test Suite
        qa2.buscarTestSuite("TS3").addTestCase(qa2.buscarTestCase("Verificar que se muestre el logo de la empresa en la parte superior de la pagina"));
        //7. Se busca el Test Suite por el Titulo y se ejecuta el Test Case que tiene dentro (tambien se lo busca al Test Case por el Titulo).
        qa2.buscarTestSuite("TS3").
                            excecuteTest("Google Chrome", "Passed", qa2, qa2.buscarTestCase("Verificar que se muestre el logo de la empresa en la parte superior de la pagina"), null);

        // CREACION DE BUGS

        qa1.reportBug("No se muestran las opciones de usuario",
                    "El usuario no puede ver las opciones de usuario",
                    1,
                    1,
                    "No se muestran las opciones",
                    "Se deberian mostras todas las opciones de usuario");

        // Creacion de Pasos de un Bug

        qa1.buscarBug("No se muestran las opciones de usuario").
                        createPaso( "Estar ubicado en el main page",
                                    "Estar ubicado en el main page y hacer click en Ajustes de Usuario",
                                    "Se deberian mostrar las opciones de usuario, pero el boton no hace nada");

        // Se anade el Bug al Dev.

        dev1.addBug(qa1.buscarBug("No se muestran las opciones de usuario"));

        dev2.addBug(qa2.buscarBug("Se puede iniciar sesion sin email"));

        // Creacion de Enhancements

        qa1.reportEHM(  "Esta repetido el boton de Login",
                        "Hay dos botones de login, ambos funcionan pero con uno basta.",
                        "Se inicia sesion pero hay un boton de mas",
                        "Deberia haber un solo boton", qa1,
                        1);

        //Happy PATH
        listaEmpleados.testCasesCreatedByQA("39345678");
        listaEmpleados.printBugsAssigned("41345987");
        listaEmpleados.printTCbyprioridad(1);
        listaEmpleados.printBugsbySeveridad(1);
        listaEmpleados.buscarTestSuite("TS3").contadorEstados();


        System.out.println("\n\n\n*********************************************************************************************************************");

        System.out.println("\n\n\nVALIDACIONES");
        //Validaciones
            //DNI inexistente
            listaEmpleados.testCasesCreatedByQA("45435345");
            //DNI inexistente
            listaEmpleados.printBugsAssigned("4134593423487");
            //PRIORIDAD INEXISTENTE
            listaEmpleados.printTCbyprioridad(100);
            //SEVERIDAD INEXISTENTE
            listaEmpleados.printBugsbySeveridad(100);
//            //TEST SUITE INEXISTENTE
            listaEmpleados.buscarTestSuite("TS100").contadorEstados();

          /*  Owner owner = new Owner("agus","lopex","a@a.com","roasario","9834948","291389231");
            System.out.println(owner.toString());
        System.out.println("****************************************************************************************************************************************************************************************************");
            System.out.println(qa1.toString());*/

        //        //Creacion de Empleados con Input
//        System.out.println("Datos a ingresar para crear un QA: name , lastname, email, address, dni and phonenumber");
//        //QA qa1 = new QA(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(), listaEmpleados);
//        System.out.println("Datos a ingresar para crear un DEV: name , lastname, email, address, dni and phonenumber");
//        //Dev dev1 = new Dev(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(), listaEmpleados)

    }
}
