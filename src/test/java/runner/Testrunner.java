package runner;
import  io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue="stepdefinations"


)

public class Testrunner extends AbstractTestNGCucumberTests{



}
