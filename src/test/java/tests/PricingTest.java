package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.PricingPage;

public class PricingTest extends BaseTest {

    @Test
    public void testPricing() {

        PricingPage pricing = new PricingPage(driver);

        pricing.openPricingPage();

        // Debug info
        System.out.println("Current URL: " + driver.getCurrentUrl());

        boolean result = pricing.verifyPlansDisplayed();

        Assert.assertTrue(result, "Pricing plans are not displayed properly");
    }
}