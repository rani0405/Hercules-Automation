package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SettingsPage {

    WebDriver driver;
    WebDriverWait wait;

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators (flexible for dynamic UI)
    By nameField = By.xpath("//input[@type='text'] | //*[@role='textbox']");
//    By saveBtn = By.xpath("//button[contains(text(),'Save') or @type='submit' or //*[@role='button']]");
//    By successMsg = By.xpath("//*[contains(text(),'saved') or contains(text(),'updated')]");

    // Update setting
    public void updateName(String newName) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
        field.click();
        field.clear();
        field.sendKeys(newName);
    }

//    // Click Save
//    public void clickSave() {
//        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
//        btn.click();
//    }
//
//    // Verify update
//    public boolean isUpdateSuccessful() {
//        try {
//            WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
//            return msg.isDisplayed();
//        } catch (Exception e) {
//            return false;
//        }
//    }

    // Get updated value (for validation)
    public String getUpdatedValue() {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
        return field.getAttribute("value");
    }
}