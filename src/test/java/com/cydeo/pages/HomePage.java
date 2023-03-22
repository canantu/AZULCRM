package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement usernameOnProfile;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logoutOption;


    public void logout(){
        clickProfileMenu();
        //BrowserUtils.clickWithWait(logoutOption,2);
        logoutOption.click();
    }

    public void clickProfileMenu(){
        //BrowserUtils.clickWithWait(usernameOnProfile, 2);
        usernameOnProfile.click();
    }


}
