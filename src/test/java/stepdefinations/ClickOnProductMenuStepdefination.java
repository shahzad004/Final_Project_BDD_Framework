package stepdefinations;

import base.BaseTest;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.MondayWebsite.ExploreWebsite.ProductMenu;
import pages.MondayWebsite.ExploreWebsite.ResourcesMenu;
import utils.WaitUtils;

public class ClickOnProductMenuStepdefination extends BaseTest {

   public ProductMenu productResource;

    @Before
    public void prepare() {
            setup();
        this.productResource=  new ProductMenu(driver);
    }

    @Given("I am on Home Page")
    public void i_am_on_home_page() {
        System.out.println("Home page is here");
    }


    @When("I will click on Accept cookies if I got Option")
    public void i_will_click_on_accept_cookies_if_i_got_option() {
        if(productResource.cookiesButton.isDisplayed()){
            productResource.cookiesButton.click();
            System.out.println("Clicked on cookies");
        }

    }

    @Then("I will click product Menu")
    public void i_will_click_product_menu() {
        WaitUtils.globalWait();
        System.out.println("Product");
        productResource.productMenu.click();
    }

    @Then("I will click on Automation")
    public void i_will_click_on_automation() throws InterruptedException {
        WaitUtils.globalWait();
        productResource.automationButton.click();
        Thread.sleep(6000);

    }
    @Then("I will go back")
    public void i_will_go_back() {
        driver.navigate().refresh();
        System.out.println("DOne");
    }

    @After
    public void tearDown(){
        super.tearDown();
    }

}
