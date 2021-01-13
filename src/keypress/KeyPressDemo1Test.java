package keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.tools.jconsole.Tab;

import javax.swing.text.TabableView;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class KeyPressDemo1Test {
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
        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();

        driver.findElement(By.id("user_email")).sendKeys("Test123@test.com");
        Thread.sleep(2000);

        driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);
        /*driver.findElement(By.id("user_password")).sendKeys("Test123");
        Thread.sleep(2000);

        driver.findElement(By.name("commit")).sendKeys(Keys.RETURN);*/


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}