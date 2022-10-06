package interfaces;

import model.Bug;
import model.Paso;
import model.QA;
import model.TestCase;

import java.util.List;

public interface IQA {

//    void printBugsReported(QA dni);

    void addBug(Bug bug);

    void addTestCaseDone(TestCase testCase);
    void printBugBySeveridad(int severidad);
    void reportBug(String titulo, String descripcion, int prioridad, int severidad, List<Paso> pasos, String actualResult, String expectedResult);
}
