package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Note.feature"},
        glue = {"stepdef"},
        plugin = {"pretty", "html:target/HTML_report.html"}
)

public class noteRunner {}
