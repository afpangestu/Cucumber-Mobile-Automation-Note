package stepdef;

import activity.LoginActivity;
import activity.RegisterActivity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class registerStep {
    public static UiAutomator2Options options;
    public static AppiumDriver driver;
    public static String baseUrl = "http://127.0.0.1:4723";
    public static RegisterActivity register;
    public static LoginActivity login;

    @Given("User is on the login page")
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

    @And("User click don't have account? Register")
    public void clickDontHaveAccountRegister() {
        // click dont have account? register
        login = new LoginActivity(driver);
        login.clickRegister();
        // assertion
        register = new RegisterActivity(driver);
        Assert.assertTrue(register.registerTitle());
    }

    @When("User input valid data")
    public void theUserInputValidData() {
        // input data
        register = new RegisterActivity(driver);
        register.setUsername("ajifauzi");
        register.setEmail("ajifauzi@mail.com");
        register.setPassword("ajifauzi123");
        register.setConfirmPassword("ajifauzi123");
    }

    @And("User click register")
    public void theUserClickRegister() {
        // click register button
        register = new RegisterActivity(driver);
        register.clickRegister();
    }

    @Then("User is redirected to login")
    public void theUserIsRedirectedToLogin() {
        // assertion
        login = new LoginActivity(driver);
        Assert.assertTrue(login.loginTitle());
        System.out.println("== TEST REGISTER SUCCESS ==");
        // driver quit
        if (driver != null) {
            driver.quit();
        }
    }
}
