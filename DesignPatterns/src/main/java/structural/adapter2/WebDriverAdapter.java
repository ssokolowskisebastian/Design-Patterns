package structural.adapter2;

public class WebDriverAdapter implements WebDriver {

    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    public String getElement() {
        return ieDriver.findElement();
    }

    public String selectElement() {
        return ieDriver.clickElement();
    }
}
