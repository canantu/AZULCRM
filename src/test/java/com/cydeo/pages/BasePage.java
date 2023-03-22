package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // returns the title of the page
    public String getPageTitle(){
        BrowserUtils.wait(3);
        return Driver.getDriver().getTitle();
    }

}
