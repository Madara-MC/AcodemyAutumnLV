package pageObjectsHomework;

import lekcijaSesi.pageObjects.QaProjectLandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static pageObjectsHomework.LoginPage.*;

public class TestsSauceDemo {
    protected WebDriver driver;

    @BeforeMethod  //vienmer metode izsauksies pirms katra testa
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void closeBrowser (){
        driver.close();
    }


    @Test
    public void firstScenario () throws InterruptedException {
        WebElement sauceUsername = driver.findElement(By.id("user-name"));
        WebElement saucePassword = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        sauceUsername.sendKeys("standard_user");
        saucePassword.sendKeys("secret_sauce");
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","wrong page URL");
        WebElement addShirtButton = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addShirtButton.click();
        WebElement goToCart = driver.findElement(By.id("shopping_cart_container"));
        goToCart.click();
        Thread.sleep(2500);
    }
}
