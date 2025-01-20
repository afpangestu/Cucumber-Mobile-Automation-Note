package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Register.feature", "src/test/java/features/Login.feature"},
        glue = {"stepdef"},
        tags = "@register or @login",
        plugin = {"pretty", "html:target/HTML_report.html"}
)

public class customRunner { }
