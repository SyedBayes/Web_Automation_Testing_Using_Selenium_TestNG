import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Input extends BaseElement {
    private static By locator;
    public Input(By elementLocator) {
        super(elementLocator);
    }

    protected WebElement find(){

        return Browser.getDriver().findElement(locator);
    }
    public boolean isDisplayed(){
        return super.find().isDisplayed();
    }
    public void click(){
        super.find().click();;
    }

    public void sendText(String text){
        super.find().sendKeys(text);
    }

}