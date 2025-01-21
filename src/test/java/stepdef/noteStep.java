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

public class noteStep {
    public static UiAutomator2Options options;
    public static AppiumDriver driver;
    public static String baseUrl = "http://127.0.0.1:4723";
    public static LoginActivity login;
    public static HomeActivity home;

    /* Add Note */

    @Given("User already logged in")
    public void userAlreadyLoggedIn() throws URISyntaxException, MalformedURLException {
        options = new UiAutomator2Options();
        options.setDeviceName("Pixel 9 Pro")
                .setApp("src/test/java/apk/Note_Binar-debug.apk") // running appium in Terminal of IDE
                .setPlatformVersion("14")
                .setPlatformName("Android")
                .noReset();

        driver = new AppiumDriver(new URI(baseUrl).toURL(), options);
        // wait for elements using implicit wait (without plugin "element-wait")
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
        home.clickAddNote();
        // assertion the dialog
        Assert.assertTrue(home.tambahCatatanTxtDisplayed());
    }

    @And("User enters title and description")
    public void userEntersTitleAndDescription() {
        home.setJudulEt("this is title note");
        home.setCatatanEt("this is content of note");
    }

    @And("User click save button")
    public void userClickSaveButton() {
        home.clickSimpan();
    }

    @Then("The note should be on the home page")
    public void theNoteShouldBeOnTheHomePage() {
        // assert list note after adding
        Assert.assertTrue(home.listNoteDisplayed());
        System.out.println("== TEST ADD NOTE SUCCESS ==");
    }

    /* Edit Note */

    @Given("Notes are already on the homepage")
    public void notesAreAlreadyOnTheHomepage() {
        // assert list of note
        Assert.assertTrue(home.listNoteDisplayed());
    }

    @When("User click edit button")
    public void userClickEditButton() {
        home.clickEdit(); // edit on the first item
    }

    @And("User edit title and description")
    public void userEditTitleAndDescription() {
        // assert the edit dialog
        Assert.assertTrue(home.editCatatanTxtDisplayed());
        // fill the EditText
        home.setJudulEt("this judul is after edit");
        home.setCatatanEt("this catatan is after edit");
    }

    @And("User click update button")
    public void userClickUpdateButton() {
        home.clickPerbarui();
    }

    @Then("The note should be updated")
    public void theNoteShouldBeUpdated() {
        // assert list note after edit
        Assert.assertTrue(home.listNoteDisplayed());
        System.out.println("== TEST EDIT NOTE SUCCESS ==");
    }

    /* Delete Note */

    @When("User click delete button")
    public void userClickDeleteButton() {
        home.clickDelete(); // delete on the first item
    }

    @And("Show the dialog confirmation")
    public void showTheDialogConfirmation() {
        // assert the delete dialog
        Assert.assertTrue(home.deleteAlertDisplayed());
    }

    @And("User click delete")
    public void userClickDelete() {
        home.clickDeleteYesBtn();
    }

    @Then("The note should be deleted")
    public void theNoteShouldBeDeleted() {
        System.out.println("== TEST DELETE NOTE SUCCESS ==");
    }
}
