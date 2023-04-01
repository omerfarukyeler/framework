package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class US001Steps {

    @Given("google ana sayfasina gider")
    public void googleAnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
}
