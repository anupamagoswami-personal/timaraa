package com.ecommerce.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.base.Launch;

public class Locators extends Launch {

    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    public Locators(WebDriver driver) {

        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);

    }

    // Home page elements
    @FindBy(xpath = "(//a[@class='acnt-btn'])[1]")
    private WebElement my_account;

    // My account page elements
    @FindBy(xpath = "//input[@id='reg_billing_first_name']")
    private WebElement first_name;

    @FindBy(xpath = "//input[@id='reg_billing_last_name']")
    private WebElement last_name;

    @FindBy(xpath = "//input[@id='reg_email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='reg_password']")
    private WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    private WebElement register_button;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement confirmation_msg;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement login_username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement login_password;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    private WebElement login_button;

    @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']")
    private WebElement my_account_content;

    // Register methods
    public void click_my_account() {
        my_account.click();
    }

    // yopmail
    @FindBy(xpath = "//div[@id='ycptcpt']")
    private WebElement yopmail_mail_input;

    @FindBy(xpath = "//i[text()='']")
    private WebElement yopmail_enter_btn;

    @FindBy(xpath = "//a[text()='Click Here']")
    private WebElement yopmail_click_here;

    @FindBy(xpath = "//i[text()='']")
    private WebElement yopmail_close_btn;

    @FindBy(xpath = "//button[@aria-describedby='password']")
    private WebElement password_eye;

    // checkout
    @FindBy(xpath = "//a[normalize-space()='Kurta Sets']")
    private WebElement kurta_sets;

    @FindBy(xpath = "//a[normalize-space()='Sarees']")
    private WebElement sarees;

    @FindBy(xpath = "//img[@class='attachment-full size-full']")
    private List<WebElement> saree_images;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    private WebElement add_to_cart_button;

    @FindBy(xpath = "//span[@class='variable-item-span variable-item-span-button']") //// div[@class='variable-item-contents']
    private WebElement free_size;

    @FindBy(xpath = "//a[text()='View Cart']")
    private WebElement view_cart_button;

    @FindBy(xpath = "//a[@class='wc-block-components-button wp-element-button wc-block-cart__submit-button contained']")
    private WebElement checkout_button;

    @FindBy(xpath = "//select[@id='shipping-country']")
    private WebElement country_dropdown;

    @FindBy(xpath = "//input[@id='shipping-first_name']")
    private WebElement shipping_first_name;

    @FindBy(xpath = "//input[@id='shipping-last_name']")
    private WebElement shipping_last_name;

    @FindBy(xpath = "(//input[@aria-label='Address'])[1]")
    private WebElement shipping_address;

    @FindBy(xpath = "//input[@id='shipping-city']")
    private WebElement shipping_city;

    @FindBy(xpath = "//select[@id='shipping-state']")
    private WebElement shipping_state;

    @FindBy(xpath = "//input[@id='shipping-postcode']")
    private WebElement shipping_zipcode;

    @FindBy(xpath = "(//input[@type='checkbox'])[6]")
    private WebElement shipping_checkbox;

    @FindBy(xpath = "//button[@class='wc-block-components-button wp-element-button wc-block-components-checkout-place-order-button contained']")
    private WebElement place_order_button;

    @FindBy(xpath = "//h1[normalize-space()='Order received']")
    private WebElement order_received;

    @FindBy(xpath = "//span[@aria-label='Edit shipping address']")
    private WebElement edit_shipping_address;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement checkout_email;

    @FindBy(xpath = "(//input[@type='checkbox'])[6]")
    private WebElement create_account_checkbox;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement create_password;

    // product listing page
    @FindBy(xpath = "//div[@class='hdr-rt']//a[@class='search-btn']")
    private WebElement search_icon;

    @FindBy(xpath = "//input[@placeholder='Search here..']")
    private WebElement search_input;

    @FindBy(xpath = "//span[@class='innericon']")
    private WebElement search_product;

    @FindBy(xpath = "//div[@class='top-pick-cont-wrap']//following-sibling::h4")
    private List<WebElement> all_products_names;

    @FindBy(xpath = "//div[@class='search-image']")
    private WebElement search_results;

    @FindBy(xpath = "//ul[@id='menu-header-menu']//li")
    private List<WebElement> header_menu;

    @FindBy(xpath = "(//div[@class='yith-add-to-wishlist-button-block yith-add-to-wishlist-button-block--single yith-add-to-wishlist-button-block--initialized'])[1]")
    private WebElement add_wishlist;

    @FindBy(xpath = "(//a[@class='wishlist-btn'])[1]")
    private WebElement header_wishlist_icon;

    @FindBy(xpath = "//a[@class='yith-wcwl-add-to-wishlist-button yith-wcwl-add-to-wishlist-button--anchor']")
    private List<WebElement> all_wishlist_icons;

    @FindBy(xpath = "//img[@class='attachment-full size-full']") 
    private List<WebElement> products;

    @FindBy(xpath = "(//span[@class='xoo-wsc-sc-bki xoo-wsc-icon-cart1'])[1]")
    private WebElement header_cart;

    @FindBy(xpath = "//img[@alt='logo']")
    private WebElement img_logo;

    //wishlist page

    @FindBy(xpath = "//table[contains(@class, 'shop_table cart wishlist_table wishlist_view traditional responsive   ')]/tbody/tr/td[3]/a")
    private List<WebElement> product_name_wishlist_page;

    @FindBy(xpath = "(//table[contains(@class, 'shop_table cart wishlist_table wishlist_view traditional responsive   ')]/tbody/tr/td[1]/div/a)[1]")
    private WebElement remove_wishlist;

    @FindBy(xpath = "//div[@class='woocommerce-message']")
    private WebElement removed_confirm_msg;

    //product details page

    @FindBy(xpath = "//button[normalize-space()='Buy Now']")
    private WebElement buy_now;

    @FindBy(xpath="//h1[@class='product_title entry-title']")
    private WebElement product_title;

    //cart page 
    
    @FindBy(xpath = "//div[@class='xoo-wsc-product']")
    private List<WebElement> cart_products;

    @FindBy(xpath = "//a[@class='xoo-wsc-ft-btn xoo-wsc-btn xoo-wsc-ft-btn-checkout']")
    private WebElement cart_checkout_btn;

    @FindBy(xpath = "//span[@class='xoo-wsch-close xoo-wsc-icon-cross']")
    private WebElement close_cart_btn;

    @FindBy(xpath = "//span[@class='xoo-wsc-pname']")
    private List<WebElement> cart_products_name;

    public void enter_first_name(String name) {
        first_name.sendKeys(name);
    }

    public void enter_last_name(String lname) {
        last_name.sendKeys(lname);
    }

    public void enter_email(String mail) {
        email.sendKeys(mail);
    }

    public String get_email() {
        return email.getAttribute("value");
    }

    public void enter_password(String pass) {
        password.sendKeys(pass);
    }

    public String get_password() {
        return password.getAttribute("value");
    }

    public void click_register_button() {
        register_button.click();
    }

    public Boolean check_register_confirmation() {
        return confirmation_msg.isDisplayed();
    }

    public void enter_login_username(String uname) {
        login_username.sendKeys(uname);
    }

    public void copy_us_email() {
        login_username.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .sendKeys("a") // Select All
                .sendKeys("c") // Copy
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
    }

    public void copy_us_pwd() {
        login_password.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .sendKeys("a") // Select All
                .sendKeys("c") // Copy
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
    }

    public void enter_login_password(String pass) {
        login_password.sendKeys(pass);
    }

    public void click_login_button() {
        login_button.click();
    }

    public boolean check_login_confirmation() {
        String actual_msg = confirmation_msg.getText();
        String expected_msg = "Please check your email and complete email verification to login. Didn't get the email? Send again";
        if (actual_msg.equals(expected_msg)) {
            return true;
        } else {
            return false;
        }
    }

    // yopmail
    public void openNewTab(String url) {
        js.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        driver.get(url);

    }

    public void enter_yopmail(String mail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ycptcpt']")));
        WebElement emailInput = driver.findElement(By.xpath("//div[@id='ycptcpt']"));
        emailInput.sendKeys(mail);

    }

    public void enter_yopmail_btn() {
        WebElement enter_btn = driver.findElement(By.xpath("//i[text()='']"));
        enter_btn.click();
    }

    public void click_yopmail_input() {
        yopmail_mail_input.click();
    }

    public void clear_yopmail_input() {
        yopmail_mail_input.clear();
        ;
    }

    public void yopmail_input_paste() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ycptcpt']")));
        WebElement emailInput = driver.findElement(By.xpath("//div[@id='ycptcpt']"));
        emailInput.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .sendKeys("v") // Paste
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
    }

    public void click_here_btn() {
        yopmail_click_here.click();
    }

    public void username_paste() {
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='username']"));
        emailInput.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .sendKeys("v") // Paste
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
    }

    public void pwd_paste() {
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='password']"));
        emailInput.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .sendKeys("v") // Paste
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
    }

    public Boolean check_my_act_content() {
        if (my_account_content.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void click_cross_yopmail() {
        yopmail_close_btn.click();
    }

    public void click_password_eye() {
        password_eye.click();
    }

    public void enter_pwd_verify(String pass) {
        login_password.sendKeys(pass);
    }

    public void click_kurta_sets() {
        kurta_sets.click();
    }

    public void click_sarees() {
        sarees.click();
    }

    public void clickRandomSareeImage() throws InterruptedException {
        if (saree_images.size() > 0) {
            System.out.println("Total saree images found: " + saree_images.size());
            Random random = new Random();
            int randomIndex = random.nextInt(saree_images.size());
            WebElement randomSaree = saree_images.get(randomIndex);
            String sareeAltText = randomSaree.getAttribute("alt");
            System.out.println("Randomly selected saree: " + sareeAltText);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomSaree);
            Thread.sleep(2000);
            randomSaree.click();

            System.out.println("✅ Clicked on random saree with index: " + randomIndex);
        } else {
            System.out.println("❌ No saree images found on the page.");
        }
    }

    public void click_add_to_cart_button() {
        Actions actions = new Actions(driver);
        actions.moveToElement(add_to_cart_button).perform();
        add_to_cart_button.click();

    }

    public void click_free_size() {
        free_size.click();
    }

    public void click_view_cart() {
        WebElement viewCartButton = wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View Cart']")));
        viewCartButton.click();
        // view_cart_button.click();
    }

    public void click_checkout() {
        Actions actions = new Actions(driver);
        actions.moveToElement(checkout_button).perform();
        checkout_button.click();
    }

    public void select_country() {
        Actions actions = new Actions(driver);
        actions.moveToElement(country_dropdown).perform();
        Select s1 = new Select(country_dropdown);
        s1.selectByVisibleText("India");
    }

    public void enter_shipping_first_name() {
        Actions actions = new Actions(driver);
        actions.moveToElement(shipping_first_name).perform();
        shipping_first_name.sendKeys(faker.name().firstName());
    }

    public void enter_shipping_last_name() {
        shipping_last_name.sendKeys(faker.name().lastName());
    }

    public void enter_shipping_address() {
        Actions actions = new Actions(driver);
        actions.moveToElement(shipping_address).perform();

        shipping_address.sendKeys(faker.address().streetAddress());
    }

    public void enter_city() {
        Actions actions = new Actions(driver);
        actions.moveToElement(shipping_city).perform();
        shipping_city.sendKeys(faker.address().city());
    }

    public void enter_state() {
        Select s2 = new Select(shipping_state);
        s2.selectByVisibleText("West Bengal");
    }

    public void enter_zipcode() {
        shipping_zipcode.sendKeys("700091");
    }

    public void click_shipping_checkbox() {
        Actions actions = new Actions(driver);
        actions.moveToElement(shipping_checkbox).perform();
        shipping_checkbox.click();
    }

    public void click_place_order_button() {
        Actions actions = new Actions(driver);
        actions.moveToElement(place_order_button).perform();
        place_order_button.click();
    }

    public void check_order_received() {
        if (order_received.isDisplayed()) {
            System.out.println("Testcase passed : Order received successfully");
        } else {
            System.out.println("Testcase failed : Order not received");
        }
    }

    public boolean check_edit_shipping_address() {
        if(edit_shipping_address.isDisplayed())
        {
            return true;
        }else{
            return false;

        }
        
    }

    public void click_search_icon() {
        search_icon.click();
    }

    public void searchRandomSaree() {
        try {

            // Check if sarees exist
            if (all_products_names.isEmpty()) {
                System.out.println("No saree names found!");
                return;
            }

            // Select a random saree name
            Random rand = new Random();
            int randomIndex = rand.nextInt(all_products_names.size());
            String randomSareeName = all_products_names.get(randomIndex).getText().trim();

            System.out.println("Random Saree Selected: " + randomSareeName);

            // Enter the random saree name in the search box
            search_icon.click();
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(search_input));
            searchBox.clear();
            searchBox.sendKeys(randomSareeName);

            // Click the search button

            search_product.click();

            // Wait for results to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-image']")));

            System.out.println("Searched for: " + randomSareeName);

        } catch (Exception e) {
            System.out.println("Error while searching for a random saree: " + e.getMessage());
        }
    }

    public void click_search_results() {
        search_results.click();
    }

    public String click_random_menu() throws InterruptedException {
        Random rand = new Random();

        while (true) {
            if (header_menu.isEmpty()) {
                System.out.println("❌ No header menu items found!");
                return null;
            }

            int randomIndex = rand.nextInt(header_menu.size()); // Select random header
            WebElement randomHeader = header_menu.get(randomIndex);
            String headerText = randomHeader.getText();
            Actions actions = new Actions(driver);
            actions.moveToElement(randomHeader).click().perform();
            System.out.println(" Clicked on header: " + headerText);
            if (!saree_images.isEmpty()) {
                System.out.println("Products found! Clicking on a random product...");
                clickRandomProductImage();
                return headerText;
            } else {
                System.out.println(" No products found in this category. Trying another header...");
            }
        }
    }

    public String clickRandomProductImage() throws InterruptedException {
        String sareeAltText = "";

        if (saree_images.size() > 0) {
            System.out.println("Total saree images found: " + saree_images.size());
            Random random = new Random();
            int randomIndex = random.nextInt(saree_images.size());
            WebElement randomSaree = saree_images.get(randomIndex);
            sareeAltText = randomSaree.getAttribute("alt");
            System.out.println("Randomly selected saree: " + sareeAltText);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomSaree);
            Thread.sleep(2000);
            randomSaree.click();

        }
        return sareeAltText;
    }

    public void click_wishlist_button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement wishlistButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "(//div[@class='yith-add-to-wishlist-button-block yith-add-to-wishlist-button-block--single yith-add-to-wishlist-button-block--initialized'])[1]")));
        wishlistButton.click();
    }

    public void click_header_wishlist() {
        header_wishlist_icon.click();
    }

    public boolean select_random_menu() {
        Random rand = new Random();
        if (header_menu.isEmpty()) {
            System.out.println("No header menus found.");
            return false;
        }

        int attempt = 0;
        while (attempt < header_menu.size()) {
            int randomMenuIndex = rand.nextInt(header_menu.size());
            WebElement selectedMenu = header_menu.get(randomMenuIndex);
            selectedMenu.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!products.isEmpty()) {
                return true;
            } else {
                attempt++;

            }

        }
        System.out.println("No products found in any menu.");
        return false;
    }

    private String goods;

    public String selectRandomProduct_AndAddToWishlist() throws InterruptedException {
        Random rand = new Random();

        if (products.isEmpty()) {
            System.out.println("No products found.");
            return goods;
        }

        // Select a random product
        System.out.println("Total products found: " + products.size());

        for (WebElement product : products) {
            System.out.println("Product Name: " + product.getText());
        }
        int randomIndex = rand.nextInt(products.size());
        WebElement selectedProduct = products.get(randomIndex);
        goods = all_products_names.get(randomIndex).getText().trim();

        System.out.println("Product selected: " + goods);

        if (all_wishlist_icons.isEmpty()) {
            System.out.println("❌ No wishlist icons found on this page. Skipping wishlist click.");

        }
        WebElement wishlistIcon = all_wishlist_icons.get(randomIndex);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", wishlistIcon);
        Thread.sleep(500);
        try {
            wishlistIcon.click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", wishlistIcon);
        }

        System.out.println(" Clicked on Wishlist Icon at index: " + randomIndex);
        return goods;

    }

    public void check_product_name_wishlist_page() throws InterruptedException {
        if (goods == null || goods.isEmpty()) {
            System.out.println(" ERROR: 'goods' is null or empty. Cannot verify wishlist product.");
            return;
        }

        boolean found = false;

        for (WebElement product : product_name_wishlist_page) {
            if (product.getText().trim().equalsIgnoreCase(goods.trim())) {
                System.out.println(" Test Case Passed: Product is present in the wishlist.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(" Test Case Failed: Product is NOT present in the wishlist.");
        }

    }
    public void click_remove_wishlist()
    {
        remove_wishlist.click();
    }
    public void check_remove_confirm()
    {
        String expected_msg="Product successfully removed.";
        if(removed_confirm_msg.getText().contains(expected_msg))
        {
            System.out.println("Testcase passed");
        }else{
            System.out.println("Testcase Failed");
        }
    }
    public void enter_checkout_email()
    {
        checkout_email.sendKeys(faker.internet().emailAddress());
    }
    public void click_create_account_checkbox()
    {
        create_account_checkbox.click();
    }
    public void enter_create_password(String c_pwd)
    {
        create_password.sendKeys(c_pwd);
    }
    public void select_random_product() throws InterruptedException
    {

    if (products.isEmpty()) {
        System.out.println("❌ No products found on the page.");
        return;
    }
    
    Random rand = new Random();
    int randomIndex = rand.nextInt(products.size()); // Select a random index
    
    WebElement randomProduct = products.get(randomIndex);
    
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", randomProduct);
    System.out.println("✅ Clicking on Random Product: " + randomProduct.getText());
    Thread.sleep(2000);
    randomProduct.click();
    }
    public void click_buy_now()
    {
        buy_now.click();
    }
    public boolean check_email_textfield_empty()
    {
        String emailValue = checkout_email.getAttribute("value").trim(); 
    
    if (emailValue.isEmpty()) {
        System.out.println("❌ Email field is empty.");
        return true;
    } else {
        System.out.println("✅ Email field contains: " + emailValue);
        return false;
    }
    }
    public void click_header_cart()
    {
        header_cart.click();
    }
    public boolean check_cart_products()
    {
        for(WebElement product:cart_products)
        {
            if(product.isDisplayed())
            {
                return true;
                
            }
        }
        return false;
    }
    public void click_cart_checkout_btn()
    {
        cart_checkout_btn.click();
    }
    public void click_close_cart_btn()
    {
        close_cart_btn.click();
    }
    public void click_home_logo()
    {
        img_logo.click();
    }
    String p_name="";
    public void get_product_name()
    {
        p_name= product_title.getText();
    }

    public boolean check_cart_products_name() throws InterruptedException {
    
        boolean textFound = false;
    
        for (WebElement element : cart_products_name) {
            Thread.sleep(2000);
            String actualText = element.getAttribute("textContent").trim();  
            wait.until(ExpectedConditions.visibilityOf(element));
    
            if (actualText.contains(p_name)) {
                System.out.println("✅ Text Matched: " + actualText);
                textFound = true;
                break; 
            }
        }
    
        if (!textFound) {
            System.out.println("🚨 Test Case Failed: Expected text '" + p_name + "' not found in cart!");
        }
    
        return textFound;
    }
}

