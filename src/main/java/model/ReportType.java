package model;

import java.util.ArrayList;
import java.util.List;

public abstract class ReportType {

    private String title;
    private String description;
    private int priority;
    private  int severity;
    protected List<Step> steps;
    private String actualResult;

    private QA reporter;
    //aaaa
    public ReportType(String title, String description,String actualResult , QA reporter) {
        this.title = title;
        this.description = description;
        this.actualResult = actualResult;
        this.reporter = reporter;
        this.steps  = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void addStep(Step step) {
        this.steps.add(step);
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public QA getReporter() {
        return reporter;
    }

    public void setReporter(QA reporter) {
        this.reporter = reporter;
    }

    @Override
    public String toString() {
        return "" +
                "- Titulo = " + title + "\n" +
                "- Descripcion = " + description + "\n" +
                "- Prioridad = " + priority + "\n" +
                "- Severidad = " + severity + "\n" +
                "- Pasos = " + steps.toString();
    }
}
  /*enum Prioridad{
        UNO(1),DOS(2),TRES(3),CUATRO(4);
        private int num;
        private Prioridad(int num){
            this.num = num;
        }
        public int abrev(){
            return num;
        }
    }*/