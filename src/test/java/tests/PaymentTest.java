package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class PaymentTest extends BaseTest {

  
    @Test
    public void testSuccessfulPayment() {

        PaymentPage payment = new PaymentPage(driver);

        payment.enterCardDetails("4111111111111111", "12/26", "123");
        payment.completePayment();

        Assert.assertTrue(driver.getPageSource().contains("success"),
                "Payment failed");
    }

    @Test
    public void testFailedPayment() {

        PaymentPage payment = new PaymentPage(driver);
        FailurePage failure = new FailurePage(driver);

        payment.enterCardDetails(
                "0000000000000000",
                "12/20",
                "000"
        );

        Assert.assertTrue(failure.isPaymentFailed(), "Payment should fail");
    }
}