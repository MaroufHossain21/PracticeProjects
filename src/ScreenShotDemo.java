import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ScreenShotDemo {
    private WebDriver driver;
    private String baseURl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURl="https://www.facebook.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void main() {
        driver.get(baseURl);
        driver.findElement(By.name("login")).click();




    }

    @After
    public void tearDown() throws Exception {
        String filename = getRandomString(10) + ".png";
        String directory = System.getProperty("user.dir") + "//screenshots//";
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File(directory + filename));


       // Thread.sleep(3000);
        driver.quit();

    }


    public static String getRandomString(int length){
        StringBuilder sb = new StringBuilder();
        String characters ="abcdefghijklnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        for(int i=0; i< length; i++){
            int index = (int)(Math.random()* characters.length());
            sb.append(characters.charAt(index));

        }


           return sb.toString();

    }





}