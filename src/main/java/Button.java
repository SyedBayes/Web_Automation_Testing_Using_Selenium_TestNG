import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Button extends BaseElement {
    private static By locator;

    public Button(By elementLocator){
        super(elementLocator);
    }

    protected WebElement find(){

        return super.find();
    }

    public boolean isDisplayed(){

        return super.isDisplayed();
    }

    public void click(){
        super.click();
    }
}
