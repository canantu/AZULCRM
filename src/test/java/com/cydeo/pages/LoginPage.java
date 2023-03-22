package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='log-popup-header']")
    public WebElement loginPageHeader;

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInputBox;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberCheckbox;
    @FindBy(xpath = "//label[@for='USER_REMEMBER']")
    public WebElement rememberText;
    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[text()='Get Password']")
    public WebElement getPasswordHeader;
















}
