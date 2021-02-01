package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
   private WebDriver driver;



    @FindBy(id="search-tab-flights")
    WebElement flightsTab;

    @FindBy(id="flight-departure-airport0")
    WebElement departingFrom;

    @FindBy(id="flight-arrival-airport0")
    WebElement goingTo;

    @FindBy(id="flight-date-range")
    WebElement departingReturning;

    @FindBy(id="cabin-class-select")
    WebElement CabinClass;


    public SearchPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void clickFlightsTab(){
        flightsTab.click();

    }

    public void setDepartingFrom(String departing){
        departingFrom.sendKeys(departing);
    }

    public void setGoingTo(String going){
        goingTo.sendKeys(going);
    }

    public void setDepartingReturning(String deRe){
        departingReturning.sendKeys(deRe);
        departingReturning.click();

    }
















}
