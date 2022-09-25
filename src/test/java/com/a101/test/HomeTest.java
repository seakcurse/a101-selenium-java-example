package com.a101.test;

import com.a101.driver.BaseDriverSetup;
import com.a101.pages.HomePage;
import org.junit.Test;

public class HomeTest  extends BaseDriverSetup{

    @Test
    public void homeTest(){

        HomePage homePage = new HomePage();
        homePage.homePage();

    }

}
