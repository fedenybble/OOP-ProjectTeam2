public class Bug extends ReportType{
    private String expectedResult;
    private String actualResult;

    public Bug(String expectedResult, String actualResult) {
        super();
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
    }


    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }
}
