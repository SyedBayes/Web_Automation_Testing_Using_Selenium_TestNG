import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends Browser {

    @Test
    public void checkFunctionalityFromMainPage() throws Exception {
        //check if main page is open
        DriverUtil driverUtil=new DriverUtil();
        driverUtil.openUrl();
        HomePage homePage= new HomePage(By.cssSelector("div[class='home_cluster_ctn home_ctn'] h2[class='home_page_content_title']"));
        Assert.assertEquals(homePage.isHomePageDisplayed(),true);

        // Input Random text in search field
        HomePage homePage1=new HomePage(By.id("store_nav_search_term"));
        RandomUtil randomUtil=new RandomUtil();
        String text= randomUtil.getString(5,false);
        homePage1.sendText(text);

        // check if text is displayed in the field
        Assert.assertEquals(homePage1.getTextFromSearchField(),text);

        //click search button
        SearchPage searchPage=new SearchPage(By.cssSelector("a[id='store_search_link'] img"));
        searchPage.click();

        //check if search page is open
        SearchPage searchPage1= new SearchPage(By.cssSelector(".searchbar"));
        Assert.assertEquals(searchPage1.isSearchPageDisplayed(), true);


    }

}
