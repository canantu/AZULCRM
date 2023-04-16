package com.cydeo.step_definitions;

import com.cydeo.pages.EventPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Jiranic3_US04_EventTab_StepDefinitions {

    EventPage eventPage = new EventPage();
    @Given("user clicks Event menu")
    public void user_clicks_event_menu() {
        eventPage.eventTab.click();
    }

    @When("user enters event name {string}")
    public void user_enters_event_name(String event_name) {
        eventPage.eventName.sendKeys(event_name);
    }
    @When("user selects event start date as {string}")
    public void user_selects_event_start_date_as(String startDate) throws InterruptedException {
        eventPage.eventStartDate.click();
        eventPage.selectDate(startDate);
    }
    @When("user selects event start time as {string}")
    public void user_selects_event_start_time_as(String startTime) throws InterruptedException {
        eventPage.eventStartTimeBox.click();
        eventPage.selectTime(startTime, "start");

    }
    @When("user selects event end date as {string}")
    public void user_selects_event_end_date_as(String endDate) throws InterruptedException {
        eventPage.eventEndDate.click();
        eventPage.selectDate(endDate);
    }
    @When("user selects event end time as {string}")
    public void user_selects_event_end_time_as(String endTime) throws InterruptedException {
        eventPage.eventEndTimeBox.click();
        eventPage.selectTime(endTime, "end");
    }

    @Then("user sees created event {string} item in Activity Stream")
    public void user_sees_created_event_item_in_activity_stream(String event_name) {
        eventPage.verifyEventCreatedWithName(event_name);
        eventPage.deleteEventFromActivityStream();
    }

    @When("user selects All day checkbox")
    public void user_selects_all_day_checkbox() {
       eventPage.allDayCheckbox.click();
    }
    @Then("user sees all day checkbox is selected")
    public void user_sees_all_day_checkbox_is_selected() {
        Assert.assertTrue(eventPage.allDayCheckbox.isSelected());
    }
    @Then("user sees time select boxes disappear")
    public void user_sees_time_select_boxes_disappear() {
            Assert.assertTrue(!eventPage.eventStartTimeBox.isDisplayed());
            Assert.assertTrue(!eventPage.eventEndTimeBox.isDisplayed());
    }

    @When("user clicks specify time zone")
    public void user_clicks_specify_time_zone() {
        eventPage.specifyTimeZone.click();
    }
    @When("use selects a time zone {string} for start time")
    public void use_selects_a_time_zone_for_start_time(String timezone) {
        Select select = new Select(eventPage.startTimezoneDropdown);
        select.selectByValue(timezone);
    }
    @When("user selects a time zone {string} for end time")
    public void user_selects_a_time_zone_for_end_time(String timezone) {
        Select select = new Select(eventPage.endTimezoneDropdown);
        select.selectByValue(timezone);
    }
    @Then("user sees different times zones are displayed for start and end date")
    public void user_sees_different_times_zones_are_displayed_for_start_and_end_date(List<String> timezoneList) {
        Assert.assertEquals(timezoneList.get(0), eventPage.startTimezoneDropdown.getAttribute("value"));
        Assert.assertEquals(timezoneList.get(1), eventPage.endTimezoneDropdown.getAttribute("value"));
    }


    @Then("user sees event start time {string} was displayed correctly in Activity Stream")
    public void user_sees_event_start_time_was_displayed_correctly_in_activity_stream(String time) {

            BrowserUtils.waitForVisibility(eventPage.eventTimeInActivityStream, 5);
            Assert.assertTrue(eventPage.eventTimeInActivityStream.getText().contains(time));
            eventPage.deleteEventFromActivityStream();
    }

    @Then("user gets {string} error message")
    public void user_gets_error_message(String errorMessageType) {

            Assert.assertTrue(eventPage.errorMessage.isDisplayed());

    }

    @Then("user deletes event from activity stream")
    public void user_deletes_event_from_activity_stream() {
        eventPage.deleteEventFromActivityStream();
    }

    @Then("user sees today's date is displayed as start date")
    public void user_sees_today_s_date_is_displayed_as_start_date() {
        BrowserUtils.waitForVisibility(eventPage.eventStartDate, 5);
        String actualDate = eventPage.eventStartDate.getAttribute("value");
        Assert.assertEquals(eventPage.getTodaysDate(), actualDate);
    }
    @Then("user sees today's date is displayed as end date")
    public void user_sees_today_s_date_is_displayed_as_end_date() {
        BrowserUtils.waitForVisibility(eventPage.eventEndDate, 5);
        String actualDate = eventPage.eventEndDate.getAttribute("value");
        Assert.assertEquals(eventPage.getTodaysDate(), actualDate);
    }

    @Then("user sees set reminder checkbox is selected")
    public void user_sees_set_reminder_checkbox_is_selected() {
        Assert.assertTrue(eventPage.setReminderCheckbox.isSelected());
    }
    @When("user enters reminder time as {string}")
    public void user_enters_reminder_time_as(String reminderTime) {
        BrowserUtils.waitForVisibility(eventPage.setReminderCount, 2);
        eventPage.setReminderCount.clear();
        eventPage.setReminderCount.sendKeys(reminderTime);
    }
    @When("user selects time unit {string}")
    public void user_selects(String timeUnit) {
        eventPage.selectReminderTimeUnit(timeUnit);
    }
    @When("user opens created event from Calender")
    public void user_opens_created_event_from_calender() {
        BrowserUtils.wait(1);
        eventPage.calendarMenu.click();
        eventPage.monthlyViewOptionForCalender.click();
        eventPage.eventElementOnCalender.click();
        eventPage.openEventButtonInCalenderPage.click();
    }
    @Then("user sees selected {string} is displayed on screen")
    public void user_sees_selected_is_displayed_on_screen(String reminder) {
        String actualReminderText = eventPage.reminderTextInEventPage.getText();
        Assert.assertEquals(reminder, actualReminderText);
        BrowserUtils.wait(1);
        eventPage.deleteEventFromEventMenu();

    }

    @When("user clicks set reminder checkbox")
    public void user_clicks_set_reminder_checkbox() {
        BrowserUtils.waitForClickable(eventPage.setReminderCheckbox,2);
        eventPage.setReminderCheckbox.click();
    }
    @Then("user sees reminder checkbox is unselected")
    public void user_sees_reminder_checkbox_is_unselected() {
        Assert.assertFalse(eventPage.setReminderCheckbox.isSelected());
    }

    @Then("user sees no reminder is displayed on screen")
    public void user_sees_no_reminder_is_displayed_on_screen() {
        eventPage.verifyReminderIsNotPresentOnEventMenu();
        eventPage.deleteEventFromEventMenu();
    }

    @When("user selects event location {string}")
    public void user_selects_event_location(String location) {
        eventPage.selectMeetingLocation(location);
    }

    @When("user creates an event with {string} time, {string} time and {string}")
    public void user_creates_an_event_with_time_time_and(String startTime, String endTime, String location) throws InterruptedException {
        eventPage.createNewEvent(startTime, endTime, location);
    }

    @When("user clicks Cancel button")
    public void user_clicks_cancel_button() {
        eventPage.cancelButton.click();
    }
    @Then("user sees no new event created")
    public void user_sees_no_new_event_created() {
        int size = eventPage.listOfContainersOfFirstElementInActivityStream.size();
        Assert.assertEquals(1, size);
    }
    @When("user clicks Add employee link")
    public void user_clicks_add_employee_link() {
       eventPage.addPersonsGroupsDepartmentsLink.click();
    }
    @When("user selects Employees and departments link")
    public void user_selects_employees_and_departments_link() {
        eventPage.employeesAndDepartmentsLink.click();
    }
    @When("user selects a {string} and closes the menu")
    public void user_selects_a_and_closes_the_menu(String member) {
        switch (member){
            case "helpdesk22@cybertekschool.com":
                eventPage.helpdesk22User.click();
                break;
            case "QA Department":
                eventPage.qaDepartmentLink.click();
                eventPage.allDepartmentEmployeesCheckbox.click();
                break;

        }

        eventPage.closeEmployeeSelectMenu.click();
    }










}
