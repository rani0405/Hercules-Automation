package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SurveyCreationPage;

public class SurveyCreationTest extends BaseTest {

    @Test
    public void createSurveyFlow() {
        SurveyCreationPage sc = new SurveyCreationPage(driver);
        sc.createSurvey("Automation Survey");
    }
}