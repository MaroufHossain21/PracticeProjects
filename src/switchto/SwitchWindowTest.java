package switchto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SwitchWindowTest {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
     driver = new ChromeDriver();
     baseURL = "https://letskodeit.teachable.com/p/practice";
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     driver.get(baseURL);

    }

    @Test
    public void main() throws InterruptedException {

     //   String currentURL = driver.getCurrentUrl();
     //   System.out.println("Current URL: " + currentURL);

        // Get the handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle: " + parentHandle);

        //Find Open Window button
        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();

      //  String secondHandleURL = driver.getCurrentUrl();
      //  System.out.println("Second handle URL: " + secondHandleURL);

        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        for(String handle: handles){
            System.out.println(handle);
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchBox = driver.findElement(By.id("search-courses"));
                searchBox.sendKeys("python");
                Thread.sleep(2000);
                driver.close();
                break;

            }
            // Switch back to parent window
            driver.switchTo().window(parentHandle);
            driver.findElement(By.id("opentab")).click();


        }




    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }


}