package activity;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomeActivity {
    AppiumDriver driver;

    // contructor
    public HomeActivity(AppiumDriver driver) {
        this.driver = driver;
    }

    // locator
    By welcomeTxt = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/txt_welcome_user");
    By homeTxt = By.xpath("//android.widget.TextView[@text='Home']");
    By logoutBtn = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/btn_logout");
    By addNoteBtn = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/fab_add");
    By listNote = By.xpath("//androidx.cardview.widget.CardView/android.view.ViewGroup");
    // locator add note
    By tambahCatatanTxt = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/title_dialog");
    By judulEt = By.xpath("//android.widget.EditText[@hint='Judul']");
    By catatanEt = By.xpath("//android.widget.EditText[@hint='Catatan']");
    By simpanBtn = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/btn_add_update");
    By editBtn = By.xpath("(//android.widget.ImageView[@resource-id='com.kazakimaru.ch04_ajifauzipangestu:id/btn_edit'])[1]");
    By deleteBtn = By.xpath("(//android.widget.ImageView[@resource-id='com.kazakimaru.ch04_ajifauzipangestu:id/btn_delete'])[1]");
    // locator edit note
    By editCatatanTxt = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/title_dialog");
    By perbaruiBtn = By.id("com.kazakimaru.ch04_ajifauzipangestu:id/btn_add_update");
    // locator delete note
    By deleteAlert = By.id("android:id/alertTitle");
    By deleteCancelBtn = By.id("android:id/button2");
    By deleteYesBtn = By.id("android:id/button1");

    // methods
    public boolean welcomeTxt() {
        return driver.findElement(welcomeTxt).isDisplayed();
    }

    public boolean homeTxt() {
        return driver.findElement(homeTxt).isDisplayed();
    }

    public void clickLogout() {
        driver.findElement(logoutBtn).click();
    }

    public void clickAddNote() {
        driver.findElement(addNoteBtn).click();
    }

    public boolean listNoteDisplayed() {
        return driver.findElement(listNote).isDisplayed();
    }

    public boolean tambahCatatanTxtDisplayed() {
        return driver.findElement(tambahCatatanTxt).isDisplayed();
    }

    public void setJudulEt(String judul) {
        driver.findElement(judulEt).clear();
        driver.findElement(judulEt).sendKeys(judul);
    }

    public void setCatatanEt(String catatan) {
        driver.findElement(catatanEt).clear();
        driver.findElement(catatanEt).sendKeys(catatan);
    }

    public void clickSimpan() {
        driver.findElement(simpanBtn).click();
    }

    public void clickEdit() {
        driver.findElement(editBtn).click();
    }

    public void clickDelete() {
        driver.findElement(deleteBtn).click();
    }

    public boolean editCatatanTxtDisplayed() {
        return driver.findElement(editCatatanTxt).isDisplayed();
    }

    public void clickPerbarui() {
        driver.findElement(perbaruiBtn).click();
    }

    public boolean deleteAlertDisplayed() {
        return driver.findElement(deleteAlert).isDisplayed();
    }

    public void clickDeleteCancelBtn() {
        driver.findElement(deleteCancelBtn).click();
    }

    public void clickDeleteYesBtn() {
        driver.findElement(deleteYesBtn).click();
    }
}
