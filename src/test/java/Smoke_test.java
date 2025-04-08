import java.util.ArrayList;
import java.util.Set;

// import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ecommerce.base.Launch;
import com.ecommerce.pages.Locators;
// import com.ecommerce.test.GoogleSheetUtils; // Ensure this is the correct package path


import org.testng.annotations.Test;

public class Smoke_test extends Launch {
    @Test
    public void register_and_login() throws InterruptedException {
        Launch launch = new Launch();
        launch.launch();
        Locators loc = new Locators(driver);
        loc.click_my_account();
        String f_name=Launch.randomstring();
        String L_name=Launch.randomstring();
        String email_01=Launch.randomemail();
        String pass_word=Launch.random_password();
        loc.enter_first_name(f_name);
        loc.enter_last_name(L_name);
        loc.enter_email(email_01);
        Thread.sleep(2000);
        String email = loc.get_email();
        System.out.println(email);
        loc.enter_password(pass_word);
        String pwd = loc.get_password();
        loc.click_register_button();
        //  GoogleSheetUtils.appendCredentials(f_name, L_name, email_01, pass_word);



        if (loc.check_register_confirmation() == true) {
            System.out.println("Testcase passed : Registration succesfull");
        } else {
            System.out.println("Testcase failed : Registration failed");
        }
        // login
        loc.enter_login_username(email);
        Thread.sleep(2000);
        loc.copy_us_email();
        loc.enter_login_password(pwd);
        loc.click_password_eye();

        loc.click_login_button();
        Thread.sleep(2000);
        if (loc.check_login_confirmation() == true) {
            System.out.println("Testcase passed : Login succesfull");
        } else {
            System.out.println("Testcase failed : Login failed");
        }
        // verification
        String yopmail = "https://yopmail.com";
        WebDriver driver = Launch.driver;
        String mainWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window); // Switch to new window
                break;
            }

        }
        loc.openNewTab(yopmail);

        loc.click_yopmail_input();
        // loc.click_cross_yopmail();

        loc.yopmail_input_paste();
        loc.enter_yopmail_btn();
        Thread.sleep(2000);
        driver.switchTo().frame("ifmail");
        loc.click_here_btn();
        WebDriver driver1 = Launch.driver;
        String mainWindow1 = driver.getWindowHandle();

        Set<String> allWindows1 = driver.getWindowHandles();
        for (String window : allWindows1) {
            if (!window.equals(mainWindow1)) {
                driver1.switchTo().window(window); // Switch to new window
                break;
            }
        }
        Thread.sleep(2000);
        loc.username_paste();
        loc.enter_pwd_verify(pwd);
        loc.click_login_button();
        Thread.sleep(2000);
        if (loc.check_my_act_content() == true) {
            System.out.println("Testcase passed : Login succesfull with verification ");
        } else {
            System.out.println("Testcase failed : Login failed with verification");
        }
    }

    // checkout
    @Test
    public void checkout() throws InterruptedException {
        Launch launch = new Launch();
        launch.launch();
        Locators loc = new Locators(driver);
      
        String currentTab = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle); // Switch to each tab
            if (handle.equals(currentTab)) {
                System.out.println("✅ Successfully switched to the correct tab.");
                break;
            }
        }

        loc.click_sarees();
        loc.clickRandomSareeImage();
        loc.click_free_size();
        loc.click_add_to_cart_button();
        Thread.sleep(2000);
        loc.click_view_cart();
        loc.click_checkout();
        if (loc.check_edit_shipping_address() == false) {
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
        } else {
            System.out.println("Shipping address already exists");
        }

        Thread.sleep(3000);
        loc.click_place_order_button();
        Thread.sleep(6000);
        String expected_title = "Order received – Timaraa";
        String actual_title = driver.getTitle();
        System.out.println(actual_title);
        System.out.println(expected_title);
        if (actual_title.equals(expected_title)) {
            System.out.println("Testcase passed : Order placed successfully");
        } else {
            System.out.println("Testcase failed : Order not placed");
        }

    }

    // To check that when user search the product in search bar , and then proceed
    // to checkout
    @Test
    public void search_and_checkout() throws InterruptedException {
        Launch launch = new Launch();
        launch.launch();
        Locators loc = new Locators(driver);
        WebDriver driver1 = Launch.driver;
        String mainWindow1 = driver.getWindowHandle();

        Set<String> allWindows1 = driver.getWindowHandles();
        for (String window : allWindows1) {
            if (!window.equals(mainWindow1)) {
                driver1.switchTo().window(window); // Switch to new window
                break;
            }
        }
        loc.click_sarees();
        Thread.sleep(2000);
        loc.searchRandomSaree();
        loc.click_search_results();
        loc.click_free_size();
        loc.click_add_to_cart_button();
        Thread.sleep(2000);
        loc.click_view_cart();
        loc.click_checkout();
        if (loc.check_edit_shipping_address() == false) {
            loc.enter_checkout_email();
            loc.click_create_account_checkbox();
            loc.enter_create_password(Launch.random_password());
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
        } else {
            System.out.println("Shipping address already exists");
        }

        Thread.sleep(2000);
        loc.click_place_order_button();
        Thread.sleep(6000);
        String expected_title = "Order received – Timaraa";
        String actual_title = driver.getTitle();
        System.out.println(actual_title);
        System.out.println(expected_title);
        if (actual_title.equals(expected_title)) {
            System.out.println("Testcase passed : Order placed successfully");
        } else {
            System.out.println("Testcase failed : Order not placed");
        }
    }

    // To check that when user wishlist a product then that product should be
    // present in wishlist page
    @Test
    public void wishlist() throws InterruptedException {
        Launch launch = new Launch();
        launch.launch();
        Locators loc = new Locators(driver);
        WebDriver driver1 = Launch.driver;
        String mainWindow1 = driver.getWindowHandle();

        Set<String> allWindows1 = driver.getWindowHandles();
        for (String window : allWindows1) {
            if (!window.equals(mainWindow1)) {
                driver1.switchTo().window(window); // Switch to new window
                break;
            }
        }
        loc.select_random_menu();
        Thread.sleep(2000);
        loc.selectRandomProduct_AndAddToWishlist();
        Thread.sleep(2000);
        loc.click_header_wishlist();
        Thread.sleep(2000);
        loc.check_product_name_wishlist_page();

    }

    // To check that when user remove the product from wishlist then proper toast
    // message should be display
    @Test
    public void remove_wishlist() throws InterruptedException {
        Launch launch = new Launch();
        launch.launch();
        Locators loc = new Locators(driver);
        loc.click_header_wishlist();
        loc.click_remove_wishlist();
        Thread.sleep(2000);
        loc.check_remove_confirm();
    }

}
