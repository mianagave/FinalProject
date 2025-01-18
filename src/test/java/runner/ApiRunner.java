package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"stepDefApi"},
        features = {"src/test/java/feature/api.feature"},
        tags = "@api"
)

public class ApiRunner {

}
