import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private static By locator;
    private static By searchLocator =By.cssSelector("#store_nav_search_term");
    private static By homePageLocator =By.cssSelector("div[class='home_page_content content_hub_carousel_ctn'] div[class='title']");
    private static Input searchField= new Input(By.cssSelector("#store_nav_search_term"));
    public HomePage(By elementLocator) {
        locator = elementLocator;

    }


    protected WebElement find() {

        return Browser.getDriver().findElement(homePageLocator);
    }

    public boolean isHomePageDisplayed() {

        return find().isDisplayed();
    }


    public void click() {

         find().click();
    }


    public void clickOnSearchField(){
        searchField.click();
    }

    public void sendText(String text) {

        searchField.sendText(text);
    }
    protected WebElement findSearchField() {

        return Browser.getDriver().findElement(searchLocator);
    }

    public String getTextFromSearchField(){
        return findSearchField().getAttribute("value");
    }
}
