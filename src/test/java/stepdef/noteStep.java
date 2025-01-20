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

public class noteStep {
    public static UiAutomator2Options options;
    public static AppiumDriver driver;
    public static String baseUrl = "http://127.0.0.1:4723";
    public static LoginActivity login;
    public static HomeActivity home;

    @Given("User already logged in")
    public void userAlreadyLoggedIn() {
        // login
        login = new LoginActivity(driver);
        login.setUsername("ajifauzi");
        login.setPassword("ajifauzi123");
        login.clickLogin();
        // assertion
        home = new HomeActivity(driver);
        Assert.assertTrue(home.welcomeTxt());
        Assert.assertTrue(home.homeTxt());
    }

    @When("User click floating action button add")
    public void userClickFloatingActionButtonAdd() {
        home = new HomeActivity(driver);
        home.clickAddNote();
        // assertion the dialog
        Assert.assertTrue(home.tambahCatatanTxtDisplayed());
    }

    @And("User enters title and description")
    public void userEntersTitleAndDescription() {
        home = new HomeActivity(driver);
        home.setJudulEt("this is title note");
        home.setCatatanEt("this is content of note");
    }

    @And("User click save button")
    public void userClickSaveButton() {
        home = new HomeActivity(driver);
        home.clickSimpan();
    }

    @Then("the note should be on the home page")
    public void theNoteShouldBeOnTheHomePage() {
        // assert list note after adding
        home = new HomeActivity(driver);
        Assert.assertTrue(home.listNoteDisplayed());
        System.out.println("== TEST ADD NOTE SUCCESS ==");
    }
}
