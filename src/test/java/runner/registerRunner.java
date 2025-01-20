package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Register.feature"},
        glue = {"stepdef"},
        plugin = {"html:target/HTML_report.html"}
)

public class registerRunner {}
