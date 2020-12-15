import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class CalenderSelection {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://www.expedia.com/";
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void main() throws InterruptedException {

        driver.get(baseURL);

        WebElement selectFlight = driver.findElement(By.linkText("Flights"));
        selectFlight.click();

        WebElement departingDate = driver.findElement(By.xpath("//button[@id='d1-btn']"));
        departingDate.click();

        Thread.sleep(2000);

        WebElement dateSelect = driver.findElement(By.xpath("//button[@data-day='30']"));
        dateSelect.click();




    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }


}