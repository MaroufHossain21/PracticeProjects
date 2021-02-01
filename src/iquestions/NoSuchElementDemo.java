package iquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NoSuchElementDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //String baseURL = "https://letskodeit.teachable.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.get(baseURL);

        /*// 1. Timing Issues
        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
       // WebElement emailField = driver.findElement(By.id("user_email"));
        //emailField.sendKeys("Test123");

        WebDriverWait wait = new WebDriverWait(driver,3);
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        emailField.sendKeys("Test123");

        // 2. Incorrect locator or type of locator
        driver.findElement(By.xpath("//a[@href='https://letskodeit.teachable.com/']")).click();*/

        // 3. Element in iFrame

        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.switchTo().frame("courses-iframe");
        driver.findElement(By.id("search-courses")).sendKeys("Java");
        driver.switchTo().defaultContent();






        Thread.sleep(2000);
        driver.quit();


    }












}
