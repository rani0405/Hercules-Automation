package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import utils.WaitUtils;


public class QuestionsPage {

    WebDriver driver;

    public QuestionsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    By addQuestionBox = By.xpath("//span[@role='textbox']");
    By questionInput = By.xpath("//input | //textarea");
    //By saveBtn = By.xpath("//button[contains(text(),'Save')]");

    By editBtn = By.xpath("(//button[contains(text(),'Edit')])[1]");
    By deleteBtn = By.xpath("(//button[contains(text(),'Delete')])[1]");
    By confirmBtn = By.xpath("//button[contains(text(),'Delete')]");

    // ADD QUESTION
    public void addQuestion(String question) {

        WebElement box = WaitUtils.waitForElement(driver, addQuestionBox);
        box.click();
        box.sendKeys(question);

        //driver.findElement(saveBtn).click();
    }

    // EDIT QUESTION
//    public void editQuestion(String newText) {
//
//    	WaitUtils.waitForElement(driver, editBtn).click();
//
//        WebElement input = WaitUtils.waitForElement(driver, questionInput);
//        input.clear();
//        input.sendKeys(newText);
//
//        driver.findElement(saveBtn).click();
//    }
//
    // DELETE QUESTION
    public void deleteQuestion() {

    	WaitUtils.waitForElement(driver, deleteBtn).click();
    	WaitUtils.waitForElement(driver, confirmBtn).click();
    }
}