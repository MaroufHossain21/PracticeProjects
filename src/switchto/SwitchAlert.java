package switchto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SwitchAlert {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL="https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseURL);

    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Mar");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Hoss");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }


    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }


}