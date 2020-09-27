package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    // TestNG'deki BeforMethod gibi calisir
    // Her senaryodan once calisir
    @Before
    public void setUp(){
        System.out.println("setUp methodu calisti");
    }
    // TestNG'deki AfterMethod gibi calisir.
    // Her nethoddan sonra calisir.
    @After
    public void tearDown(Scenario scenario){
        System.out.println("tearDown methodu calisti");
        // Ekran goruntusu almak istedigimizde bu kalibi kullaniyoruz
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.embed(screenshot , "image/png");
        }

        //Driver.closeDriver();
    }
}
