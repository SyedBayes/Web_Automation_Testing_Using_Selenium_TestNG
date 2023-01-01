import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GamePage extends BasePage {
    private static By locator;
    private static By savedGameName = By.cssSelector("body > div:nth-child(1) > div:nth-child(7) > div:nth-child(6) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(3) > a:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1)");
    private static By savedReleaseDate = By.cssSelector("body > div:nth-child(1) > div:nth-child(7) > div:nth-child(6) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(3) > a:nth-child(1) > div:nth-child(2) > div:nth-child(2)");
    private static By savedPrice = By.cssSelector("body > div:nth-child(1) > div:nth-child(7) > div:nth-child(6) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(3) > a:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2)");
    private static By gameName = By.cssSelector("#appHubAppName");
    private static By releaseDate = By.cssSelector(".date");
    private static By price = By.cssSelector(".game_purchase_price.price");
    public GamePage(By elementLocator) {
        locator=elementLocator;
    }
    private static WebElement find(){

        return Browser.getDriver().findElement(locator);
    }
    public static void click(){
        find().click();;
    }
    protected WebElement findSavedGameName() {

        return Browser.getDriver().findElement(savedGameName);
    }
    public String getTextFromSavedGameName(){
        return findSavedGameName().getText();
    }
    protected WebElement findSavedReleaseDate() {

        return Browser.getDriver().findElement(savedReleaseDate);
    }
    public String getTextFromSavedReleaseDate(){
        return findSavedReleaseDate().getText();
    }
    protected WebElement findSavedPrice() {

        return Browser.getDriver().findElement(savedPrice);
    }
    public String getTextFromSavedPrice(){
        return findSavedPrice().getText();
    }
    protected WebElement findGameName() {

        return Browser.getDriver().findElement(gameName);
    }
    public String getTextFromGameName(){
        return findGameName().getText();
    }
    protected WebElement findReleaseDate() {

        return Browser.getDriver().findElement(releaseDate);
    }
    public String getTextFromReleaseDate(){
        return findReleaseDate().getText();
    }
    protected WebElement findPrice() {

        return Browser.getDriver().findElement(price);
    }
    public String getTextFromPrice(){
        return findPrice().getText();
    }






}
