package stepdefinations;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.MondayWebsite.ExploreWebsite.ResourcesMenu;
import pages.MondayWebsite.ExploreWebsite.SolutionMenu;
import utils.WaitUtils;



public class ClickOnSolutionMenustepdefination extends BaseTest {

    SolutionMenu solutionResource= new SolutionMenu(driver);


    @Given("I am on site")
    public void i_am_on_site() {
        WaitUtils.globalWait();
    }

    @When("I will click on Solution Menu")
    public void i_will_click_on_solution_menu() {

        solutionResource.solutionMenu.click();

    }
    @Then("I will click on HR link")
    public void i_will_click_on_hr_link() {
        WaitUtils.globalWait();
        solutionResource.hrLink.click();

    }
    @Then("it should take me to that page")
    public void it_should_take_me_to_that_page() {

        String actualURL= driver.getCurrentUrl();
        String expectedURL = "https://monday.com/use-cases/hr-management-software";

        Assert.assertEquals(actualURL,expectedURL,"URL are not matched");


    }



}
