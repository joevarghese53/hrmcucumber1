package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = {
        "src/test/resources/features/test1.feature",
},
        glue = {"com.automation.stepdefs", "com.automation.listener"},
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
@RunWith(Cucumber.class)
public class TestRunner {
}
