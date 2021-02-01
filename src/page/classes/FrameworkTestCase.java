package page.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class FrameworkTestCase {
    private WebDriver driver;
    private String baseURL;
    SearchPageFactory searchPage;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://www.priceline.com/ ";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseURL);

        searchPage = new SearchPageFactory(driver);


    }

    @Test
    public void test() throws Exception {
        searchPage.clickFlightsTab();
        searchPage.setDepartingFrom("Orlando");
        searchPage.setGoingTo("New York");
        searchPage.setDepartingReturning("11");


        Thread.sleep(2000);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}