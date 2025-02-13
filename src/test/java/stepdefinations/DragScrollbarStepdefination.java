package stepdefinations;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import utils.WaitUtils;

public class DragScrollbarStepdefination extends BaseTest {

         JavascriptExecutor js=(JavascriptExecutor) driver;


    @Given("landingPage")
    public void landingPage() {
        WaitUtils.globalWait();
    }
    @When("I scroll down")
    public void i_scroll_down() {

      js.executeScript("window.scrollTo(0, 5000);");

    }
    @When("I scroll up")
    public void i_scroll_up() {
        WaitUtils.globalWait();
        js.executeScript("window.scrollBy(0,-4000);");

    }
    @Then("I should see the top content")
    public void i_should_see_the_top_content() {
        WaitUtils.globalWait();
        js.executeScript("window.scrollBy(0,2000);");
    }

}
