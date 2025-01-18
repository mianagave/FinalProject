package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        glue = {"stepDefWeb"},
        features ={"src/test/java/feature/web.feature"},
        tags = "@web"
)
public class WebRunner{

}
