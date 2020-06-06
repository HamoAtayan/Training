package com.wa;

import helpers.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

/**
 * Created by Hmayak Atayan on  19, May, 2020
 */
public class Main {
    @Test
    public static void initDriverDevTools() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);


        driver.get(Config.getConfig("serverUrl"));


    }
}

