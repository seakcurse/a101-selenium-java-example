package com.a101.pages;

import com.a101.driver.BaseDriverSetup;
import com.a101.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseDriverSetup.class);

    public ProductPage() {

        methods = new Methods();

    }

    public void productPage() {

        try {
            methods.click(By.xpath("//a[@title='GİYİM & AKSESUAR']"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@data-value='1565']"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@data-value='1567']"));
            methods.waitBySeconds(2);
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//div[@class='categories']")));
            logger.info("Dizaltı çorap sayfası açıldı.");
            methods.waitBySeconds(2);
        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
}
