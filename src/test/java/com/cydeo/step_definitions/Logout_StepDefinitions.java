package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class Logout_StepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @When("user clicks previous button in browser")
    public void user_clicks_previous_button_in_browser() {
        Driver.getDriver().navigate().back();
    }


    @When("user clicks logout option from profile menu")
    public void user_clicks_logout_option_from_profile_menu() {
        homePage.logout();
    }

    @And("user navigates to home page")
    public void userNavigatesToHomePage() {

        homePage.navigateToHomePage();
    }

    @When("user closes all open tabs")
    public void userClosesAllOpenTabs() {
        Driver.closeDriver();
    }
}
