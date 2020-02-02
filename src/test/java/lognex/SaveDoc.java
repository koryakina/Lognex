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

        RegisterPage registerPage = new RegisterPage("dk@dkg1.ru", randomString);

        registerPage.downloadRegisterPage("reglink", driver);
        registerPage.feelRegisterPage(driver);
        registerPage.submitRegisterPage(driver);

        CreateGoodsPage createGoods = new CreateGoodsPage();
        createGoods.gotoGoods(driver);
        createGoods.createGood(driver);

        PurchaseorderPage purchaseorder = new PurchaseorderPage();
        purchaseorder.gotoPurchaseorder(driver);
        purchaseorder.createPurchordPostavsik(driver);
        purchaseorder.goodSelector(driver);
        purchaseorder.dateSelector(driver);
        purchaseorder.projectSelector(driver);
        purchaseorder.createGood(driver);
        purchaseorder.createDocsupply(driver);

    }


}

