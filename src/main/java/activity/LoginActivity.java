package activity;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginActivity {
    AppiumDriver driver;

    // contructor
    public LoginActivity(AppiumDriver driver) {
        this.driver = driver;
    }

    // locator
    By loginTitleTxt = By.xpath("//android.widget.TextView[@text='Login']");
    By registerBtn = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/txt_daftar");
    By loginBtn = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/btn_login");
    By usernameEt = By.xpath("//android.widget.EditText[@text='Username']");
    By passwordEt = By.xpath("//android.widget.EditText[@text='Password']");

    // methods
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void clickRegister() {
        driver.findElement(registerBtn).click();
    }

    public void setUsername(String username) {
        driver.findElement(usernameEt).clear();
        driver.findElement(usernameEt).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordEt).clear();
        driver.findElement(passwordEt).sendKeys(password);
    }

    public boolean loginTitle() {
        return driver.findElement(loginTitleTxt).isDisplayed();
    }
}
