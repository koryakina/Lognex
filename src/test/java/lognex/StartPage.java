package lognex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {
    private static WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void startPage(String startUrl){
        driver.get(startUrl);
        WebDriverWait waitLoad = new WebDriverWait(driver, 3000);
    }
}
