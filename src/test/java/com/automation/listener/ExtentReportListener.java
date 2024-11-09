package com.automation.listener;

import com.automation.utils.DriverManager;
import com.automation.utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ExtentReportListener {

    private ExtentReports extentReports;
    private ExtentTest extentTest;

    @Before
    public void beforeScenario(Scenario scenario) {
        extentReports = ExtentReportManager.getExtentReports();
        extentTest = extentReports.createTest(scenario.getName());
    }

    @AfterStep
    public void afterEachStep(Scenario scenario) {
        if (scenario.isFailed()) {
            extentTest.log(Status.FAIL, "step failed");
            extentTest.log(Status.INFO, "Screenshot", MediaEntityBuilder.createScreenCaptureFromBase64String(DriverManager.takeScreenshotAsBase64()).build());
        } else {
            extentTest.log(Status.PASS, "passed");
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            extentTest.log(Status.FAIL, "step failed");
            extentTest.log(Status.INFO, "Screenshot", MediaEntityBuilder.createScreenCaptureFromBase64String(DriverManager.takeScreenshotAsBase64()).build());
        } else {
            extentTest.log(Status.PASS, "passed");
        }
        extentReports.flush();
    }
}