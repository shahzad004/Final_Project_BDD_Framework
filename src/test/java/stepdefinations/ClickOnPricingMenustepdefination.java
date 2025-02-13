package stepdefinations;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.MondayWebsite.ExploreWebsite.PricingMenu;
import utils.WaitUtils;

public class ClickOnPricingMenustepdefination extends BaseTest {


    PricingMenu pricingMenu = new PricingMenu(driver);

    @Given("monday com website")
     public void monday_com_website(){

        WaitUtils.globalWait();
    }

    @When("I will click on Pricing Menu")
    public void i_will_click_on_pricing_menu() {

        pricingMenu.pricing.click();

    }
    @Then("It will take me to the Pricing Link")
    public void it_will_take_me_to_the_pricing_link() {

        WaitUtils.globalWait();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://monday.com/pricing";

        Assert.assertEquals(actualURL,expectedURL,"URL IS NOT SAME");

    }
}
