package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPagePrice {
    WebDriver driver;


    @FindBy(id="search-tab-cars")
    WebElement carsTab;

    @FindBy(id="startLocation")
    WebElement startLocation;

    @FindBy(xpath ="//input[@placeholder='Pick-up']")
    WebElement pickUp;

    @FindBy(xpath ="//input[@placeholder='Drop-off']")
    WebElement dropOff;

    @FindBy(id="startTime")
    WebElement pickUpTime;


    public SearchPagePrice(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void clickCarsTab(){
        carsTab.click();
    }

    public void setStartLocation(String location){
        startLocation.sendKeys(location);
    }

    public void setPickUp(String pickUpDate){
        pickUp.sendKeys(pickUpDate);
    }


    public void setDropOff(String dropOffDate){
        dropOff.sendKeys(dropOffDate);
    }

    public void setPickUpTime(String pickUp){
        pickUpTime.sendKeys(pickUp);
    }


}
