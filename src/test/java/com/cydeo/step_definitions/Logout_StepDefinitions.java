package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;

public class Logout_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @When("user clicks username on profile menu")
    public void user_clicks_username_on_profile_menu() {
        homePage.usernameOnProfile.click();
    }

    @When("user clicks log-out option")
    public void user_clicks_log_out_option() {
        homePage.logoutOption.click();
    }

    @When("user clicks previous button")
    public void user_clicks_previous_button() {
        Driver.getDriver().navigate().back();
    }

    @When("user closes tab")
    public void user_closes_tab() {
        Driver.getDriver().close();
    }

    @When("user opens a new tab and navigate to login page")
    public void user_opens_a_new_tab_and_navigate_to_login_page() {
        Driver.getDriver().get("https://qa.azulcrm.com");
    }

    @When("user clicks logout option from profile menu")
    public void user_clicks_logout_option_from_profile_menu() {
        homePage.logout();
    }



}
