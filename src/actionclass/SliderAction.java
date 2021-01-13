package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SliderAction {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://jqueryui.com/slider/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    public void main() throws InterruptedException {

        driver.get(baseURL);
        driver.switchTo().frame(0);
        Thread.sleep(2000);

        WebElement sliderElement = driver.findElement(By.xpath("//div[@id='slider']/span"));

        Actions action = new Actions(driver);
        action.clickAndHold(sliderElement).moveByOffset(175,0).build().perform();


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}