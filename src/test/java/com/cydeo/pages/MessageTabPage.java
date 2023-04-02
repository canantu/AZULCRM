package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageTabPage {

    public MessageTabPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFilesLink;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public WebElement editFileNameButton;

    @FindBy(xpath = "(//input[@id='diskuf-edit-rigths-doc'])[1]")
    public WebElement allowEditCheckbox;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "//input[@class='files-name-edit-inp']")
    public WebElement fileNameEditBox;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageContentArea;

    @FindBy(xpath = "//table[@class='files-list']//span[contains(text(),'picture')]")
    public WebElement uploadedFile1;

    @FindBy(xpath = "//table[@class='files-list']//span[contains(text(),'document')]")
    public WebElement uploadedFile2;

    @FindBy(xpath = "//table[@class='files-list']//span[contains(text(),'textfile')]")
    public WebElement uploadedFile3;
    @FindBy(xpath = "//table[@class='files-list']//span[contains(text(),'flower')]")
    public WebElement uploadedFile4;




}
