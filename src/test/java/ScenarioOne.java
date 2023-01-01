
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ScenarioOne extends Browser{
    @Test
    public void invalidLogin() throws Exception{
        //check if main page is open
        DriverUtil driverUtil=new DriverUtil();
        driverUtil.openUrl();
        String actualTitle1 = Browser.getDriver().getTitle();
        String expectedTitle1 = "Welcome to Steam";
        Assert.assertEquals(actualTitle1,expectedTitle1,"Main Page is Open");
        //Login Page is open
        LoginPage loginPage = new LoginPage(By.cssSelector("#global_action_menu"));
        loginPage.click();
        Browser.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actualTitle2 = Browser.getDriver().getTitle();
        String expectedTitle2 = "Sign In";
        Assert.assertEquals(actualTitle2,expectedTitle2,"Login Page is Open");

        //Input Random Strings as Credentials and Click Sign In Button
        LoginPage loginPage1 = new LoginPage(By.cssSelector("[type='text']"));
//        loginPage1.clickOnUserField();
        RandomUtil randomUtil = new RandomUtil();
        String text = randomUtil.getString(5, true);
        loginPage1.sendTextforUser(text);

        LoginPage loginPage2 = new LoginPage(By.cssSelector("[type='password']"));
        loginPage2.clickOnPasswordField();
        RandomUtil randomUtil1 = new RandomUtil();
        String text1 = randomUtil1.getString(5, true);
        loginPage2.sendTextforPassword(text1);
        Button signIn = new Button(By.cssSelector("#responsive_page_template_content"));
        signIn.click();
        String actualTitle3 = Browser.getDriver().getTitle();
        String expectedTitle3 = "Sign In";
        Assert.assertEquals(actualTitle3,expectedTitle3,"Sign In");

    }

}
