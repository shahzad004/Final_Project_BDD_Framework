package test;

import base.BaseTest;
import com.fasterxml.jackson.databind.ser.Serializers;
import config.ConfigManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {



    @Test
    public void getDetails(){

        driver.getCurrentUrl();
        System.out.println( "How are your");
    }

    @Test
    public void verifyBrowser(){

        String expectedURl= "https://monday.com";
        String actualURl = "https://monday.com";

        Assert.assertEquals(expectedURl,actualURl,"Failed");


    }

    @Test
    public void getDeails(){

        driver.getCurrentUrl();
        System.out.println( "How are your");
    }
}
