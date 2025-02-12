package pages.MondayWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GetReportFromWebsite {

    public WebDriver driver;

    public GetReportFromWebsite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[contains(text(),\"Accept all cookies\")]")
    public WebElement cookiesButton;


    @FindBy(xpath = "//div[@class='banner-cta-wrapper']//a")
    public WebElement getReportbutton;

    @FindBy(xpath = "//div[text()='Get the Report']")
    public WebElement getReportBtnSecondPage;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement formfn;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement formln;

    @FindBy(xpath = "//input[@name='jobtitle']")
    public WebElement formJobtitle;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement formEmail;

    @FindBy(xpath = "//input[@type='submit'][  @value='Get the Report']")
    public WebElement submitBtn;


    public void checkCookiesButton() {

        WaitUtils.globalWait();
        if (cookiesButton.isDisplayed()) {
            cookiesButton.click();
        }
    }

    public String getParentwindowId() {
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent windwo Id:" + parentWindow);
        return parentWindow;
    }


    public void clickOnGetReport() {
        getReportbutton.click();
        WaitUtils.globalWait();
    }


    public String childwindowId() {

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String windowId = iterator.next();
            if (!windowId.equals(getParentwindowId())) {
                driver.switchTo().window(windowId);
            }
        }
        String childwindow = driver.getWindowHandle();
        return childwindow;

    }

    public void secondGetReportBtn(){
        getReportBtnSecondPage.click();
    }
            // the site does not support gmail. @icloud use @tech.us or something
    public void insertDate(String firtname, String lastname, String jobtitle, String email){
        formfn.sendKeys(firtname);
        formln.sendKeys(lastname);
        formJobtitle.sendKeys(jobtitle);
        formEmail.sendKeys(email);

    }

    public void clickSubmit(){
        submitBtn.click();
    }



}
