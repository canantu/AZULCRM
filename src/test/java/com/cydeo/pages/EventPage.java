package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EventPage {

    public EventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    MessageTabPage messageTabPage = new MessageTabPage();
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

    @FindBy(id = "bxecmr_0")
    public WebElement centralMeetingRoomOption;

    @FindBy(id = "bxecmr_1")
    public WebElement eastMeetingRoomOption;

    @FindBy(id = "bxecmr_2")
    public WebElement westMeetingRoomOption;


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

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteEventButtonOnEventMenu;

    @FindBy(xpath = "//a[@title='Calendar']")
    public WebElement calendarMenu;

    @FindBy(css = "a.bx-calendar-top-month")
    public WebElement monthPicker;
    @FindBy(css = "a.bx-calendar-top-year")
    public WebElement yearPicker;




    //-------------------------METHODS--------------------------//

    public void verifyEventCreatedWithName(String eventName){

        WebElement eventInActivityStream = Driver.getDriver().findElement(By.xpath("//div[@id='log_internal_container']//div[@class='feed-wrap']/div[1]//a[text()='"+eventName+"']"));
        Assert.assertTrue(eventInActivityStream.isDisplayed());
    }

    // DD/MMMM/YYYY format
    public void selectDate(String date) throws InterruptedException {

        String day;
        String month;
        String year;

        String todayAsString;
        String tomorrowAsString;
        String yesterdayAsString;

        if (date.equals("tomorrow")){

            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            Date tomorrow = calendar.getTime();

            tomorrowAsString = new SimpleDateFormat("dd/MMMM/yyyy").format(tomorrow);

            String[] dateArr = tomorrowAsString.split("/");

            day=dateArr[0];
            month=dateArr[1];
            year=dateArr[2];

        } else if (date.equals("today")) {

            Calendar calendar = Calendar.getInstance();
            Date today = calendar.getTime();
            todayAsString = new SimpleDateFormat("dd/MMMM/yyyy").format(today);

            String[] dateArr = todayAsString.split("/");

            day=dateArr[0];
            month=dateArr[1];
            year=dateArr[2];

        } else if (date.equals("yesterday")) {

            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, -1);
            Date yesterday = calendar.getTime();

            yesterdayAsString = new SimpleDateFormat("dd/MMMM/yyyy").format(yesterday);

            String[] dateArr = yesterdayAsString.split("/");

            day=dateArr[0];
            month=dateArr[1];
            year=dateArr[2];

        } else {

            String[] dateArr = date.split("/");

            day=dateArr[0];
            month=dateArr[1];
            year=dateArr[2];
        }

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
            if (!actualAmPm.equalsIgnoreCase(amPm))
                startTimeAmPmPicker.click();

        } else if (timeType.equals("end")) {
            String actualAmPm = endTimeAmPmPicker.getText();
            if (!actualAmPm.equalsIgnoreCase(amPm))
                endTimeAmPmPicker.click();
        }
    }

    public void deleteEventFromEventMenu(){
        deleteEventButtonOnEventMenu.click();
        Driver.getDriver().switchTo().alert().accept();

    }

    public void deleteEventFromActivityStream(){

        try{
            moreButton.click();
            deleteOptionInMorePopupMenu.click();
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public String getTodaysDate(){

        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        String todayAsString = new SimpleDateFormat("MM/dd/yyyy").format(today);
        return todayAsString;
    }

    public void selectReminderTimeUnit(String timeUnit){

        Select select = new Select(setReminderTimeTypeDropdown);
        switch (timeUnit){
            case "minutes":
                BrowserUtils.waitForElementPresent("//option[@value='min']", 2);
                select.selectByValue("min");
                break;
            case "hours":
                BrowserUtils.waitForElementPresent("//option[@value='hour']", 2);
                select.selectByValue("hour");
                break;
            case "days":
                BrowserUtils.waitForElementPresent("//option[@value='day']", 2);
                select.selectByValue("day");
                break;
        }
    }


    @FindBy(xpath = "(//div[contains(@id, 'log_entry_inform')])[1]//span[text()='More']")
    public WebElement moreButton;
    @FindBy(xpath = "//div[@class='menu-popup-items']//span[text()='Delete']")
    public WebElement deleteOptionInMorePopupMenu;

    @FindBy(xpath = "//div[@class='feed-add-error']//span[@class='feed-add-info-text']")
    public WebElement errorMessage;
    @FindBy(xpath = "//span[@data-bx-calendar-view='month']")
    public WebElement monthlyViewOptionForCalender;


    @FindBy(xpath = "//span[text()='new event']")
    public WebElement eventElementOnCalender;

    @FindBy(xpath = "//span[text()='Open']")
    public WebElement openEventButtonInCalenderPage;
    @FindBy(xpath = "//span[@class='calendar-slider-sidebar-remind-warning-name']")
    public WebElement reminderTextInEventPage;
    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteEventButtonOnPopUpMenuOnCalendar;

    @FindBy(xpath = "(//div[@class='feed-post-title-block'])[1]/div")
    public List<WebElement> listOfContainersOfFirstElementInActivityStream;

    public void verifyReminderIsNotPresentOnEventMenu(){
        List<WebElement> webElementList = Driver.getDriver().findElements(By.xpath("//div[@class='calendar-slider-sidebar-inner']/div"));
        Assert.assertEquals(1, webElementList.size());
    }

    public void selectMeetingLocation(String location){

        eventLocationDropdown.click();
        switch (location){
            case "Central Meeting Room":
                centralMeetingRoomOption.click();
                break;
            case "East Meeting Room":
                eastMeetingRoomOption.click();
                break;
            case "West Meeting Room":
                westMeetingRoomOption.click();
                break;

        }
    }

    public void createNewEvent(String startTime, String endTime, String location) throws InterruptedException {

        eventName.sendKeys("new event");

        eventStartTimeBox.click();
        selectTime(startTime, "start");

        eventEndTimeBox.click();
        selectTime(endTime, "end");

        selectMeetingLocation(location);

        messageTabPage.sendButton.click();
    }














}
