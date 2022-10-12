package model;

import java.util.List;

public class TestExcecution extends TestCase{
    private String build;
    private Owner owner;
    private Bug bug;
    private String state;


    public TestExcecution(String title, QA creator) {
        super(title, creator);

    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
