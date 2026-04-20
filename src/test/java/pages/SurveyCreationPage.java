package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class SurveyCreationPage {

    WebDriver driver;

    public SurveyCreationPage(WebDriver driver) {
        this.driver = driver;
    }

    By titleBox = By.xpath("//span[@role='textbox']");
    By createBtn = By.xpath("//button[contains(text(),'Create') or contains(text(),'Save')]");

    public void createSurvey(String name) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement box = wait.until(
            ExpectedConditions.visibilityOfElementLocated(titleBox)
        );

        box.click();
        box.sendKeys(name);

     // clickable button
        List<WebElement> buttons = driver.findElements(By.xpath("//button | //*[@role='button']"));

        boolean clicked = false;

        for (WebElement btn : buttons) {
            if (btn.isDisplayed() && btn.isEnabled()) {
                btn.click();
                clicked = true;
                break;
            }
        }

        if (!clicked) {
            throw new RuntimeException("❌ No clickable button found for survey creation");
        }
    }
}