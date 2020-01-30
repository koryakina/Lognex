package lognex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGoods {

    public void gotogoods(){
        WebDriverWait waitLoad2 = new WebDriverWait(StartPage.driver, 3000);
        waitLoad2.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() =  'Товары']")
        ));
        StartPage.driver.findElement(By.xpath("//span[text() =  'Товары']")).click();
        StartPage.driver.findElement(By.xpath("//span[text() = 'Товары и услуги']")).click();
        StartPage.driver.findElement(By.xpath("//span[text() = 'Товар']")).click();

    }
    public void createGood( ){
        WebDriverWait waitLoad3 = new WebDriverWait(StartPage.driver, 3000);
        waitLoad3.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@class= 'gwt-TextBox field name b-validation-field']")
        ));
        WebElement productInput = StartPage.driver.findElement(By.xpath("//input[@class= 'gwt-TextBox field name b-validation-field']"));
        productInput.sendKeys("Tovar");
        StartPage.driver.findElement(By.xpath("//span[text() = 'Сохранить']")).click();
    }
}
