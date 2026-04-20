package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class PricingPage {

    WebDriver driver;
    WebDriverWait wait;

    public PricingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void openPricingPage() {

        driver.get("https://hercules.works/pricing");

        // Wait for page to fully load
        wait.until(d -> ((JavascriptExecutor) d)
                .executeScript("return document.readyState").equals("complete"));

        // Scroll multiple times (important)
        for (int i = 0; i < 3; i++) {
            ((JavascriptExecutor) driver)
                    .executeScript("window.scrollBy(0, 1000)");
            try {
                Thread.sleep(1000); // small pause for loading
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean verifyPlansDisplayed() {

        try {
            // Use broad locator (any visible text block)
            List<WebElement> elements = wait.until(
                    ExpectedConditions.presenceOfAllElementsLocatedBy(
                            By.xpath("//body//*")
                    )
            );

            int count = 0;

            for (WebElement el : elements) {
                String text = el.getText().trim();

                if (!text.isEmpty() &&
                        (text.contains("₹") || text.contains("$") ||
                         text.toLowerCase().contains("plan") ||
                         text.toLowerCase().contains("price"))) {

                    System.out.println("Matched Element: " + text);
                    count++;
                }
            }

            System.out.println("Total matched elements: " + count);

            return count > 0;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}