package com.cydeo.step_definitions;

import com.cydeo.pages.EventPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        eventPage.verifyEventCreated(event_name);
    }



}
