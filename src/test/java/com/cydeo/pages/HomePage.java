package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement usernameOnProfile;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logoutOption;

    @FindBy(id="feed-add-post-form-tab-tasks")
    public WebElement task;

    @FindBy(id="task-edit-title")
    public WebElement thingsToDoBox;

    @FindBy(xpath = "//label[@for='tasks-task-priority-cb']")
    public WebElement highPriorityLabel;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckbox;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']/input[1]")
    public WebElement datePicker;

    public void navigateToHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("homePage"));
    }

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
