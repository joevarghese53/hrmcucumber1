package com.automation.stepdefs;

import com.automation.pages.LoginAndLogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAndLogoutSteps {

    LoginAndLogoutPage loginAndLogoutPage = new LoginAndLogoutPage();

    @Given("user open website")
    public void user_open_website() {
        loginAndLogoutPage.openWebsite();
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        loginAndLogoutPage.doLogin(username, password);
    }

    @When("user logout")
    public void user_logout() {
        loginAndLogoutPage.doLogout();
    }

}
