package model;

public class Bug extends ReportType {
    private String expectedResult;

    //aaaa
    public Bug(String title,String description,String expectedResult, String actualResult,QA qa) {
        super(title, description, actualResult, qa);
        this.expectedResult = expectedResult;

    }
    //asdasdasd

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public void createStep(String title, String description, String expectedResult){
        Step step = new Step(title, description, expectedResult);
        this.addStep(step);
    }
    @Override
    public String toString() {

        return "TITULO: "+this.getTitle() + "\n- ExpectedResult = " + expectedResult + "\n" +super.toString();
    }

}
