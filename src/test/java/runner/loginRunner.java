package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = {"src/test/java/features/Login.feature"},
        glue = {"stepdef"},
        tags = ("@negative or @positive"),
        plugin = {"io.qase.cucumber7.QaseEventListener", "pretty", "html:target/HTML_report.html"}
)

public class loginRunner extends AbstractTestNGCucumberTests { }
