package model;

public class Bug extends ReportType {
    private String expectedResult;

    //aaaa
    public Bug(String titulo,String descripcion,String expectedResult, String actualResult,QA qa) {
        super(titulo,descripcion,actualResult,qa);
        this.expectedResult = expectedResult;
    }
    //asdasdasd

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }


    @Override
    public String toString() {
        return "Bug{" +
                "expectedResult='" + expectedResult + '\'' +
                "} " + super.toString();
    }
}
