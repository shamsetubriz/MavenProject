package Search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ImputSearch extends CommonAPI {

    @Test
    public void search(){
        driver.findElement(By.id("email")).sendKeys("Shamspaa@yahoo.com", Keys.ENTER);
    }
}
