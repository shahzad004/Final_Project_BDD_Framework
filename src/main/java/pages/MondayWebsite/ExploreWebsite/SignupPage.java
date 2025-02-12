package pages.MondayWebsite.ExploreWebsite;

import enums.WaitStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

import java.security.PublicKey;

public class SignupPage {

    public WebDriver driver;

    public SignupPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='header-button-wrapper']//span[@class='signup-text'][normalize-space()='Get Started']")
    public  WebElement getStartedButton;

    @FindBy(xpath = "//input[contains(@id,'user')]")
    public WebElement emailField;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement continueBtn;


    @FindBy(xpath = "//input[@placeholder='Enter your full name']")
    public WebElement fullName;


    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='account[name]']")
    public  WebElement accountName;

    @FindBy(xpath = "//button[@data-testid='submit-button']")
    public WebElement continueButton;




    public void signUpTest(){

        WaitUtils.globalWait();
        getStartedButton.click();

        WaitUtils.applyWait(driver,emailField,WaitStrategy.CLICKABLE);
        emailField.sendKeys("Shahzad.Paktiawal@tekschool.us");

        continueBtn.click();
        WaitUtils.globalWait();
    }












}
