package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdef"},
//        tags = "@register or @login or @note",
        plugin = {"pretty", "html:target/HTML_report.html", "json:target/cucumber_report.json"}
)

public class customRunner { }
