package stepdefinations;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MondayWebsite.ExploreWebsite.ResourcesMenu;
import utils.WaitUtils;

public class VerifyWebsiteURLStepdefination extends BaseTest {


    ResourcesMenu exploreResource =new ResourcesMenu(driver);

    @Given("I am on Monday.com page")
    public void i_am_on_monday_com_page() {
        System.out.println("I am on monday.com page");
        WaitUtils.globalWait();
    }
    @When("I click on resources button")
    public void i_click_on_resources_button() {


        exploreResource.resourcesMenu.click();

    }

    @Then("I will refresh the window")
    public void i_will_refresh_the_window() {

        driver.navigate().refresh();
    }
    @Then("I will get the window URL")
    public void i_will_get_the_window_url() {

        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedURl ="https://monday.com/";

        Assert.assertEquals(currentUrl , expectedURl, "Url is not Matched");

    }


}
