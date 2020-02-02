package lognex;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseorderPage {
    public void gotoPurchaseorder(WebDriver driver){
        WebDriverWait waitLoad4 = new WebDriverWait(driver, 3000);
        waitLoad4.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() =  'Закупки']")
        ));
        driver.findElement(By.xpath("//span[text() =  'Закупки']")).click();
        driver.findElement(By.xpath("//span[text() = 'Заказы поставщикам']")).click();
        driver.findElement(By.xpath("//span[text() = 'Заказ']")).click();

    }
    public void createPurchordPostavsik(WebDriver driver){
        WebDriverWait waitLoad5 = new WebDriverWait(driver, 3000);
        waitLoad5.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class = 'selectorPair-wrapper tutorial-counter-party-field']//div[@class = 'border-box']/input)[1]")
        ));
        driver.findElement(By.xpath("(//div[@class = 'selectorPair-wrapper tutorial-counter-party-field']//div[@class = 'border-box']/input)[1]")).click();
        WebDriverWait waitLoad7 = new WebDriverWait(driver, 3000);
        waitLoad7.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@title = 'ООО \"Поставщик\"']")
        ));
        driver.findElement(By.xpath("//div[@title = 'ООО \"Поставщик\"']")).click();
    }
    public void goodSelector(WebDriver driver){
        WebElement docProductInput = driver.findElement(By.xpath("//input[@class = 'gwt-TextBox with-placeholder tutorial-step-consignment-selector']"));
        docProductInput.sendKeys("Tovar");
        WebDriverWait waitLoad6 = new WebDriverWait(driver, 3000);
        waitLoad6.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() = 'Tovar']")
        ));
        driver.findElement(By.xpath("//span[text() = 'Tovar']")).click();
        driver.findElement(By.xpath("(//div[@class = 'add-button'])[4]/div")).click();
        WebDriverWait waitLoad8 = new WebDriverWait(driver, 3000);
        waitLoad8.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() = \"Создать\"]")
        ));
        driver.findElement(By.xpath("//span[text() = \"Создать\"]")).click();
    }
    public void dateSelector(WebDriver driver){
        driver.findElement(By.xpath("//div[@class = 'b-calendar']//input")).click();
        WebElement dateInput = driver.findElement(By.xpath("//div[@class = 'b-calendar']//input"));
        dateInput.sendKeys("11.01.2020 11:33");
    }
    public void projectSelector(WebDriver driver){
        driver.findElement(By.xpath("(//div[@class = 'add-button'])[5]/div")).click();
        WebDriverWait waitLoad10 = new WebDriverWait(driver, 3000);
        waitLoad10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr[@class]//input [@type = 'text'])[1]")
        ));
        driver.findElement(By.xpath("(//tr[@class]//input [@type = 'text'])[1]")).click();
        WebElement projInput = driver.findElement(By.xpath("(//tr[@class]//input [@type = 'text'])[1]"));
        projInput.sendKeys("проект");
        WebDriverWait waitLoad11 = new WebDriverWait(driver, 3000);
        waitLoad11.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() = \"Создать\"]")
        ));
        driver.findElement(By.xpath("//span[text() = \"Создать\"]")).click();

    }
    public void createGood(WebDriver driver){
        String randomString= RandomStringUtils.randomAlphanumeric(10).toUpperCase();

        driver.findElement(By.xpath("//input[@class = 'gwt-TextBox with-placeholder tutorial-step-consignment-selector']")).click();
        WebElement prodInput = driver.findElement(By.xpath("//input[@class = 'gwt-TextBox with-placeholder tutorial-step-consignment-selector']"));
        prodInput.sendKeys(randomString);
        WebDriverWait waitLoad12 = new WebDriverWait(driver, 3000);
        waitLoad12.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[starts-with(text(),'Создать новый товар')]")
        ));

        driver.findElement(By.xpath("//div[starts-with(text(),'Создать новый товар')]")).click();
        WebDriverWait waitLoad13 = new WebDriverWait(driver, 3000);
        waitLoad13.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() = \"Создать\"]")
        ));
        driver.findElement(By.xpath("//span[text() = \"Создать\"]")).click();

    }
    public void createDocsupply(WebDriver driver){
        driver.findElement(By.xpath("//span[text() = 'Создать документ']")).click();
        driver.findElement(By.xpath("//td[text() = 'Приемка']")).click();
        WebDriverWait waitLoad14 = new WebDriverWait(driver, 3000);
        waitLoad14.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[ text()= \"Приемка № \"]")
        ));
        driver.findElement(By.xpath("//span[text()= \"Сохранить\"]")).click();

    }
}
