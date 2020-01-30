package lognex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {
    public static WebDriver driver;

    public void startPage(String startUrl){
        driver.get(startUrl);
        WebDriverWait waitLoad = new WebDriverWait(driver, 3000);
    }
}
