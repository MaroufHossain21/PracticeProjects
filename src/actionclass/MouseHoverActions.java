package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MouseHoverActions {
    private WebDriver driver;
    private String baseURL;
    JavascriptExecutor jse;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";
        jse = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);


    }

    @Test
    public void main() throws InterruptedException {
        driver.get(baseURL);
        jse.executeScript("window.scrollBy(0, 600)");
        Thread.sleep(2000);

        WebElement mainElement = driver.findElement(By.id("mousehover"));

        Actions action = new Actions(driver);
        action.moveToElement(mainElement).perform();
        Thread.sleep(2000);

        WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
        action.moveToElement(subElement).click().perform();
        Thread.sleep(2000);

        jse.executeScript("window.scrollBy(0, 600)");
        Thread.sleep(2000);

        WebElement mainElement1 = driver.findElement(By.id("mousehover"));

        Actions action1 = new Actions(driver);
        action.moveToElement(mainElement1).perform();
        Thread.sleep(2000);

        WebElement subElement1 = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Reload']"));
        action.moveToElement(subElement1).click().perform();
        Thread.sleep(2000);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

}