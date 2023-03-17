package com.browserstack;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends SeleniumTest {

    @Test
    public void test() throws Exception {
        driver.get("https://login.salesforce.com/?locale=in");

        driver.findElement(By.id("username")).sendKeys("vinod.bendre@axtria.com.int");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("@xtria@123");
        Thread.sleep(2000);
        driver.findElement(By.id("Login")).click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;


    }
}
