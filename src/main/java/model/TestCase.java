package model;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    private String title;
    private int priority;
    private String description;
    private List<Step> steps = new ArrayList<>();
    private QA creator;


    public TestCase(String title, QA creator) {
        this.title = title;
        this.creator = creator;

    }

    public void printTestByPriority(int priority){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void addStep(String title, String description,String expectedResult) {
        Step step = new Step(title,description,expectedResult);
        this.steps.add(step);
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public QA getCreator() {
        return creator;
    }

    public void setCreator(QA creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        System.out.printf("");
        return  "    " + this.title + "{" + "\n"  +
                "       prioridad = " + priority + "\n" +
                "       descripcion = " + description + '\'' + "\n"  +
                "       pasos = " + steps.toString() + "\n" +
                "   }";
    }
}
