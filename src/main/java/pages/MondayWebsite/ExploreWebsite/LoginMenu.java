package pages.MondayWebsite.ExploreWebsite;

import enums.WaitStrategy;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class LoginMenu {

    public WebDriver driver;

    public LoginMenu(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

// Elements
    @FindBy(xpath = "//a[@role='link'][normalize-space()='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailField;


    @FindBy(xpath = "//button[@aria-label='Next']")
    public WebElement nextbtn;


    @FindBy(xpath = "//input[@id='user_password']")
    public  WebElement passField;


    @FindBy(xpath = "//button[@aria-label='Log in']")
    public WebElement nextlogin;


    public void checkLogin() throws InterruptedException {


        WaitUtils.globalWait();
        loginButton.click();

        emailField.sendKeys("shahzadkhan07874@gmail.com");
        Thread.sleep(10000);

        WaitUtils.applyWait(driver, nextbtn, WaitStrategy.CLICKABLE);
        nextbtn.click();
        Thread.sleep(10000);
        WaitUtils.globalWait();



        try {
            WaitUtils.applyWait(driver,passField,WaitStrategy.PRESENCE);
            passField.sendKeys("Monday!@#4");
            System.out.println("safe here as well");


        } catch (TimeoutException e) {
            System.out.println("Error: Next button was not clickable within the timeout");
        }


        System.out.println("After the password");
        Thread.sleep(200);
        nextlogin.click();
    }
}
