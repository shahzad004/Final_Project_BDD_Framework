package stepdefinations;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.en.*;
import pages.MondayWebsite.ExploreWebsite.SignupPage;
import utils.WaitUtils;

public class Signupstepdefination extends BaseTest {

    SignupPage signupResource = new SignupPage(driver);


    @Given("I am on signup area")
    public void i_am_on_signup_area() {
        WaitUtils.globalWait();


    }
    @When("I will click on getStarted")
    public void i_will_click_on_get_started() {
        SignupPage signupResource = new SignupPage(driver);
        signupResource.getStartedButton.click();
    }


    @Then("my email {string}")
    public void my_email(String string) throws InterruptedException{
        WaitUtils.applyWait(driver,signupResource.emailField, WaitStrategy.VISIBLE);
        signupResource.emailField.sendKeys(string);
        signupResource.continueBtn.click();
        Thread.sleep(3000);



    }
    @Then("I will enter details {string}, {string}, {string}")
    public void i_will_enter_details(String string, String string2, String string3) {

        signupResource.fullName.sendKeys(string);
        signupResource.password.sendKeys(string2);
        signupResource.accountName.sendKeys(string3);

        WaitUtils.globalWait();
        signupResource.continueButton.click();

    }




}
