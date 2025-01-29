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
    By usernameEmptyMsg = By.xpath("//android.widget.TextView[@resource-id='com.kazakimaru.ch04_ajifauzipangestu:id/textinput_error' and @text='Username tidak boleh kosong!']");
    By passwordEmptyMsg = By.xpath("//android.widget.TextView[@resource-id='com.kazakimaru.ch04_ajifauzipangestu:id/textinput_error' and @text='Password tidak boleh kosong!']");
    By toastMsg = By.xpath("//android.widget.Toast[@text='Username atau Password salah']");


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

    public boolean getUsernameEmptyMsg() {
        return driver.findElement(usernameEmptyMsg).isDisplayed();
    }

    public boolean getPasswordEmptyMsg() {
        return driver.findElement(passwordEmptyMsg).isDisplayed();
    }

    public boolean getToastMsg() {
        return driver.findElement(toastMsg).isDisplayed();
    }

    public boolean loginTitle() {
        return driver.findElement(loginTitleTxt).isDisplayed();
    }
}
