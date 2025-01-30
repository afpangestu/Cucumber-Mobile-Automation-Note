package runner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdef"},
//        tags = "@register or @login or @note",
        plugin = {"pretty", "html:target/HTML_report.html", "json:target/cucumber_report.json"}
)

public class customRunner { }
