package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFact {
    WebDriver driver;

    @FindBy(id="search-tab-flights")
    WebElement flightsTab;

    @FindBy(id="cabin-class-select")
    WebElement cabinClass;

    @FindBy(id="search-tab-vacations")
    WebElement cruisesTab;


    public void clickFlightsTab(){
        flightsTab.click();
    }

    public void clickCabinClass(){
        cabinClass.click();
    }

    public void clickCruisesTab(){
        cruisesTab.click();
    }








}
