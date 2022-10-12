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

    @Override
    public String toString() {
        return "model.Enhancement{" +
                "Sugerencia de Resultados = " + suggestedResults + '\'' +
                "} \n " + super.toString();
    }
}
