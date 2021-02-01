package page.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.SearchPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class PageObjectModel {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
      baseURL = "https://www.priceline.com/?tab=flights&vrid=ed85c7d1bf39c61dbc7e5cdb3f860803";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void test(){
        driver.get(baseURL);
        //SearchPage.departingTextBox(driver).sendKeys("New York,NY-JFK");
        SearchPage.fillDepartingTextBox(driver, "New York,NY-JFK");
        SearchPage.goingToTextBox(driver).sendKeys("Orlando,FL- MCO");
        SearchPage.departureTextBox(driver).sendKeys("02/11/2021-02/13/2021");
        SearchPage.departureTextBox(driver).click();
        SearchPage.clickOnDonebutton(driver).click();
        SearchPage.findFlightButton(driver);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}