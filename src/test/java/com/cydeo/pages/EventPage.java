package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EventPage {

    public EventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@id='log_internal_container']//div[@class='feed-post-item']/div)[1]")
    public WebElement eventItemCreatedOnActivityStream;

    @FindBy(xpath = "(//div[@id='log_internal_container']//a[@id='feed-event-view-link-livefeed1991'])[1]")
    public WebElement eventNameCreatedOnActivityStream;

    @FindBy(xpath = "//span[text()='Event']")
    public WebElement eventTab;

    @FindBy(xpath = "//input[@name='EVENT_NAME']")
    public WebElement eventName;

    @FindBy(id = "feed-cal-event-fromcal_3Jcl")
    public WebElement eventStartDate;

    @FindBy(id = "feed-cal-event-tocal_3Jcl")
    public WebElement eventEndDate;
    @FindBy(id = "feed_cal_event_from_timecal_3Jcl")
    public WebElement eventStartTimeBox;

    @FindBy(id = "feed_cal_event_to_timecal_3Jcl")
    public WebElement eventEndTimeBox;
    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@title='Hours']")
    public WebElement startTimePickerHours;

    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@title='Minutes']")
    public WebElement startTimePickerMinutes;
    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@value='Set Time']")
    public WebElement startTimeSetTimeButton;
    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//span[@class='bxc-am-pm']")
    public WebElement startTimeAmPmPicker;

    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@title='Hours']/../following-sibling::td")
    public WebElement startTimeHoursIncrease;

    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@title='Hours']/../../following-sibling::tr/td")
    public WebElement startTimeHoursDecrease;

    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@title='Minutes']/../following-sibling::td")
    public WebElement startTimeMinutesIncrease;

    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@title='Minutes']/../../following-sibling::tr/td")
    public WebElement startTimeMinutesDecrease;


    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@title='Hours']")
    public WebElement endTimePickerHours;

    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@title='Minutes']")
    public WebElement endTimePickerMinutes;
    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@value='Set Time']")
    public WebElement endTimeSetTimeButton;
    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//span[@class='bxc-am-pm']")
    public WebElement endTimeAmPmPicker;

    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@title='Hours']/../following-sibling::td")
    public WebElement endTimeHoursIncrease;

    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@title='Hours']/../../following-sibling::tr/td")
    public WebElement endTimeHoursDecrease;

    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@title='Minutes']/../following-sibling::td")
    public WebElement endTimeMinutesIncrease;

    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@title='Minutes']/../../following-sibling::tr/td")
    public WebElement endTimeMinutesDecrease;

    @FindBy(xpath = "//input[@id='event-full-daycal_3Jcl']")
    public WebElement allDayCheckbox;

    @FindBy(xpath = "//span[text()='Specify time zone']")
    public WebElement specifyTimeZone;

    @FindBy(xpath = "//select[@id='feed-cal-tz-fromcal_3Jcl']")
    public WebElement startTimezoneDropdown;

    @FindBy(xpath = "//select[@id='feed-cal-tz-tocal_3Jcl']")
    public WebElement endTimezoneDropdown;

    @FindBy(id = "event-remindercal_3Jcl")
    public WebElement setReminderCheckbox;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public WebElement setReminderCount;
    @FindBy(id = "event-remind_typecal_3Jcl")
    public WebElement setReminderTimeTypeDropdown;

    @FindBy(id="event-locationcal_3Jcl")
    public WebElement eventLocationDropdown;
    @FindBy(id="feed-event-dest-add-link")
    public WebElement addPersonsGroupsDepartmentsLink;

    @FindBy(id="destGroupTab_calnAJEM3")
    public WebElement myGroupsLink;
    @FindBy(id="destDepartmentTab_calnAJEM3")
    public WebElement employeesAndDepartmentsLink;

    @FindBy(xpath = "//div[text()='Corporate Christmas Party']")
    public WebElement corporateGroupLink;
    @FindBy(xpath = "//div[text()='QA Department']")
    public WebElement qaDepartmentLink;
    @FindBy(xpath = "(//div[text()='QA Department']/../../following-sibling::div[1]//div[@class='bx-finder-company-department-check-arrow'])[1]")
    public WebElement allDepartmentEmployeesCheckbox;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-info']//div[text()='helpdesk22@cybertekschool.com']")
    public WebElement helpdesk22User;

    @FindBy(css = "span.popup-window-close-icon")
    public WebElement closeEmployeeSelectMenu;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    public void verifyEventCreated(String eventName){

        WebElement eventInActivityStream = Driver.getDriver().findElement(By.xpath("//div[@id='log_internal_container']//div[@class='feed-wrap']/div[1]//a[text()='"+eventName+"']"));
        Assert.assertTrue(eventInActivityStream.isDisplayed());
    }

    @FindBy(xpath = "//a[@title='Calendar']")
    public WebElement calendarMenu;

    @FindBy(css = "a.bx-calendar-top-month")
    public WebElement monthPicker;
    @FindBy(css = "a.bx-calendar-top-year")
    public WebElement yearPicker;

        // MM/DD/YYYY
    public void selectDate(String date ) throws InterruptedException {
        String[] dateArr = date.split("/");


        String day=dateArr[0];
        String month=dateArr[1];
        String year=dateArr[2];

        monthPicker.click();
        Thread.sleep(500);
        Driver.getDriver().findElement(By.xpath("//div[@class='bx-calendar-month-content']//span[text()='"+month+"']")).click();

        yearPicker.click();
        Thread.sleep(500);
        Driver.getDriver().findElement(By.xpath("//div[@class='bx-calendar-year-content']//span[text()='"+year+"']")).click();

        List<WebElement> dayElements = Driver.getDriver().findElements(By.xpath(
                "//div[@class='bx-calendar-range']//a[text()='" + day + "']"));


        if (dayElements.size()==2){
            dayElements.get(1).click();
            Thread.sleep(500);
        } else {
            dayElements.get(0).click();
            Thread.sleep(500);
        }

    }

    public void verifyEventOnCalendar(String eventName){

        WebElement eventOnCalendar = Driver.getDriver().findElement(By.xpath("//div[@class='calendar-event-block-inner']//span[text()='"+eventName+"']"));
        Assert.assertTrue(eventOnCalendar.isDisplayed());

    }

    @FindBy(id = "calendar_view_slider_168217_but_del")
    public WebElement deleteEventOnCalendarButton;

    public void selectTime(String time, String timeType) throws InterruptedException {
        String[] startTimeArr = time.split(":");

        String hour = startTimeArr[0];
        String minute = startTimeArr[1];
        String amPm = startTimeArr[2];

        selectHour(hour, timeType);
        selectMinute(minute, timeType);
        selectAmPm(amPm, timeType);

        if (timeType.equals("start"))
            startTimeSetTimeButton.click();
        else if (timeType.equals("end"))
            endTimeSetTimeButton.click();


    }

    public void selectHour(String hour, String timeType) throws InterruptedException {

        if (timeType.equals("start")){
            int actualHour = Integer.parseInt(startTimePickerHours.getAttribute("value"));
            int expectedHour = Integer.parseInt(hour);

            if (actualHour>expectedHour){
                int count = actualHour - expectedHour;
                for (int i = 0; i < count; i++) {
                    startTimeHoursDecrease.click();
                }
            } else if (actualHour<expectedHour) {
                int count = expectedHour-actualHour;
                for (int i = 0; i < count; i++) {
                    startTimeHoursIncrease.click();
                }
            }

        }else if (timeType.equals("end")){
            int actualHour = Integer.parseInt(endTimePickerHours.getAttribute("value"));
            int expectedHour = Integer.parseInt(hour);

            if (actualHour>expectedHour){
                int count = actualHour - expectedHour;
                for (int i = 0; i < count; i++) {
                    endTimeHoursDecrease.click();
                }
            } else if (actualHour<expectedHour) {
                int count = expectedHour-actualHour;
                for (int i = 0; i < count; i++) {
                    endTimeHoursIncrease.click();
                }
            }
        }

    }

    public void selectMinute(String minute, String timeType) throws InterruptedException {


        if (timeType.equals("start")){
            startTimePickerMinutes.clear();
            startTimePickerMinutes.sendKeys(minute);
            Thread.sleep(500);

        } else if (timeType.equals("end")) {

            endTimePickerMinutes.clear();
            endTimePickerMinutes.sendKeys(minute);
            Thread.sleep(500);
        }
    }

    public void selectAmPm(String amPm, String timeType){
        if (timeType.equals("start")){
            String actualAmPm = startTimeAmPmPicker.getText();
            if (!actualAmPm.equals(amPm))
                startTimeAmPmPicker.click();

        } else if (timeType.equals("end")) {
            String actualAmPm = endTimeAmPmPicker.getText();
            if (!actualAmPm.equals(amPm))
                endTimeAmPmPicker.click();
        }
    }







}
