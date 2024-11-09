package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAndLogoutPage extends BasePage{

    @FindBy(xpath = "//button[text()=\" Login \"]")
    WebElement loginButton;

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement usernameInput;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement passwordInput;

    @FindBy(xpath = "//span[@class=\"oxd-userdropdown-tab\"]")
    WebElement profileHamburger;

    @FindBy(xpath = "//a[text()=\"Logout\"]")
    WebElement logoutOption;


    public void openWebsite(){
        driver.get(ConfigReader.getConfig("application.url"));
    }

    public void doLogin(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void doLogout(){
        profileHamburger.click();
        logoutOption.click();
    }

}
