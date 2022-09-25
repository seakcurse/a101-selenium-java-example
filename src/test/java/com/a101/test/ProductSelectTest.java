package com.a101.test;

import com.a101.driver.BaseDriverSetup;
import com.a101.pages.ProductSelect;
import org.junit.jupiter.api.Test;

public class ProductSelectTest extends BaseDriverSetup {

    @Test
    public void productSelectTest(){
        ProductSelect productSelect = new ProductSelect();
        productSelect.productSelect();
    }
}
