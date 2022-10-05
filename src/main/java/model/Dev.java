package model;

import interfaces.IDev;

import java.util.ArrayList;
import java.util.List;

public class Dev extends Person implements IDev {

    private List<Bug> bugsAssigned;

    public Dev(String name, String lastname, String email, String address, int dni, int phoneNumber) {
        super(name, lastname, email, address, dni, phoneNumber);
        this.bugsAssigned = new ArrayList<>();
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
