package pages;

import org.openqa.selenium.*;
import utils.WaitUtils;

public class PaymentPage {

    WebDriver driver;

    // DEFINE locator at class level
    private By payBtn = By.id("payBtn");

    private By iframeLocator = By.tagName("iframe");
    private By cardNumber = By.name("card[number]");
    private By expiry = By.name("card[expiry]");
    private By cvv = By.name("card[cvv]");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPay() {
        WebElement button = WaitUtils.waitForClickable(driver, payBtn, 10);
        button.click();
    }

    public void enterCardDetails(String card, String exp, String cvvCode) {

        clickPay(); // ✅ now works

        WaitUtils.waitForElement(driver, iframeLocator);
        driver.switchTo().frame(0);

        WebElement cardField = WaitUtils.waitForElement(driver, cardNumber);
        cardField.sendKeys(card);

        WebElement expField = WaitUtils.waitForElement(driver, expiry);
        expField.sendKeys(exp);

        WebElement cvvField = WaitUtils.waitForElement(driver, cvv);
        cvvField.sendKeys(cvvCode);

        driver.switchTo().defaultContent();
    }

	public void completePayment() {
		// TODO Auto-generated method stub
		
	}
}