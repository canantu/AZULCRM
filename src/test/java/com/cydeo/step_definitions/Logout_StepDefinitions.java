package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Logout_StepDefinitions {

    HomePage homePage = new HomePage();


    @When("user clicks previous button in browser")
    public void user_clicks_previous_button_in_browser() {
        Driver.getDriver().navigate().back();
    }

    @When("user closes all open tabs")
    public void user_closes_all_open_tabs() {
        // open one empty tab
        BrowserUtils.openNewTab();

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        List<String> allOpenTabs = new ArrayList<>(windowHandles);

        // only one empty browser will be open to not get NoSuchSessionException
        for (int i = 0; i < allOpenTabs.size()-1; i++) {
            Driver.getDriver().switchTo().window(allOpenTabs.get(i));
            Driver.getDriver().close();
        }

        BrowserUtils.switchToWindow(0);

    }

    @When("user clicks logout option from profile menu")
    public void user_clicks_logout_option_from_profile_menu() {
        homePage.logout();
    }


    @When("user navigates to {string} page")
    public void user_navigates_to_page(String page) {
        switch (page){
            case "login":
                Driver.getDriver().get("https://qa.azulcrm.com");
                break;
            case "homepage":
                Driver.getDriver().get("https://qa.azulcrm.com/stream/");
                break;
        }
    }



}
