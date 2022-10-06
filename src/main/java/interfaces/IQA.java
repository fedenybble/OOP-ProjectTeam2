package interfaces;

import model.Bug;
import model.QA;
import model.TestCase;

public interface IQA {

//    void printBugsReported(QA dni);

    void addBug(Bug bug);

    void addTestCaseDone(TestCase testCase);
}
