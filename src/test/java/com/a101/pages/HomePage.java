package com.a101.pages;

import com.a101.driver.BaseDriverSetup;
import com.a101.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseDriverSetup.class);

    public HomePage(){

        methods = new Methods();

    }

    public void homePage(){

        try {
            logger.info("*************A101 SİTESİ TEST OTOMASYONU BAŞLIYOR*************");
            methods.click(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']"));
            logger.info("Çerezler kabul edildi.");
            methods.waitBySeconds(2);
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//a[@class='logo']")));
            logger.info("Anasayfa açıldı.");
            methods.waitBySeconds(2);
        }
        catch (Exception e) {
            logger.error("Hata: "+e);
        }

    }

}
