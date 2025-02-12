package pages.MondayWebsite.ExploreWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMenu {


    public WebDriver driver;

    public ProductMenu(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),\"Accept all cookies\")]")
    public WebElement cookiesButton;

    @FindBy(xpath = "//div/span[text()='Products'][@class='link-item-with-menu-title']")
    public WebElement productMenu;



    @FindBy(xpath = "//div[@class='links-container']//span[text()='Automations']")
    public WebElement automationButton;

 
    
}
