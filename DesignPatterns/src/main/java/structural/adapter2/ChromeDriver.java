package structural.adapter2;

public class ChromeDriver implements WebDriver {
    public String getElement() {
        return "get element from Chrome";
    }

    public String selectElement() {
        return "select element from Chrome";
    }
}
