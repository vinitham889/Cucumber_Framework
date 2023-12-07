package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// @RunWith is used to run cucumber class
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Login1/Login1.feature"},
//glue is used to find the location and path of definition file
glue= {"stepdefinition"},

//dryRun is used to check all the methods are created from the feature file
dryRun = false,

//tags are used to execute specified test case
//tags="@NegativeTest",

//test report
plugin = {"html:testoutput/vini.html","junit:testoutput/sap.xml","json:testoutput/rio.json"})


public class TestRunner1 {

}
