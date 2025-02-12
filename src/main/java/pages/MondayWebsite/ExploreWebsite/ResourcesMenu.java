package pages.MondayWebsite.ExploreWebsite;

import enums.WaitStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class ResourcesMenu {

    public WebDriver driver;

    public ResourcesMenu(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


   

    @FindBy(xpath = "//div[@role='listitem']//span[text()='Resources']")
    public WebElement resourcesMenu;

    @FindBy(xpath = "//div[@class='links']//span[text()='About us']")
    public  WebElement aboutUsButton;
    


 




  

}
