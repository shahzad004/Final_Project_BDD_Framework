package stepdefinations;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.MondayWebsite.ExploreWebsite.LoginMenu;
import utils.WaitUtils;

public class ClickonLoginMenustepdefinations extends BaseTest {

    LoginMenu loginResource = new LoginMenu(driver);

    @Given("I am at main page")
    public void i_am_at_main_page() {
        WaitUtils.globalWait();
    }

    @When("I will click on loginMenu")
    public void i_will_click_on_login_menu() {
        loginResource.loginButton.click();
    }

    @When("I will be in loginpage")
    public void i_will_be_in_loginpage() {
        String expectedURL = "https://auth.monday.com/auth/login_monday/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "URL IS NOT SAME");
    }

    @Then("I will enter my email {string}")
    public void i_will_enter_my_email(String email) {
        WaitUtils.applyWait(driver, loginResource.emailField, WaitStrategy.CLICKABLE);
        loginResource.emailField.sendKeys(email);
    }

    @Then("I will click on continue")
    public void i_will_click_on_continue() throws InterruptedException {
        Thread.sleep(20000);
        WaitUtils.applyWait(driver, loginResource.nextbtn, WaitStrategy.CLICKABLE);

        Actions actions = new Actions(driver);
        actions.moveToElement(loginResource.nextbtn).click().perform();




    }

    @Then("I will enter my password {string}")
    public void i_will_enter_my_password(String password) throws InterruptedException {
        WaitUtils.globalWait();

        logger.info("Password Field is VISIBLE");

        loginResource.passField.sendKeys(password);
    }

    @Then("I will click on next")
    public void i_will_click_on_next() throws InterruptedException {
        // Debugging: Print button state
        System.out.println("Is Next Button Displayed: " + loginResource.nextlogin.isDisplayed());
        System.out.println("Is Next Button Enabled: " + loginResource.nextlogin.isEnabled());

        // Wait for the button to be clickable and click it
        WaitUtils.applyWait(driver, loginResource.nextlogin, WaitStrategy.CLICKABLE);
        loginResource.nextlogin.click();

        // Wait for the next page to load
        WaitUtils.globalWait();

        // Verify the URL of the next page
        String expectedURL = "https://auth.monday.com/auth/login_monday/dashboard"; // Update with the actual URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "URL IS NOT SAME");
    }
}