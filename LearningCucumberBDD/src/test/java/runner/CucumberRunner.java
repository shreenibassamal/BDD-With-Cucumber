package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"./src/test/java/features"},glue= {"stepDefinations"},
plugin= {"html:reports/CucumberReports.html",
		"json:reports/CucumberJSONReport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CucumberRunner extends AbstractTestNGCucumberTests{
}
