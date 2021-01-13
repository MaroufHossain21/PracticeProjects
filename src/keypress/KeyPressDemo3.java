package keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class KeyPressDemo3 {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver  = new ChromeDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void main() throws InterruptedException {
        driver.get(baseURL);
        Thread.sleep(2000);

        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();




    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}