import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private static By locator;

    private static Input userName = new Input((By.cssSelector("[type='text']")));
    private static Input password = new Input(By.cssSelector("[type='password']"));

    public LoginPage(By elementLocator) {
        locator=elementLocator;
    }

    private WebElement find(){

        return Browser.getDriver().findElement(locator);
    }

    public void click(){
        find().click();;
    }
    public void sendTextforUser(String text) {
         userName.sendText(text);
    }
    public void sendTextforPassword(String text) {
        password.sendText(text);
    }
    public void clickOnUserField(){
        userName.click();
    }
    public void clickOnPasswordField(){
        password.click();
    }
}
