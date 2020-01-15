package lognex;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SaveDoc {

    @Test
    public void SaveDocument() {
        String startUrl = "https://online-sklad-2.testms.lognex.ru/";
        String email = "dk@dkg1.ru";

        WebDriver driver = new ChromeDriver();
        driver.get(startUrl);
        WebDriverWait waitLoad = new WebDriverWait(driver, 3000);

        driver.findElement(By.id("reglink")).click();
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
        emailInput.sendKeys (email);
        WebElement companylInput = driver.findElement(By.xpath("//input[@id='company']"));

        String randomString= RandomStringUtils.randomAlphanumeric(10).toUpperCase();
        companylInput.sendKeys(randomString);
        driver.findElement(By.id("submit-text")).click();

        WebDriverWait waitLoad2 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() =  'Товары']")
        ));
        driver.findElement(By.xpath("//span[text() =  'Товары']")).click();
        driver.findElement(By.xpath("//span[text() = 'Товары и услуги']")).click();
        driver.findElement(By.xpath("//span[text() = 'Товар']")).click();

        WebDriverWait waitLoad3 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@class= 'gwt-TextBox field name b-validation-field']")
        ));
        WebElement productInput = driver.findElement(By.xpath("//input[@class= 'gwt-TextBox field name b-validation-field']"));
        productInput.sendKeys("Tovar");


        driver.findElement(By.xpath("//span[text() = 'Сохранить']")).click();


        WebDriverWait waitLoad4 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
               By.xpath("//span[text() =  'Закупки']")
        ));
        driver.findElement(By.xpath("//span[text() =  'Закупки']")).click();
        driver.findElement(By.xpath("//span[text() = 'Заказы поставщикам']")).click();
        driver.findElement(By.xpath("//span[text() = 'Заказ']")).click();

       WebDriverWait waitLoad5 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class = 'selectorPair-wrapper tutorial-counter-party-field']//div[@class = 'border-box']/input)[1]")
        ));
        driver.findElement(By.xpath("(//div[@class = 'selectorPair-wrapper tutorial-counter-party-field']//div[@class = 'border-box']/input)[1]")).click();



        WebDriverWait waitLoad7 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@title = 'ООО \"Поставщик\"']")
        ));

        driver.findElement(By.xpath("//div[@title = 'ООО \"Поставщик\"']")).click();



        WebElement docProductInput = driver.findElement(By.xpath("//input[@class = 'gwt-TextBox with-placeholder tutorial-step-consignment-selector']"));
        docProductInput.sendKeys("Tovar");

        WebDriverWait waitLoad6 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() = 'Tovar']")
        ));

        driver.findElement(By.xpath("//span[text() = 'Tovar']")).click();

        driver.findElement(By.xpath("(//div[@class = 'add-button'])[4]/div")).click();

        WebDriverWait waitLoad8 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text() = \"Создать\"]")
        ));

        driver.findElement(By.xpath("//span[text() = \"Создать\"]")).click();


        driver.findElement(By.xpath("//div[@class = 'b-calendar']//input")).click();

        WebElement dateInput = driver.findElement(By.xpath("//div[@class = 'b-calendar']//input"));
        dateInput.sendKeys("11.01.2020 11:33");

        driver.findElement(By.xpath("(//div[@class = 'add-button'])[5]/div")).click();


        WebDriverWait waitLoad10 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr[@class]//input [@type = 'text'])[1]")
        ));

        driver.findElement(By.xpath("(//tr[@class]//input [@type = 'text'])[1]")).click();

        WebElement projInput = driver.findElement(By.xpath("(//tr[@class]//input [@type = 'text'])[1]"));
        projInput.sendKeys("проект");

       WebDriverWait waitLoad11 = new WebDriverWait(driver, 3000);
       waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
               By.xpath("//span[text() = \"Создать\"]")
        ));

        driver.findElement(By.xpath("//span[text() = \"Создать\"]")).click();

        driver.findElement(By.xpath("//input[@class = 'gwt-TextBox with-placeholder tutorial-step-consignment-selector']")).click();

        WebElement prodInput = driver.findElement(By.xpath("//input[@class = 'gwt-TextBox with-placeholder tutorial-step-consignment-selector']"));
        prodInput.sendKeys(randomString);

        WebDriverWait waitLoad12 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[starts-with(text(),'Создать новый товар')]")
        ));

        driver.findElement(By.xpath("//div[starts-with(text(),'Создать новый товар')]")).click();

       WebDriverWait waitLoad13 = new WebDriverWait(driver, 3000);
       waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
               By.xpath("//span[text() = \"Создать\"]")
       ));

        driver.findElement(By.xpath("//span[text() = \"Создать\"]")).click();

        driver.findElement(By.xpath("//span[text() = 'Создать документ']")).click();

        driver.findElement(By.xpath("//td[text() = 'Приемка']")).click();

        WebDriverWait waitLoad14 = new WebDriverWait(driver, 3000);
        waitLoad.until(ExpectedConditions.visibilityOfElementLocated(
              By.xpath("//div[ text()= \"Приемка № \"]")
        ));

        driver.findElement(By.xpath("//span[text()= \"Сохранить\"]")).click();


    }
}

