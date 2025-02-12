package pages.MondayWebsite.ExploreWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionMenu {


    public WebDriver driver;

    public SolutionMenu(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    // For Solution Menu
    @FindBy(xpath = "//div/span[text()='Solutions'][@class='link-item-with-menu-title']")
    public WebElement solutionMenu;

    @FindBy(xpath = "//div[@class='links teams-links-container']//span[text()='HR'] ")
    public WebElement hrLink;
}
