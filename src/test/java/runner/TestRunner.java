package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "src/test/java/resource/feature/Test.feature", 
glue = {"stepdefinition" }, 
dryRun = false, 
monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}

