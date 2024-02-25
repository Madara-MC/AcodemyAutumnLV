package lekcijaSesi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MansPirmaisSeleniumTests extends BaseTest {

    @Test
    public void myFirstSeleniumTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver(); //atveram parlukprogrammu
        driver.manage().window().maximize();
        driver.get("https://www.google.lv");  //norada uz kuru lapu jaiet
        Thread.sleep(5000);
        driver.close(); //aizveram parlukprogrammu
    }
    @Test
    public void checkPageTitle (){
        driver.get("https://www.delfi.lv/life/56017218/atputa/51069183/latvijas-apcelosana-ar-velosipedu-interesants-marsruts-kurzeme");
        Assert.assertEquals(driver.getTitle(),"Latvijas apcelosana ar velosipedu","wrong title");

    }
    @Test
    public void checkUrl (){
        driver.get("https://www.macibaspieaugusajiem.lv/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.macibaspieaugusajiem.lv/","wrong page URL");
    }

}
