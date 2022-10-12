package model;

import java.util.List;

public class Enhancement extends ReportType {
    private String suggestedResults;

    public Enhancement(String title,String description,String actualResult,String suggestedResults,QA qa) {
        super(title,description,actualResult, qa);
        this.suggestedResults = suggestedResults;
    }

    public String getSuggestedResults() {
        return suggestedResults;
    }

    public void setSuggestedResults(String suggestedResults) {
        this.suggestedResults = suggestedResults;
    }
    public void createPaso(String titulo, String descripcion, String expectedResult){
        Step paso = new Step(titulo, descripcion, expectedResult);
        this.addStep(paso);
    }
    @Override
    public String toString() {
        return "\n - sugerenciaResultados = " + suggestedResults +  "\n" +super.toString();
    }
}
