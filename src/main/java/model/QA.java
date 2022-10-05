package model;

import interfaces.IQA;
import model.Bug;
import model.Person;

import java.util.List;

public class QA extends Person{

    public QA(String name, String lastname, String email, String address, int dni, int phoneNumber) {
        super(name, lastname, email, address, dni, phoneNumber);
    }

}
