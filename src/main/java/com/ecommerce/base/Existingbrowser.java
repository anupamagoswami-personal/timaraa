package com.ecommerce.base;

import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.devtools.v120.debugger.Debugger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Existingbrowser {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        Capabilities cap = driver.getCapabilities();
        Map<String, Object> mycap = cap.asMap();
        System.out.println(mycap);
    }

}
