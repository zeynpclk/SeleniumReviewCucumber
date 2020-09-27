package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"

        },
        features = "C:\\Users\\User\\IdeaProjects\\SeleniumReviewCucumber\\src\\test\\resources\\features",
        glue     = "stepdefinitions",
        tags     = "@amazonurunarama", // hangi tag'a ait testi calistirmak istiyorsak onu buraya yaziyoruz.
        dryRun   = false
)


public class GoogleRunner {
}
