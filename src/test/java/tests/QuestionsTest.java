package tests;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QuestionsPage;

public class QuestionsTest extends BaseTest {

    @Test
    public void testAddQuestion() {
        QuestionsPage page = new QuestionsPage(driver);
        page.addQuestion("What is your favorite color?");
        Assert.assertTrue(driver.getPageSource().contains("favorite color"),
                "Question not added");
    }

//    @Test
//    public void testEditQuestion() {
//        SurveyPage page = new SurveyPage(driver);
//        page.editQuestion("Updated Question?");
//    }

//    @Test
//    public void testDeleteQuestion() {
//    	QuestionsPage page = new QuestionsPage(driver);
//        page.deleteQuestion();
//    }
}