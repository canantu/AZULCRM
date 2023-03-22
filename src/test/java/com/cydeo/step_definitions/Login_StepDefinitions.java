package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.azulcrm.com");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
    }

    @When("user clicks log-in button")
    public void user_clicks_log_in_button() {
        loginPage.loginButton.click();
    }
    @Then("user lands on homepage")
    public void user_lands_on_homepage() {
        String expectedTitle = "Portal";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user lands on login page")
    public void user_lands_on_login_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Authorization"));
    }

    @Then("user gets incorrect login message")
    public void user_gets_incorrect_login_message() {
        String expectedLoginErrorMessage = "Incorrect login or password";
        String actualLoginErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedLoginErrorMessage, actualLoginErrorMessage);
    }
    @When("user click forgot your password link")
    public void user_click_forgot_your_password_link() {
        loginPage.forgotPasswordLink.click();
    }
    @Then("forgot your password link is clickable")
    public void forgot_your_password_link_is_clickable() {
        Assert.assertTrue(loginPage.forgotPasswordLink.isEnabled());
    }

    @Then("user lands on get password page")
    public void user_lands_on_get_password_page() {
        Assert.assertTrue(loginPage.getPasswordHeader.getText().equals("Get Password"));
    }

    @Then("remember me text is displayed")
    public void remember_me_text_is_displayed() {
        Assert.assertTrue(loginPage.rememberText.isDisplayed());
    }

    @Then("user sees remember me checkbox")
    public void user_sees_remember_me_checkbox() {
        Assert.assertTrue(loginPage.rememberCheckbox.isDisplayed());
    }

    @When("user clicks remember me checkbox")
    public void user_clicks_remember_me_checkbox() {
        loginPage.rememberCheckbox.click();
    }
    @Then("checkbox is selected")
    public void checkbox_is_selected() {
        Assert.assertTrue(loginPage.rememberCheckbox.isSelected());
    }
    @Then("checkbox is unselected")
    public void checkbox_is_unselected() {
        Assert.assertTrue(!loginPage.rememberCheckbox.isSelected());
    }
    @Then("password is displayed in bullet signs")
    public void password_is_displayed_in_bullet_signs() {

    }
    @When("user presses enter key from keyboard")
    public void user_presses_enter_key_from_keyboard() {
        loginPage.passwordInputBox.sendKeys(Keys.ENTER);
    }

    @Then("username is displayed on homepage")
    public void username_is_displayed_on_homepage() {
        Assert.assertTrue(homePage.usernameOnProfile.isDisplayed());
    }


    @Then("user gets please fill out message")
    public void userGetsPleaseFillOutMessage() {
        String expectedMessage = "Please fill out this field";
        String actualMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
