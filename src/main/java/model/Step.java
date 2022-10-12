package model;

public class Step {
    private String description;
    private String title;
    private String expectedResult;
    //aaaa
    public Step(String title, String description, String expectedResult) {
        this.title = title;
        this.description = description;
        this.expectedResult = expectedResult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    @Override
    public String toString() {
        return "\n            **** Step **** \n" +
                "                   - Descripcion = " + description + "\n" +
                "                   - Titulo = " + title + "\n" +
                "                   - ResultadoEsperado = " + expectedResult + "\n";
    }
}
