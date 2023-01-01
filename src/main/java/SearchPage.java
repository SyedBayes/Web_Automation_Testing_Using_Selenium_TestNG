import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    private static By locator;
    private static By searchBarlocator=By.cssSelector(".searchbar");

    public SearchPage(By elementLocator) {
        locator=elementLocator;
    }

    private WebElement find(){

        return Browser.getDriver().findElement(locator);
    }
    public  boolean isSearchPageDisplayed(){

        return Browser.getDriver().findElement(searchBarlocator).isDisplayed();
    }
    public void click(){
        find().click();;
    }

}