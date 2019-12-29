package org.belt.allclasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Rajasekar\\Desktop\\the british belt factory\\Functional\\src\\test\\resources\\British.feature",
glue= {"org.belt.allclasses"},monochrome = true,dryRun = true,plugin = {"json:target/cucumber-reports1/Cucumber.json","rerun:rerun/failedScenarios.txt","html:target/cucumber-reports"},tags = {"~@one","@two"})
public class TestRunner {

}
