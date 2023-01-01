import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Integer.parseInt;

public class ScenarioTwo extends Browser{
    @Test
    public void gamersNumber() throws Exception{
        //check if main page is open
        DriverUtil driverUtil=new DriverUtil();
        driverUtil.openUrl();
        String actualTitle1 = Browser.getDriver().getTitle();
        String expectedTitle1 = "Welcome to Steam";
        Assert.assertEquals(actualTitle1,expectedTitle1,"Main Page is Open");

        //About Page is open
        AboutPage aboutPage = new AboutPage(By.cssSelector(".supernav_container > a:nth-of-type(3)"));
        AboutPage.click();
        String actualTitle2 = Browser.getDriver().getTitle();
        String expectedTitle2 = "Steam, The Ultimate Online Game Platform";
        Assert.assertEquals(actualTitle2,expectedTitle2,"About Page is Open");
        Browser.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Compare number of players online and in-game
        AboutPage online = new AboutPage(By.xpath("(//div[@class='online_stat'])[1]"));
        String value1 = online.getTextFromOnlineField().replaceAll("[^\\d.]", "");
        AboutPage inGame = new AboutPage(By.xpath("(//div[@class='online_stat'])[2]"));
        String value2 = inGame.getTextFromInGameField().replaceAll("[^\\d.]", "");
        int numOnlinePLayers = parseInt(value1);
        int numInGamePlayers = parseInt(value2);
        Assert.assertTrue(numOnlinePLayers > numInGamePlayers);

        //Store Page is Open
        AboutPage storePage = new AboutPage(By.cssSelector(".menuitem.supernav[href='https://store.steampowered.com/?snr=1_14_4__global-header']"));
        storePage.click();
        String actualTitle3 = Browser.getDriver().getTitle();
        String expectedTitle3 = "Welcome to Steam";
        Assert.assertEquals(actualTitle2,expectedTitle2,"Store Page is Open");




    }

}
