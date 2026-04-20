package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private By logo = By.xpath("(//img)[1]");
//    private By navMenu = By.tagName("div");
    By homeLink = By.xpath("//ul[.//li[text()='Home']]");
    By researchLink= By.xpath("//li[normalize-space()='Research']");
    By pricingLink= By.xpath("//li[.//a[text()='Pricing']]");
    By aboutUsLink= By.xpath("//ul[.//li[text()='About Us']]");
    By superJLink= By.xpath("//li[.//a[text()='Super J']]");
    By poseidonLink= By.xpath("//li[.//a[text()='Poseidon']]");
    
 // Section locators 
    private By researchSection = By.xpath("//*[contains(text(),'Research')]");

    // Methods

    public boolean isLogoDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(logo)).isDisplayed();
    }

//    public boolean isNavMenuDisplayed() {
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(navMenu)).isDisplayed();
//    }

    
    public boolean isHomeLinkClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(homeLink)).isDisplayed();
    }
    
    public boolean isResearchLinkClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(researchLink)).isDisplayed();
    }
    public boolean isPricingLinkClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(pricingLink)).isDisplayed();
    }
    public boolean isAboutUsLinkClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(aboutUsLink)).isDisplayed();
    }
    public boolean isSuperJLinkLinkClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(superJLink)).isDisplayed();
    }
    public boolean isPoseidonLinkClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(poseidonLink)).isDisplayed();
    }


    public String getPageTitle() {
        return driver.getTitle();
    }
    
    //Navigation actions

    public void clickHome() {
        wait.until(ExpectedConditions.elementToBeClickable(homeLink)).click();
    }

    public void clickResearch() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(researchLink));
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void clickPricing() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(pricingLink));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void clickAboutUs() {
        wait.until(ExpectedConditions.elementToBeClickable(aboutUsLink)).click();
    }
    public boolean isPageScrolled() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long scrollY = (Long) js.executeScript("return window.pageYOffset;");
        return scrollY > 0;
    }

    public boolean isResearchURLLoaded() {
        return driver.getCurrentUrl().toLowerCase().contains("research");
    }
    public boolean isPricingSectionVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(pricingLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}