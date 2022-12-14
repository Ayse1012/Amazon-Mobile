package com.amazon.step_definitions;

import com.amazon.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @When("The user click on Get Started button")
    public void the_user_click_on_Get_Started_button() {

        loginPage.waitUntil(loginPage.dark);
        loginPage.dark.click();
        loginPage.getStarted.click();

    }

    @When("The user enters valid {string} and {string}")
    public void the_user_enters_valid_and(String username, String password) {

        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signIn.click();

    }

    @Then("The user should be on the main page")
    public void the_user_should_be_on_the_main_page() {

        Assert.assertTrue(loginPage.homeBtn.isDisplayed());


    }


}




