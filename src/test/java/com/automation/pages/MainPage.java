package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[text()=\"Admin\"]")
    WebElement adminTab;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    WebElement addUserBtn;

    @FindBy(xpath = "//label[text()=\"User Role\"]/ancestor::div[@class=\"oxd-input-group__label-wrapper\"]/following-sibling::div//div[@class=\"oxd-select-text-input\"]")
    WebElement userRoleSelectDropdown;

    @FindBy(xpath = "//div[@class=\"oxd-select-option\"][3]")
    WebElement userRoleEss;

    @FindBy(xpath = "//label[text()=\"Status\"]/ancestor::div[@class=\"oxd-input-group__label-wrapper\"]/following-sibling::div//div[@class=\"oxd-select-text-input\"]")
    WebElement userStatusSelectDropdown;

    @FindBy(xpath = "//div[@class=\"oxd-select-option\"][2]")
    WebElement userStatusEnabled;

    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    WebElement EmployeeNameField;

    @FindBy(xpath = "//div[@class=\"oxd-autocomplete-option\"]")
    WebElement EmployeeNameFieldOption;

    @FindBy(xpath = "//label[text()=\"Username\"]/parent::div/following-sibling::div[@data-v-957b4417]//input[@data-v-1f99f73c]")
    WebElement usernameField;

    @FindBy(xpath = "//label[text()=\"Password\"]/parent::div/following-sibling::div[@data-v-957b4417]//input[@data-v-1f99f73c]")
    WebElement passwordField;

    @FindBy(xpath = "//label[text()=\"Confirm Password\"]/parent::div/following-sibling::div[@data-v-957b4417]//input[@data-v-1f99f73c]")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//button[text()=\" Save \"]")
    WebElement saveUserbtn;

    @FindBy(xpath = "//div[@class=\"oxd-toast-content oxd-toast-content--success\"]")
    WebElement successToast;

    @FindBy(xpath = "//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/div/input[@class=\"oxd-input oxd-input--active\"]")
    WebElement usernameSearchInput;

    @FindBy(xpath = "//button[text()=\" Search \"]")
    WebElement userSearchBtn;

    @FindBy(xpath = "//h5[text()=\"System Users\"]")
    WebElement systemUsersHeading;

    @FindBy(xpath = "//div[text()=\"john_fleming_6\"]")
    WebElement usernameInDb;

    @FindBy(xpath = "//i[@class=\"oxd-icon bi-trash\"]")
    WebElement deleteUserBtn;

    @FindBy(xpath = "//button[text()=\" Yes, Delete \"]")
    WebElement confirmDeleteUserBtn;






    public void clickOnAdmin(){
        adminTab.click();
    }

    public void clickOnAddUserBtn(){
        addUserBtn.click();
    }

    public void fillUserInfo() throws InterruptedException {
        userRoleSelectDropdown.click();
        userRoleEss.click();
        userStatusSelectDropdown.click();
        userStatusEnabled.click();
        EmployeeNameField.sendKeys("Sarah  Stiglin");
        Thread.sleep(2000);
        EmployeeNameFieldOption.click();
        usernameField.sendKeys("john_fleming_6");
        passwordField.sendKeys("@Adad2313");
        confirmPasswordField.sendKeys("@Adad2313");
    }

    public void clickOnSaveUser(){
        saveUserbtn.click();
    }

    public Boolean verifySuccessfulUserCreation(){
        return successToast.isDisplayed();
    }

    public void fillSearchUserInfo() throws InterruptedException {
        Assert.assertTrue(systemUsersHeading.isDisplayed());
        usernameSearchInput.sendKeys("john_fleming_6");
        userRoleSelectDropdown.click();
        userRoleEss.click();
        EmployeeNameField.sendKeys("Sarah  Stiglin");
        Thread.sleep(2000);
        EmployeeNameFieldOption.click();
        userStatusSelectDropdown.click();
        userStatusEnabled.click();
    }

    public void clickOnSearch(){
        userSearchBtn.click();
    }

    public Boolean verifyUserIsFound(){
        return usernameInDb.isDisplayed();
    }

    public void clickOnDelete(){
        deleteUserBtn.click();
    }

    public void clickOnConfirmDelete(){
        confirmDeleteUserBtn.click();
    }

    public Boolean verifyDeletedSuccessfullyMessageIsDisplayed(){
        return successToast.isDisplayed();
    }
}
