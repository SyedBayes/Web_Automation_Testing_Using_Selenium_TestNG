import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutPage extends BasePage{
    private static By locator;
    private static By online = By.cssSelector("body > div:nth-child(1) > div:nth-child(7) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
    private static By inGame = By.cssSelector("div[class='online_stats'] div:nth-child(2)");
    public AboutPage(By elementLocator) {
        locator=elementLocator;
    }
    protected static WebElement find(){

        return Browser.getDriver().findElement(locator);
    }

    protected static void click(){
        find().click();
    }
    protected WebElement findOnlineField() {

        return Browser.getDriver().findElement(online);
    }
     public String getTextFromOnlineField(){
        return findOnlineField().getText();
    }
    protected WebElement findInGameField() {

        return Browser.getDriver().findElement(inGame);
    }
    public String getTextFromInGameField(){
        return findInGameField().getText();
    }


}
