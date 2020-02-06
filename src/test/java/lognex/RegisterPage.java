package lognex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    private final WebDriver driver;
    private String email;
    private String company;

    public RegisterPage (String email, String company, WebDriver driver) {
        this.email = email;
        this.company = company;
        this.driver = driver;
    }

    public void downloadRegisterPage(String elementID){
        WebDriverWait waitLoad = new WebDriverWait(driver, 3000);
        driver.findElement(By.id(elementID)).click();
    }

    public void feelRegisterPage(){
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
        emailInput.sendKeys (email);

        WebElement companylInput = driver.findElement(By.xpath("//input[@id='company']"));
        companylInput.sendKeys(company);

    }

    public void submitRegisterPage(){
        driver.findElement(By.id("submit-text")).click();
    }
}
