package pages;

import org.openqa.selenium.*;

public class SuccessPage {

    WebDriver driver;

    By successMsg = By.xpath("//*[contains(text(),'Success') or contains(text(),'Thank')]");

    public SuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPaymentSuccessful() {
        try {
            return driver.findElement(successMsg).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}