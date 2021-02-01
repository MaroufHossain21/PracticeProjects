package iquestions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class StaleElementDemo {
    private WebDriver driver;
    private String baseURL;

    @Test
    public void main() throws InterruptedException {
        driver = new ChromeDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseURL);

        // Stale Exception in order below
       /* WebElement checkBox = driver.findElement(By.id("bmwcheck"));
        driver.get(driver.getCurrentUrl());
        checkBox.click();*/
        
        // No more Stale Exception
        driver.get(driver.getCurrentUrl());
        WebElement checkBox = driver.findElement(By.id("bmwcheck"));
        checkBox.click();

        Thread.sleep(2000);
        driver.quit();




    }
}