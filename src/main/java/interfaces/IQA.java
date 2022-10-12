package interfaces;

import model.*;

import java.util.List;

public interface IQA {

//    void printBugsReported(QA dni);

    void reportEHM(String title, String description, String actualResult, String suggestedResults, QA qa, int severity, List<Step> steps);

    void addBug(Bug bug);

    void addTestCaseDone(TestCase testCase);
    void printBugBySeverity(int severity);
    void printTestCaseByPriority(int priority);
    Bug reportBug(String title, String description, int priority, int severity, String actualResult, String expectedResult);
    //void reportTestCase(String titulo, String descripcion, int prioridad, List<Paso> pasos);

    void reportTestCase(String title, String description, int priority);
    TestCase searchTestCase(String title);
    void createTestSuite(String title, String sprint);
    TestSuite searchTestSuite(String title);
    Bug searchBug(String title);

    void printCreatedEHM();
}
