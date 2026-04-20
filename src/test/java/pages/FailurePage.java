package pages;

import org.openqa.selenium.*;

public class FailurePage {

    WebDriver driver;

    By failMsg = By.xpath("//*[contains(text(),'Failed') or contains(text(),'declined')]");

    public FailurePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPaymentFailed() {
        try {
            return driver.findElement(failMsg).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}