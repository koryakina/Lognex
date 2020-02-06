package lognex;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaveDoc {

    @Test
    public void saveDocument() {
        String startUrl = "https://online-sklad-2.testms.lognex.ru/";
        String randomString = RandomStringUtils.randomAlphanumeric(10).toUpperCase();

        WebDriver driver = new ChromeDriver();
        StartPage startPage = new StartPage(driver);
        startPage.startPage(startUrl);

        RegisterPage registerPage = new RegisterPage("dk@dkg1.ru", randomString, driver);

        registerPage.downloadRegisterPage("reglink");
        registerPage.feelRegisterPage();
        registerPage.submitRegisterPage();

        CreateGoodsPage createGoods = new CreateGoodsPage(driver);
        createGoods.gotoGoods();
        createGoods.createGood();

        PurchaseorderPage purchaseorder = new PurchaseorderPage(driver);
        purchaseorder.gotoPurchaseorder();
        purchaseorder.createPurchordPostavsik();
        purchaseorder.goodSelector();
        purchaseorder.dateSelector();
        purchaseorder.projectSelector();
        purchaseorder.createGood();
        purchaseorder.createDocsupply();

    }


}

