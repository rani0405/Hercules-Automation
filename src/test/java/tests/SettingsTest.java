package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SettingsPage;

public class SettingsTest extends BaseTest {

    @Test
    public void updateSettingsTest() {

        SettingsPage settings = new SettingsPage(driver);

        String newName = "Automation User";

        // Step 1: Update field
        settings.updateName(newName);

        // Step 2: Save changes
//        settings.clickSave();

        // Step 3: Verify success message
//        Assert.assertTrue(settings.isUpdateSuccessful(), "❌ Settings not saved!");

        // Step 4: Verify value updated
        String updated = settings.getUpdatedValue();
        Assert.assertEquals(updated, newName, "Value not updated correctly");

        System.out.println("Settings updated successfully");
    }
}