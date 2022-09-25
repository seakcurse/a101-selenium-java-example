package com.a101.pages;

import com.a101.driver.BaseDriverSetup;
import com.a101.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductSelect {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseDriverSetup.class);

    public ProductSelect() {

        methods = new Methods();

    }

    public void productSelect() {

        try {
            methods.click(By.xpath("//article[@data-pk='18864']"));
            methods.waitBySeconds(2);
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//span[contains(text(),'SİYAH')]")));
            logger.info("Siyah renk bir ürün seçildi.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']"));
            logger.info("Sepete eklendi.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@class='go-to-shop']"));
            logger.info("Sepet görüntüle butonuna tıklandı.");
            methods.waitBySeconds(2);
            logger.info("Sepetime gidildi.");
            methods.waitBySeconds(2);

        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }

}
