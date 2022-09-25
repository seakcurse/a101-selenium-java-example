package com.a101.test;

import com.a101.driver.BaseDriverSetup;
import com.a101.pages.BasketPage;
import org.junit.jupiter.api.Test;

public class BasketTest extends BaseDriverSetup {

    @Test
    public void basketTest(){
        BasketPage basketPage = new BasketPage();
        basketPage.basketPage();
    }

}