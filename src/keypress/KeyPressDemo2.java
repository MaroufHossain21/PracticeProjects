package keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class KeyPressDemo2 {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
         driver = new ChromeDriver();
         baseURL = "https://letskodeit.teachable.com/p/practice";
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void main() throws InterruptedException {
        driver.get(baseURL);

        //driver.findElement(By.id("bmwradio")).sendKeys(Keys.COMMAND + " a ");
        //Thread.sleep(2000);

      //  driver.findElement(By.id("bmwradio")).sendKeys(Keys.chord(Keys.COMMAND, "a"));
       // Thread.sleep(2000);

        String selectAll = Keys.chord(Keys.COMMAND, "a");
        driver.findElement(By.id("bmwradio")).sendKeys(selectAll);
        Thread.sleep(2000);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}