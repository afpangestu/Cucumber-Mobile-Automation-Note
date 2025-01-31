package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdef"},
        plugin = {"io.qase.cucumber7.QaseEventListener", "pretty", "html:target/HTML_report.html", "json:target/cucumber_report.json"}
)

public class customRunner extends AbstractTestNGCucumberTests { }
