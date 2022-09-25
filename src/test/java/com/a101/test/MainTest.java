package com.a101.test;

import com.a101.driver.BaseDriverSetup;
import com.a101.pages.*;
import org.junit.Test;

public class MainTest extends BaseDriverSetup {

    @Test
    public void mainTest(){

        HomePage homePage = new HomePage();
        homePage.homePage();
        ProductPage productPage = new ProductPage();
        productPage.productPage();
        ProductSelect productSelect = new ProductSelect();
        productSelect.productSelect();
        BasketPage basketPage = new BasketPage();
        basketPage.basketPage();

    }

}