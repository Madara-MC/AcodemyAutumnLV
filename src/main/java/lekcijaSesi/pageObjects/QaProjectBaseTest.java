package lekcijaSesi.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class QaProjectBaseTest {
    WebDriver driver;

    @BeforeMethod  //vienmer metode izsauksies pirms katra testa
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://qaproject.acodemy.lv/");
    }

    @AfterMethod
    public void closeBrowser (){
        driver.close();
    }
}
