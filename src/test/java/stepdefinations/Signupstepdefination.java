package stepdefinations;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.en.*;
import pages.MondayWebsite.ExploreWebsite.SignupPage;
import utils.WaitUtils;

import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Signupstepdefination extends BaseTest {

    SignupPage signupResource = new SignupPage(driver);


    @Given("I am on signup area")
    public void i_am_on_signup_area() {
        WaitUtils.globalWait(); // Wait for the page to load
    }

    @When("I will click on getStarted")
    public void i_will_click_on_get_started() {
        SignupPage signupResource = new SignupPage(driver);
        signupResource.getStartedButton.click(); // Click the "Get Started" button
    }

    @Then("my email {string}")
    public void my_email(String email) throws InterruptedException {
        SignupPage signupResource = new SignupPage(driver);

        // Wait for the email field to be visible and enter the email
        WaitUtils.applyWait(driver, signupResource.emailField, WaitStrategy.VISIBLE);
        signupResource.emailField.sendKeys(email);
        signupResource.continueBtn.click(); // Click the "Continue" button

        // Wait for the CAPTCHA to appear (if applicable)
                WaitUtils.applyWait(driver,signupResource.recaptchaIframe,WaitStrategy.PRESENCE);
        Thread.sleep(7000);
                driver.switchTo().frame(signupResource.recaptchaIframe);
        System.out.println("switched to iframe");
                WaitUtils.applyWait(driver,signupResource.captcha,WaitStrategy.PRESENCE);
        System.out.println("Captcha is here as well");


                    System.out.println("CAPTCHA is enabled. Please solve it manually.");


                    signupResource.emailField.sendKeys(email);
                    System.out.println("Please solve the CAPTCHA manually, and then press Enter in the console to continue.");

                    Thread.sleep(35000);

                    System.out.println("CAPTCHA solved. Resuming the test...");

        driver.switchTo().defaultContent();
        System.out.println("Frame Changed");

        // Click the "Continue" button again after CAPTCHA is solved
        signupResource.continueBtn.click();
    }

    @Then("I will enter details {string}, {string}, {string}")
    public void i_will_enter_details(String fullName, String password, String accountName) {
        SignupPage signupResource = new SignupPage(driver);

        // Enter user details
        signupResource.fullName.sendKeys(fullName);
        signupResource.password.sendKeys(password);
        signupResource.accountName.sendKeys(accountName);

        // Wait for the next step (if needed)
        WaitUtils.globalWait();
    }


}
