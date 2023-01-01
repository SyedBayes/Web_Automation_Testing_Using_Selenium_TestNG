import org.openqa.selenium.WebDriver;

public class DriverUtil{
    protected static WebDriver driver;

    public static void openUrl(){
        Browser.getDriver().get("https://store.steampowered.com/");
    }
    public static void refreshPage(){
        Browser.getDriver().navigate().refresh();
    }
    public static void goToPreviousPage(){
        Browser.getDriver().navigate().back();
    }
}
