package base;

import config.ConfigManager;
import config.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

public class BaseTest {


    protected static WebDriver driver;
    protected static final Logger  logger = LogManager.getLogger(BaseTest.class);
    private  static  final String baseURL = ConfigManager.getProperty("baseURL");


    @BeforeMethod
    public void setup(){
        driver = DriverFactory.getDriver();
         driver.get(baseURL);
         logger.info("Base URL for these Test" + baseURL);

    }



     @AfterMethod
    public void tearDown(){
        DriverFactory.quitDriver();

    }

}
