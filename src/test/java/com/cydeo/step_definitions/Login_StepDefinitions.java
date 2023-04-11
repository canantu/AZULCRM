package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("user is on login page")
    public void user_is_on_login_page() {
        loginPage.navigateLoginPage();
    }

    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        loginPage.loginAsUser(userType);
    }


    @Then("user lands on homepage")
    public void user_lands_on_homepage() {
        String expectedTitle = "Portal";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String userName, String passWord) {
        loginPage.login(userName, passWord);
    }
    @Then("user gets error message")
    public void user_gets_error_message(String expectedMessage) {
        BrowserUtils.waitForVisibility(loginPage.errorMessage, 3);
        String actualMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("user lands on login page")
    public void user_lands_on_login_page() {
        String expectedTitle = "Authorization";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle );
    }


    @When("user click forgot your password link")
    public void user_click_forgot_your_password_link() {
        BrowserUtils.waitForClickable(loginPage.forgotPasswordLink, 3);
        loginPage.forgotPasswordLink.click();
    }
    @Then("user sees forgot your password link is displayed")
    public void forgot_your_password_link_is_displayed() {
        Assert.assertTrue(loginPage.forgotPasswordLink.isEnabled());
    }

    @Then("user lands on get password page")
    public void user_lands_on_get_password_page() {
        String expectedHeader = "Get Password";
        BrowserUtils.waitForVisibility(loginPage.getPasswordHeader, 3);
        String actualHeader = loginPage.getPasswordHeader.getText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("user is able to see remember me text")
    public void remember_me_text_is_displayed() {
        Assert.assertTrue(loginPage.rememberText.isDisplayed());
    }

    @When("user clicks remember me checkbox")
    public void user_clicks_remember_me_checkbox() {
        loginPage.rememberCheckbox.click();
    }
    @Then("user sees checkbox is selected")
    public void checkbox_is_selected() {
        Assert.assertTrue(loginPage.rememberCheckbox.isSelected());
    }
    @Then("user sees checkbox is unselected")
    public void checkbox_is_unselected() {
        Assert.assertFalse(loginPage.rememberCheckbox.isSelected());
    }
    @Then("user sees password is displayed in bullet signs")
    public void password_is_displayed_in_bullet_signs() {
        BrowserUtils.wait(1);
        Assert.assertEquals( "password", loginPage.isBulletSign());
    }
    @When("user presses enter key from keyboard")
    public void user_presses_enter_key_from_keyboard() {
        loginPage.passwordInputBox.sendKeys(Keys.ENTER);
    }

    @Then("user sees username is displayed on homepage")
    public void username_is_displayed_on_homepage() {
        Assert.assertTrue(homePage.usernameOnProfile.isDisplayed());
    }


    @When("user enters {string} to username field")
    public void user_enters_to_username_field(String text) {
        loginPage.enterTextToUsernameField(text);
    }

    @When("user enters {string} to password field")
    public void user_enters_to_password_field(String text) {
        loginPage.enterTextToPasswordField(text);
    }



}
