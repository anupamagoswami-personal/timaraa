package com.ecommerce.base;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
    public static WebDriver driver;

    public void launch() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("debuggerAddress", "localhost:44473");
        driver = new ChromeDriver(options);
        driver.get("https://timaraa.weavers-web.com/");
        driver.manage().window().maximize();

    }

    public static String randomstring() {
        String randomname = RandomStringUtils.randomAlphabetic(6);
        return randomname;
    }

    public static String randomnumber() {
        String randomphone = "91" + RandomStringUtils.randomNumeric(8);
        return randomphone;
    }

    public static String randomemail() {
        String randomemail = RandomStringUtils.randomAlphabetic(5) + "@yopmail.com";
        return randomemail;
    }
    public static String random_password() {
        String random_pass = "Test@" + RandomStringUtils.randomNumeric(10);
        return random_pass;
    }


    public static void windowhandle() {
        String mainWindow = driver.getWindowHandle();

        // Open a new tab/window (assuming it opens another window)
        driver.findElement(By.xpath("//a[@target='_blank']")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Switch back to the main window
        driver.switchTo().window(mainWindow);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    public static Faker faker = new Faker();
    public static void Faker_random()
    {
        String fullName = faker.name().fullName(); // Full Name
        String firstName = faker.name().firstName(); // First Name
        String lastName = faker.name().lastName(); // Last Name
        String email = faker.internet().emailAddress(); // Email
        String phone = faker.phoneNumber().cellPhone(); // Phone Number
        String city = faker.address().city(); // City
        String state = faker.address().state(); // State
        String zipCode = faker.address().zipCode(); // Zip Code
        String streetAddress = faker.address().streetAddress(); // Street Address
        String company = faker.company().name(); // Company
        String jobTitle = faker.job().title(); // Job Title
    }
    private static final String URL = "sql313.infinityfree.com";
private static final String USER = "if0_38670396";
private static final String PASSWORD = "9DW3zrOTvFT";

}
