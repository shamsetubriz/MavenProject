package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
    @BeforeMethod

    public void setUp(String url){
        System.setProperty("webdriver.gecko.driver", "/Users/shams/IdeaProjects/FirstMaven1/Generic/Browser-Driver/geckodriver");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @AfterMethod
    public void cleanup(){
        driver.close();
    }


}
