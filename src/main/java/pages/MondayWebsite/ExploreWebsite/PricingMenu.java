package pages.MondayWebsite.ExploreWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingMenu {

    public WebDriver driver;

    public PricingMenu(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


    // For pricing Menu
    @FindBy(xpath = "//nav[@class='base-header-desktop-content css-1xwnmdw e15gf1e10']//a[text()='Pricing']")
    public WebElement pricing;



}
