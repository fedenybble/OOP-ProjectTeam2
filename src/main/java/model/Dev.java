package model;

import interfaces.IDev;

import java.util.ArrayList;
import java.util.List;

public class Dev extends Owner implements IDev {

    private List<Bug> bugsAssigned = new ArrayList<>();

    public Dev(String name, String lastname, String email, String address, String dni, String phoneNumber, EmployeeList lista) {
        super(name, lastname, email, address, dni, phoneNumber);
        lista.addDev(this);
    }

    public List<Bug> getBugsAssigned() {
        return bugsAssigned;
    }

    public void setBugsAssigned(List<Bug> bugsAssigned) {
        this.bugsAssigned = bugsAssigned;
    }


    @Override
    public void addBug(Bug bug) {
        this.bugsAssigned.add(bug);
    }

}
