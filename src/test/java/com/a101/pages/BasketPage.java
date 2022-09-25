package com.a101.pages;

import com.a101.driver.BaseDriverSetup;
import com.a101.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseDriverSetup.class);

    public BasketPage() {

        methods = new Methods();

    }

    public void basketPage() {

        try {
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//div[contains(text(),' ÖZET')]")));
            logger.info("Sepetim doğrulandı.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@class='button green checkout-button block js-checkout-button']"));
            logger.info("Sepet onaylandı.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@class='auth__form__proceed js-proceed-to-checkout-btn']"));
            logger.info("Üye olmadan devam et.");
            methods.waitBySeconds(2);
            methods.sendKey(By.xpath("//input[@name='user_email']"), "ruzgarmn@hotmail.com");
            logger.info("Mail girildi.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//button[@class='button block green']"));
            logger.info("Devam et butonuna tıklandı.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@class='new-address js-new-address']"));
            logger.info("Yeni adres ekleme yapılır.");
            methods.waitBySeconds(2);
            methods.sendKey(By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']"), "Ev");
            logger.info("Adres başlığı girilir.");
            methods.sendKey(By.xpath("//input[@name='first_name']"), "Mesut");
            logger.info("Ad girilir.");
            methods.sendKey(By.xpath("//input[@name='last_name']"), "Teciman");
            logger.info("Soyad girilir.");
            methods.sendKey(By.xpath("//input[@name='phone_number']"), "5555555555");
            logger.info("Telefon girilir.");
            methods.selectByText(By.xpath("//select[@name='city']"),"HATAY");
            methods.waitBySeconds(2);
            methods.selectByText(By.xpath("//select[@name='township']"),"KIRIKHAN");
            methods.waitBySeconds(2);
            methods.selectByText(By.xpath("//select[@name='district']"),"GÜNDÜZ MAH");
            methods.waitBySeconds(2);
            methods.sendKey(By.xpath("//textarea[@name='line']"), "Kırlangıç Caddesi No:5");
            methods.waitBySeconds(2);
            logger.info("Adres girilir.");
            methods.click(By.xpath("//button[@class='button green js-set-country js-prevent-emoji']"));
            logger.info("Kaydet butonuna tıklanır.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//label[@data-slug='11']"));
            logger.info("Kargo seçilir.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//button[@class='button block green js-proceed-button']"));
            logger.info("Kaydet ve devam et butonuna tıklanır.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//span[@class='order-complete']"));
            logger.info("Siparişi tamamla butonuna tıklanır butonuna tıklanır.");
            methods.waitBySeconds(2);
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//span[contains(text(),'Lütfen kart seçin veya kart bilgisi girin.')]")));
            logger.info("Ödeme ekranında olduğu doğrulanır");
            methods.waitBySeconds(2);
            logger.info("*************A101 SİTESİ TEST OTOMASYONU BİTTİ*************");
            methods.waitBySeconds(2);
        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
}
