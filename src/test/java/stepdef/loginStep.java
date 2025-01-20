package stepdef;

import activity.HomeActivity;
import activity.LoginActivity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class loginStep {
    public static UiAutomator2Options options;
    public static AppiumDriver driver;
    public static String baseUrl = "http://127.0.0.1:4723";
    public static LoginActivity login;
    public static HomeActivity home;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() throws URISyntaxException, MalformedURLException {
        options = new UiAutomator2Options();
        options.setDeviceName("Pixel 9 Pro")
                .setApp("src/test/java/apk/Note_Binar-debug.apk") // running appium in Terminal of IDE
                .setPlatformVersion("14")
                .setPlatformName("Android");

        driver = new AppiumDriver(new URI(baseUrl).toURL(), options);
        // wait for elements using implicit wait (without plugin "element-wait")
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("the user enters username and password")
    public void theUserEntersUsernameAndPassword() {
        // input data
        login = new LoginActivity(driver);
        login.setUsername("ajifauzi");
        login.setPassword("ajifauzi123");
    }

    @And("the user click login button")
    public void theUserClickLoginButton() {
        // click login button
        login = new LoginActivity(driver);
        login.clickLogin();
    }

    @Then("the user is redirected to home page")
    public void theUserIsRedirectedToHome(){
        home = new HomeActivity(driver);
        // assertion
        Assert.assertTrue(home.welcomeTxt());
        Assert.assertTrue(home.homeTxt());
        System.out.println("== TEST LOGIN SUCCESS ==");
        // driver quit
        if (driver != null) {
            driver.quit();
        }
    }
}
