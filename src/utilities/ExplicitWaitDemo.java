package utilities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class ExplicitWaitDemo {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL= "https://letskodeit.teachable.com/";
        driver.manage().window().maximize();

    }

    @Test
    public void waitForElement() {
        driver.get(baseURL);
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        WebDriverWait wait = new WebDriverWait(driver,3);
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        System.out.println("Great Success ");
        emailField.sendKeys("Testing123");

        //driver.findElement(By.id("user_email")).sendKeys("testing123");





    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();

    }


}