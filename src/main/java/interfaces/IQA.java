package interfaces;

import model.*;

import java.util.List;

public interface IQA {

//    void printBugsReported(QA dni);


    void reportEHM(String titulo, String descripcion, String actualResult, String sugerenciaResultados, QA qa, int severidad);

    void addBug(Bug bug);

    void addTestCaseDone(TestCase testCase);
    void printBugBySeveridad(int severidad);
    void printTestCaseByPrioridad(int prioridad);
    Bug reportBug(String titulo, String descripcion, int prioridad, int severidad, String actualResult, String expectedResult);
    //void reportTestCase(String titulo, String descripcion, int prioridad, List<Paso> pasos);

    void reportTestCase(String titulo, String descripcion, int prioridad);
    TestCase buscarTestCase(String titulo);
    void crearTestSuite(String titulo, String sprint);
    TestSuite buscarTestSuite(String titulo);
    Bug buscarBug(String titulo);


    void printCreatedEHM();
}
