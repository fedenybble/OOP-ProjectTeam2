package interfaces;

import model.Bug;
import model.Dev;

public interface IDev {

    void printBugsAssigned (Dev dni);
    void addBug(Bug bug);

}
