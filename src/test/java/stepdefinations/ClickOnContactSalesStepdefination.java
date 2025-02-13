package stepdefinations;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import pages.MondayWebsite.ExploreWebsite.ContactSalesMenu;
import utils.WaitUtils;

public class ClickOnContactSalesStepdefination extends BaseTest {

    ContactSalesMenu contactMenuResources=new ContactSalesMenu(driver);

    @Given("we are on landing page")
    public void we_are_on_landing_page() {
        WaitUtils.globalWait();
    }
    @When("I will click on ContactMenu")
    public void i_will_click_on_contact_menu() {

        contactMenuResources.contactMenu.click();
    }
    @Then("I will go to contact page")
    public void i_will_go_to_contact_page() {

        logger.info("We are on Contact page");


    }
    @Then("I will enter firstname in namefield {string}")
    public void i_will_enter_firstname_in_namefield(String string) {
            contactMenuResources.firstName.sendKeys(string);

    }

    @Then("I will enter lastname in lastnamefield {string}")
    public void i_will_enter_lastname_in_lastnamefield(String string) {

        WaitUtils.globalWait();
        contactMenuResources.lastName.sendKeys(string);

    }
    @Then("I will enter work email {string} ,job title {string}")
    public void i_will_enter_work_email_job_title(String string, String string2) {

        contactMenuResources.email.sendKeys(string);
        contactMenuResources.job_title.sendKeys(string2);


    }
    @Then("I wil enter phone number")
    public void i_wil_enter_phone_number() {
        WaitUtils.globalWait();
        contactMenuResources.phoneNumber.sendKeys("234786987");
    }
    @Then("I will enter company name {string}")
    public void i_will_enter_company_name(String string) throws InterruptedException {

        contactMenuResources.companytitle.sendKeys(string);



    }
    @Then("I will select company size")
    public void i_will_select_company_size() throws InterruptedException {


        contactMenuResources.companysizedropdown.click();
        contactMenuResources.companysizeOption.click();

    }

    @Then("I will select skills")
    public void i_will_select_skills() throws InterruptedException {


        WaitUtils.applyWait(driver,contactMenuResources.skillsdropdown, WaitStrategy.CLICKABLE);
        contactMenuResources.skillsdropdown.click();


        contactMenuResources.skillOption1.click();
        contactMenuResources.skillOption2.click();

    }
    @Then("I will wirte some information")
    public void i_will_wirte_some_information() {

        contactMenuResources.textarea.sendKeys("OK , SO THis TEST IS GOING GOOD");
    }
    @Then("I will click on submit")
    public void i_will_click_on_submit() throws InterruptedException {
        Thread.sleep(3000);

     //   Actions actions=new Actions(driver);
      //  actions.moveToElement(contactMenuResources.submitBtn);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", contactMenuResources.submitBtn);


        Thread.sleep(6000);
    }

}
