package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Login.feature"},
        glue = {"stepdef"},
        tags = ("@negative or @positive"),
        plugin = {"io.qase.cucumber7.QaseEventListener", "pretty", "html:target/HTML_report.html"}
)

public class loginRunner { }
