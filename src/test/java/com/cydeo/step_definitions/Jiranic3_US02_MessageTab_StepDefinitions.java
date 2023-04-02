package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.MessageTabPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Jiranic3_US02_MessageTab_StepDefinitions {

    MessageTabPage messageTabPage = new MessageTabPage();
    LoginPage loginPage = new LoginPage();

    @Given("user logs in successfully")
    public void user_logs_in_successfully() {
       loginPage.login();
    }
    @Given("user clicks Messages menu")
    public void user_clicks_messages_menu() {
        messageTabPage.messageTab.click();
    }
    @Given("user clicks upload file link")
    public void user_clicks_upload_file_link() {
        messageTabPage.uploadFilesLink.click();
    }

    @When("user uploads three files")
    public void user_uploads_three_files() throws InterruptedException{
        messageTabPage.uploadFilesAndImagesButton.sendKeys(
                ConfigurationReader.getProperty("path1") + "\n" +
                ConfigurationReader.getProperty("path2") + "\n" +
                ConfigurationReader.getProperty("path3"));

    }
    @Then("user sees three files attached")
    public void user_sees_three_files_attached() {
        Assert.assertTrue(messageTabPage.uploadedFile1.isDisplayed());
        Assert.assertTrue(messageTabPage.uploadedFile2.isDisplayed());
        Assert.assertTrue(messageTabPage.uploadedFile3.isDisplayed());
    }

    @When("user uploads a {string}")
    public void user_uploads_a(String file) {
        switch (file){
            case "png":
                messageTabPage.uploadFilesAndImagesButton.sendKeys(ConfigurationReader.getProperty("path1"));
                break;
            case "document":
                messageTabPage.uploadFilesAndImagesButton.sendKeys(ConfigurationReader.getProperty("path2"));
                break;
            case "textfile":
                messageTabPage.uploadFilesAndImagesButton.sendKeys(ConfigurationReader.getProperty("path3"));
                break;
            case "jpeg":
                messageTabPage.uploadFilesAndImagesButton.sendKeys(ConfigurationReader.getProperty("path4"));
                break;
        }
    }

    @Then("user sees the {string} attached")
    public void user_sees_the_file_attached(String file) {
        switch (file){
            case "png":
                Assert.assertTrue(messageTabPage.uploadedFile1.isDisplayed());
                break;
            case "document":
                Assert.assertTrue(messageTabPage.uploadedFile2.isDisplayed());
                break;
            case "textfile":
                Assert.assertTrue(messageTabPage.uploadedFile3.isDisplayed());
                break;
            case "jpeg":
                Assert.assertTrue(messageTabPage.uploadedFile4.isDisplayed());
                break;
        }

    }

    @When("user uploads a file")
    public void user_uploads_a_file() {
        messageTabPage.uploadFilesAndImagesButton.sendKeys(ConfigurationReader.getProperty("path1"));
    }
    @Then("user sees the file attached")
    public void user_sees_the_file_attached() {
        Assert.assertTrue(messageTabPage.uploadedFile1.isDisplayed());
    }

    @And("user clicks Send button")
    public void userClicksSendButton() {
        messageTabPage.sendButton.click();
    }


    @Then("user displays the picture on screen")
    public void user_displays_the_picture_on_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
