package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    // Returns the flight origin/ departing from text box element
    public static WebElement departingTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-departure-airport0"));
        return element;
    }

    public static void fillDepartingTextBox(WebDriver driver, String departing){
        element = departingTextBox(driver);
        element.sendKeys(departing);

    }



    // Returns flight destination/ going to text box
    public static WebElement goingToTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-arrival-airport0"));
        return element;
    }


     // Returns the departure date text box element
    public static WebElement departureTextBox(WebDriver driver){
        element = driver.findElement(By.name("flight-date-range"));
        return element;

    }

    // Returns the search button box element
    public static WebElement findFlightButton(WebDriver driver){
        element = driver.findElement(By.id("HOME_FLIGHTS_SUBMIT_BUTTON"));
        return element;
    }

    // Returns the done button box element
    public static WebElement clickOnDonebutton(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@aria-label='Done']"));
       return element;
    }



    // Click on search button
    public static void clickOnFindFlightButton(WebDriver driver){
        element = findFlightButton(driver);
        element.click();
    }

    // Navigate to flights tabs


















}
