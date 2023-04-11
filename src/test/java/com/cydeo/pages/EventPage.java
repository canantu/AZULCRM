package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {

    public EventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@id='log_internal_container']//div[@class='feed-post-item']/div)[1]")
    public WebElement eventItemCreatedOnActivityStream;

    @FindBy(xpath = "(//div[@id='log_internal_container']//a[@id='feed-event-view-link-livefeed1991'])[1]")
    public WebElement eventNameCreatedOnActivityStream;



}
