package lognex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    public String email;
    public String company;

    public void downloadRegisterPage(String elementID){
        WebDriverWait waitLoad = new WebDriverWait(StartPage.driver, 3000);
        StartPage.driver.findElement(By.id(elementID)).click();
    }

    public void feelRegisterPage(){
        WebElement emailInput = StartPage.driver.findElement(By.xpath("//input[@id='email']"));
        emailInput.sendKeys (email);

        WebElement companylInput = StartPage.driver.findElement(By.xpath("//input[@id='company']"));
        companylInput.sendKeys(company);

    }

    public void submitRegisterPage(){
        StartPage.driver.findElement(By.id("submit-text")).click();
    }
}
