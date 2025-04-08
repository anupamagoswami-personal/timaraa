package com.ecommerce;

import org.testng.annotations.Test;

import com.ecommerce.base.Launch;
import com.ecommerce.pages.Locators;

public class cart_page extends Launch {


    //To check that when user add one product into cart then that product should display in cart page 
    @Test
    public void cart_01() throws InterruptedException
    {
        Launch launch = new Launch();
        launch.launch();
        Locators loc = new Locators(driver);
        loc.select_random_menu();
        loc.select_random_product();
        loc.get_product_name();
        loc.click_free_size();
        loc.click_add_to_cart_button();
    Thread.sleep(2000);
    if(loc.check_cart_products_name())
    {
        System.out.println(" Test Passed: Expected product text found!");
        } else {
            System.out.println(" Test Failed: Expected product text not found.");
        }
    }

}
