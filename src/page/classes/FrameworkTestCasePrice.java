package page.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class FrameworkTestCasePrice {
    private WebDriver driver;
    private String baseURL;
    SearchPagePrice searchPage;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://www.priceline.com/";
        searchPage = new SearchPagePrice(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseURL);

    }

    @Test
    public void clickCarsTab() throws InterruptedException {


        searchPage.clickCarsTab();
        searchPage.setStartLocation("Orlando,FL");
        searchPage.setPickUp("02/11/2021");
        searchPage.setPickUpTime("4:00PM");
        searchPage.setDropOff("02/15/2021");


        Thread.sleep(3000);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}