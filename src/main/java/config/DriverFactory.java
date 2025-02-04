package config;

import enums.Browser;
import enums.Environment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import static enums.Browser.CHROME;

public class DriverFactory {
    public static WebDriver driver;

    // To get Browser from config file
    private  static final String definedBrowser = ConfigManager.getProperty("browser");


    public static WebDriver intializeDriver(){

        Browser browser = Browser.valueOf(definedBrowser.toUpperCase());
        boolean isHeadless = Boolean.parseBoolean(ConfigManager.getProperty("isHeadles"));
        System.out.println("Loaded Configuration on "+ isHeadless );

        switch (browser){
            case  CHROME :
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();

                if(isHeadless){
                    chromeOptions.addArguments("--headless");
                }
                driver = new ChromeDriver(chromeOptions);

            break ;

            case  EDGE :
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();

                if(isHeadless){
                    edgeOptions.addArguments("--headless");
                }
                driver = new EdgeDriver(edgeOptions);

            break;

            case  FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();

                if(isHeadless){
                    firefoxOptions.addArguments("--headless");
                }
                driver = new FirefoxDriver(firefoxOptions);

            break;

            case  SAFARI:
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();

                break;

            default:
                throw new IllegalArgumentException("intialize Driver method is not intialized");


        }
        driver.manage().window().maximize();
        return driver;
    }


    public static void  quitDriver(){
        if(driver != null){
            driver.quit();
        }

    }



}
