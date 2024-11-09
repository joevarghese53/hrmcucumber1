package com.automation.stepdefs;

import com.automation.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainSteps {

    MainPage mainPage = new MainPage();

    @When("user click on admin link")
    public void userClickOnAdminLink() {
        mainPage.clickOnAdmin();
    }

    @When("user click on add button")
    public void userClickOnAddButton() {
        mainPage.clickOnAddUserBtn();
    }

    @When("user fills in user data and save")
    public void userFillsInUserDataAndSave() throws InterruptedException {
        mainPage.fillUserInfo();
        mainPage.clickOnSaveUser();
    }

    @Then("verify success message is displayed")
    public void verifySuccessMessageIsDisplayed() {
        Assert.assertTrue(mainPage.verifySuccessfulUserCreation());
    }

    @When("user search with newly created user")
    public void userSearchWithNewlyCreatedUser() throws InterruptedException {
        mainPage.fillSearchUserInfo();
        mainPage.clickOnSearch();
    }

    @Then("verify newly created user displayed in search list")
    public void verifyNewlyCreatedUserDisplayedInSearchList() {
        Assert.assertTrue(mainPage.verifyUserIsFound());
    }

    @When("user deletes newly created user")
    public void userDeletesNewlyCreatedUser() {
        mainPage.clickOnDelete();
        mainPage.clickOnConfirmDelete();
    }

    @Then("verify Success Successfully Deleted message is displayed")
    public void verifySuccessSuccessfullyDeletedMessageIsDisplayed() {
        mainPage.verifyDeletedSuccessfullyMessageIsDisplayed();
    }
}
