package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
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



    public void navigateLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void loginAsUser(String user){
        String username = "";
        switch (user){
            case "hr":
               username = ConfigurationReader.getProperty("hr.username");
               break;
            case "marketing":
                username = ConfigurationReader.getProperty("marketing.username");
                break;
            case "helpdesk":
                username = ConfigurationReader.getProperty("helpdesk.username");
                break;
            default:
                System.out.println("invalid username");
        }
        String password = ConfigurationReader.getProperty("password");
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

    public void login(String username, String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

    public String isBulletSign(){
        return passwordInputBox.getAttribute("type");
    }

    public void enterTextToPasswordField(String text){
        BrowserUtils.sendKeysWithWait(passwordInputBox, text, 3);
    }

    public void enterTextToUsernameField(String text){
        BrowserUtils.sendKeysWithWait(usernameInputBox, text, 3);
    }























}
