package com.a101.test;

import com.a101.driver.BaseDriverSetup;
import com.a101.pages.ProductPage;
import org.junit.jupiter.api.Test;

public class ProductTest extends BaseDriverSetup {

    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.productPage();
    }

}