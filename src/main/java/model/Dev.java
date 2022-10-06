package model;

import interfaces.IDev;

import java.util.ArrayList;
import java.util.List;

public class Dev extends Owner implements IDev {

    private List<Bug> bugsAssigned;

    public Dev(String name, String lastname, String role, String email, String address, String dni, int phoneNumber, List<Bug> bugsAssigned) {
        super(name, lastname, role, email, address, dni, phoneNumber);
        this.bugsAssigned = bugsAssigned;
    }

    public List<Bug> getBugsAssigned(String actualResult) {
        return bugsAssigned;
    }

    public void setBugsAssigned(List<Bug> bugsAssigned) {
        this.bugsAssigned = bugsAssigned;
    }

    @Override
    public void printBugsAssigned(Dev dni) {

    }

    @Override
    public void addBug(Bug bug) {
        this.bugsAssigned.add(bug);
    }
}
