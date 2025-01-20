package activity;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RegisterActivity {
    AppiumDriver driver;

    public RegisterActivity(AppiumDriver driver) {
        this.driver = driver;
    }

    // locator
    By registerTitleTxt = By.xpath("//android.widget.TextView[@text='Register']");
    By usernameEt = By.xpath("//android.widget.EditText[@text='Username']");
    By emailEt = By.xpath("//android.widget.EditText[@text='Email']");
    By passwordEt = By.xpath("//android.widget.EditText[@text='Password']");
    By confirmPassEt = By.xpath("//android.widget.EditText[@text='Konfirmasi Password']");
    By registerBtn = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/btn_daftar");

    //methods
    public void clickRegister() {
        driver.findElement(registerBtn).click();
    }

    public void setUsername(String username) {
        driver.findElement(usernameEt).clear();
        driver.findElement(usernameEt).sendKeys(username);
    }

    public void setEmail(String email) {
        driver.findElement(emailEt).clear();
        driver.findElement(emailEt).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordEt).clear();
        driver.findElement(passwordEt).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPassEt).clear();
        driver.findElement(confirmPassEt).sendKeys(confirmPassword);
    }

    public boolean registerTitle() {
        return driver.findElement(registerTitleTxt).isDisplayed();
    }
}
