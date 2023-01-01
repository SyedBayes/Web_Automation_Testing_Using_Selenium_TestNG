import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public abstract class BaseElement {
    private By locator;
    public BaseElement(By locator){
        this.locator=locator;
    }
    protected WebElement find(){

        return Browser.getDriver().findElement(locator);
    }
    public  boolean isDisplayed(){
        return find().isDisplayed();
    }
    public void click(){
        find().click();;
    }
}