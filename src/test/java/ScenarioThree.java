import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ScenarioThree {
    @Test
    public void gameInfo() throws Exception {
        //check if main page is open
        DriverUtil driverUtil=new DriverUtil();
        driverUtil.openUrl();
        HomePage homePage= new HomePage(By.cssSelector("div[class='home_cluster_ctn home_ctn'] h2[class='home_page_content_title']"));
        Assert.assertEquals(homePage.isHomePageDisplayed(),true,"Main Page is Open");

        //Enter "Dark Jungle" in the Search Field
        HomePage search_space = new HomePage(By.id("store_nav_search_term"));
        search_space.clickOnSearchField();
        search_space.sendText("Dark Jungle");
        SearchPage searchPage=new SearchPage(By.cssSelector("a[id='store_search_link'] img"));
        searchPage.click();

        //Saving Info of the 1st Game
        GamePage savedName = new GamePage(By.cssSelector("body > div:nth-child(1) > div:nth-child(7) > div:nth-child(6) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(3) > a:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1)"));
        GamePage savedDate = new GamePage(By.cssSelector("body > div:nth-child(1) > div:nth-child(7) > div:nth-child(6) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(3) > a:nth-child(1) > div:nth-child(2) > div:nth-child(2)"));
        GamePage savedPrice = new GamePage(By.cssSelector("body > div:nth-child(1) > div:nth-child(7) > div:nth-child(6) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(3) > a:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2)"));
        String strNameSaved = savedName.getTextFromSavedGameName();
        String strDateSaved = savedDate.getTextFromSavedReleaseDate();
        String strPriceSaved = savedPrice.getTextFromSavedPrice().replaceAll("[^\\d.]", "");
//        System.out.println(strNameSaved);
//        System.out.println(strDateSaved);
//        System.out.println(strPriceSaved);

        //Game Page is Open
        savedName.click();
        GamePage name = new GamePage(By.cssSelector("#appHubAppName"));
        GamePage date = new GamePage(By.cssSelector(".date"));
        GamePage price = new GamePage(By.cssSelector(".game_purchase_price.price"));
        String strName = name.getTextFromGameName();
        String strDate = date.getTextFromReleaseDate();
        String strPrice = price.getTextFromPrice().replaceAll("[^\\d.]", "");

//        System.out.println(strName);
//        System.out.println(strDate);
//        System.out.println(strPrice);
        Assert.assertEquals(strNameSaved,strName);
        Assert.assertEquals(strDateSaved,strDate);
        Assert.assertEquals(strPriceSaved,strPrice);

    }
}
