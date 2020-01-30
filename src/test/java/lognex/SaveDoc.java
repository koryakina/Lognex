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
        String randomString = RandomStringUtils.randomAlphanumeric(10).toUpperCase();

        WebDriver driver = new ChromeDriver();
        StartPage.driver = driver;
        StartPage stpage = new StartPage();
        stpage.startPage(startUrl);

        RegisterPage regPg = new RegisterPage();
        regPg.email="dk@dkg1.ru";
        regPg.company=randomString;

        regPg.downloadRegisterPage("reglink");
        regPg.feelRegisterPage();
        regPg.submitRegisterPage();

        CreateGoods crtgd = new CreateGoods();
        crtgd.gotogoods();
        crtgd.createGood();

        Purchaseorder prchord = new Purchaseorder();
        prchord.gotoPurchaseorder();
        prchord.createPurchordPostavsik();
        prchord.goodSelector();
        prchord.dateSelector();
        prchord.projectSelector();
        prchord.createGood();
        prchord.createDocsupply();

    }


}

