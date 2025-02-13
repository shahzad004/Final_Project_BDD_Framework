package pages.MondayWebsite.ExploreWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactSalesMenu {

    public WebDriver driver;

    public ContactSalesMenu(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'Contact sales')]")
    public WebElement contactMenu;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='job_title']")
    public WebElement job_title;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='company_name']")
    public WebElement companytitle;

    @FindBy(xpath = "//div[@class='react-select__control css-1n086e0-control']")
    public WebElement companysizedropdown;

    @FindBy(xpath = "//label[normalize-space()='50-99']")
    public WebElement companysizeOption;

    @FindBy(xpath = "//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3']")
    public WebElement skillsdropdown;

    @FindBy(xpath = "//div[@id='react-select-5-option-0']//div[@class='custom-checkbox']")
    public WebElement skillOption1;

    @FindBy(xpath = "//div[@id='react-select-5-option-1']//div[@class='custom-checkbox']")
    public WebElement skillOption2;
    @FindBy(xpath = "//textarea[@id='how_can_help']")
    public WebElement textarea;

    @FindBy(xpath = "//button[@class='ladda-button  workos-iris undefined']")
    public WebElement submitBtn;





}
