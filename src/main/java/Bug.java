public class Bug extends ReportType{
    private String expectedResult;

    //aaaa
    public Bug(String titulo,String descripcion,String expectedResult, String actualResult) {
        super(titulo,descripcion,actualResult);
        this.expectedResult = expectedResult;
    }
    //asdasdasd

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }



}
