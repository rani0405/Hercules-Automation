package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void verifyHomePage() throws InterruptedException {

        HomePage home = new HomePage(driver);

        System.out.println("Title: " + home.getPageTitle());

        boolean logo = home.isLogoDisplayed();
        boolean homeLink = home.isHomeLinkClickable();
        boolean research = home.isResearchLinkClickable();
        boolean pricing = home.isPricingLinkClickable();
        boolean aboutUs = home.isAboutUsLinkClickable();
        boolean superJ = home.isSuperJLinkLinkClickable();
        boolean poseidon = home.isPoseidonLinkClickable();

        // Logs
        System.out.println("Logo: " + logo);
        System.out.println("Home: " + homeLink);
        System.out.println("Research: " + research);
        System.out.println("Pricing: " + pricing);
        System.out.println("About Us: " + aboutUs);
        System.out.println("Super J: " + superJ);
        System.out.println("Poseidon: " + poseidon);

        // Assertions (UI)
        Assert.assertTrue(home.getPageTitle().contains("Hercules"), "Title mismatch");
        Assert.assertTrue(logo, "Logo not visible");
        Assert.assertTrue(homeLink, "Home link not clickable");
        Assert.assertTrue(research, "Research link not clickable");
        Assert.assertTrue(pricing, "Pricing link not clickable");
        Assert.assertTrue(aboutUs, "About Us link not clickable");
        Assert.assertTrue(superJ, "Super J link not clickable");
        Assert.assertTrue(poseidon, "Poseidon link not clickable");

        //Navigation Validation 

        home.clickResearch();
        Thread.sleep(2000);
        Assert.assertTrue(home.isResearchURLLoaded(), "Research navigation failed");

        home.clickPricing();
        Thread.sleep(2000);
        Assert.assertTrue(home.isPricingSectionVisible(), "Pricing navigation failed");

    }
}