package stepdefinations;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Wait;
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
          String expectedURL= "https://auth.monday.com/auth/login_monday/";
          String actualURL= driver.getCurrentUrl();

        Assert.assertEquals(actualURL,expectedURL, "URL IS NOT SAME");


    }
    @Then("I will enter my email {string}")
    public void i_will_enter_my_email(String string) {
            WaitUtils.applyWait(driver,loginResource.emailField,WaitStrategy.CLICKABLE);
            loginResource.emailField.sendKeys(string);
    }
    @Then("I will click on continou")
    public void i_will_click_on_continou() throws InterruptedException {
            loginResource.nextbtn.click();

        Thread.sleep(5000);
    }
    @Then("I will enter my password {string}")
    public void i_will_enter_my_password(String string) {

        String expectedURL= "https://auth.monday.com/auth/login_monday/email_password";
        String actualURL= driver.getCurrentUrl();

        Assert.assertEquals(actualURL,expectedURL, "URL IS NOT SAME");



        logger.info("Password Field is VISIBLE");
        WaitUtils.applyWait(driver,loginResource.passField,WaitStrategy.VISIBLE);
         loginResource.passField.sendKeys(string);
    }
    @Then("I will click on next")
    public void i_will_click_on_next() {

        WaitUtils.globalWait();
        loginResource.nextlogin.click();
    }






}
