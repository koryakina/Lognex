package lognex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGoodsPage {
    private static WebDriver driver;

    public CreateGoodsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoGoods(){
        WebDriverWait waitLoad99 = new WebDriverWait(driver, 3000);
        waitLoad99.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() =  'Товары']")
        ));
        driver.findElement(By.xpath("//span[text() =  'Товары']")).click();
        driver.findElement(By.xpath("//span[text() = 'Товары и услуги']")).click();
        driver.findElement(By.xpath("//span[text() = 'Товар']")).click();

    }
    public void createGood(){
        WebDriverWait waitLoad3 = new WebDriverWait(driver, 3000);
        waitLoad3.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@class= 'gwt-TextBox field name b-validation-field']")
        ));
        WebElement productInput = driver.findElement(By.xpath("//input[@class= 'gwt-TextBox field name b-validation-field']"));
        productInput.sendKeys("Tovar");
        driver.findElement(By.xpath("//span[text() = 'Сохранить']")).click();
    }
}
