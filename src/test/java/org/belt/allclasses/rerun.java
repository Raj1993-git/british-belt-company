package org.belt.allclasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun/failedScenarios.txt",glue="org.belt.allclasses")

public class rerun {

}
