import org.testng.annotations.Test;

import com.ecommerce.base.Launch;
import com.ecommerce.pages.Locators;

public class checkout_scenarios extends Launch {



    //To check that when user click on buy now button in product details page then also checkout is working
    @Test
    public void checkout_01() throws InterruptedException
    {
        Launch launch = new Launch();
        launch.launch();
        Locators loc = new Locators(driver);
        loc.select_random_menu();
        loc.select_random_product();
        loc.click_buy_now();
        Thread.sleep(2000);
        String expected_title="Checkout – Timaraa";
        if(driver.getTitle().equals(expected_title))
        {
            System.out.println("checkout page is displayed");
        }else{
            System.out.println("Checkout page is not displaying ");
        }
        Thread.sleep(2000);
        if(loc.check_email_textfield_empty()==true)
        {
            System.out.println("enter email and password and details then confirm order");
            loc.enter_checkout_email();
            loc.click_create_account_checkbox();
            String pwd=Launch.random_password();
            loc.enter_create_password(pwd);
            loc.select_country();
            loc.enter_shipping_first_name();
            loc.enter_shipping_last_name();
            Thread.sleep(2000);
            loc.enter_shipping_address();
            Thread.sleep(2000);
            loc.enter_city();
            loc.enter_state();
            loc.enter_zipcode();
            loc.click_shipping_checkbox();
            loc.click_place_order_button();
            loc.check_order_received();
        }
        else if(loc.check_email_textfield_empty()==false && loc.check_edit_shipping_address()==false)
        {
            System.out.println("user loginin just enter details and confirm order");
            loc.select_country();
            loc.enter_shipping_first_name();
            loc.enter_shipping_last_name();
            Thread.sleep(2000);
            loc.enter_shipping_address();
            Thread.sleep(2000);
            loc.enter_city();
            loc.enter_state();
            loc.enter_zipcode();
            loc.click_shipping_checkbox();
            loc.click_place_order_button();
            loc.check_order_received();

        }
        else{
            System.out.println("Shipping address already exists");
            loc.click_place_order_button();
            Thread.sleep(2000);
            loc.check_order_received();
        }  
           
        }



        //To check that go to cart check if any product is displayed then click on checkout 
        @Test
        public void cart_checkout() throws InterruptedException
        {
        Launch launch = new Launch();
        launch.launch();
        Locators loc = new Locators(driver);
        loc.click_home_logo();
        loc.click_header_cart();
        if(loc.check_cart_products()==true)
        {
            loc.click_cart_checkout_btn();
        }
        else{
            Thread.sleep(2000);
            loc.click_close_cart_btn();
            loc.select_random_menu();
            loc.select_random_product();
            loc.click_free_size();
            loc.click_add_to_cart_button();
            Thread.sleep(4000);
            loc.click_cart_checkout_btn();
            Thread.sleep(2000);
        if(loc.check_email_textfield_empty()==true)
        {
            loc.enter_checkout_email();
            loc.click_create_account_checkbox();
            String pwd=Launch.random_password();
            loc.enter_create_password(pwd);
            loc.select_country();
            loc.enter_shipping_first_name();
            loc.enter_shipping_last_name();
            Thread.sleep(2000);
            loc.enter_shipping_address();
            Thread.sleep(2000);
            loc.enter_city();
            loc.enter_state();
            loc.enter_zipcode();
            loc.click_shipping_checkbox();
            loc.click_place_order_button();
            Thread.sleep(2000);
            loc.check_order_received();
        }
        else if(loc.check_email_textfield_empty()==false && loc.check_edit_shipping_address()==false)
        {
            loc.select_country();
            loc.enter_shipping_first_name();
            loc.enter_shipping_last_name();
            Thread.sleep(2000);
            loc.enter_shipping_address();
            Thread.sleep(2000);
            loc.enter_city();
            loc.enter_state();
            loc.enter_zipcode();
            loc.click_shipping_checkbox();
            loc.click_place_order_button();
            Thread.sleep(2000);
            loc.check_order_received();

        }
        else{
            System.out.println("Shipping address already exists");
            loc.click_place_order_button();
            Thread.sleep(4000);
            loc.check_order_received();
        }  
            
        }
        }
        
        
    }


