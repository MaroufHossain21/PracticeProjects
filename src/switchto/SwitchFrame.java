package switchto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SwitchFrame {
    private WebDriver driver;
    private String baseURL;



    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL= "https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get(baseURL);


    }
    @Test
    public void main() throws InterruptedException {
        Thread.sleep(2000);
        //driver.switchTo().frame("courses-iframe");
        driver.switchTo().frame("iframe-name");

        WebElement searchBox = driver.findElement(By.id("search-courses"));
        searchBox.sendKeys("python");

        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.findElement(By.name("enter-name")).sendKeys("Great Success");

        Thread.sleep(2000);
        //find frame by index
        driver.switchTo().frame(0);
        searchBox.clear();
        System.out.println("Switched frame with index: ");

        Thread.sleep(2000);
        searchBox.sendKeys("Java is cool :) ");
        System.out.println("Switched back for the 2rd time: " + searchBox.getTagName());




    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}