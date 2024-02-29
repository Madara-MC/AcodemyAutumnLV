package seleniumHomework;

import lekcijaSesi.pageObjects.pageObjects1a.OneLandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsHomework.*;


import java.time.Duration;

import static pageObjectsHomework.CartPage.checkoutButton;
import static pageObjectsHomework.CheckOutOverviewPage.finishButton;
import static pageObjectsHomework.CheckOutPage.*;
import static pageObjectsHomework.CheckOutSuccessPage.backHome;
import static pageObjectsHomework.InventoryPage.addShirtButton;
import static pageObjectsHomework.InventoryPage.goToCart;
import static pageObjectsHomework.LoginPage.*;


public class SauceDemoTests {
     WebDriver driver;

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
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sauceLogIn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","wrong page URL");
        InventoryPage inventoryPage = new InventoryPage(driver);
        addShirtButton.click();
        goToCart.click();
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.boltShirt.isDisplayed(),"Bolt shirt is not in the cart!");
        checkoutButton.click();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.fillCheckOut();
        Assert.assertTrue(cartPage.boltShirt.isDisplayed(),"Bolt shirt is not in the overview page!");
        CheckOutOverviewPage checkOutOverviewPage = new CheckOutOverviewPage(driver);
        Assert.assertTrue(checkOutOverviewPage.checkoutShirt.isDisplayed(), "Item total is incorrect");
        finishButton.click();
        CheckOutSuccessPage checkOutSuccessPage = new CheckOutSuccessPage(driver);
        Assert.assertTrue(checkOutSuccessPage.orderComplete.isDisplayed(),"Order not succesfull!");
        backHome.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","you are at the wrong page");
        Thread.sleep(5000);
    }
    @Test
    public void secondScenario () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sauceLogIn();
        InventoryPage inventoryPage = new InventoryPage(driver);
        goToCart.click();
        CartPage cartPage = new CartPage(driver);
        checkoutButton.click();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        continueButton.click();
        String nameCorrect = errorMessage.getText();
        String expectName = "Error: First Name is required";
        Assert.assertEquals(nameCorrect,expectName);
        firstName.sendKeys("Liene");
        continueButton.click();
        String lastCorrect = errorMessage.getText();
        String expectLast = "Error: Last Name is required";
        Assert.assertEquals(lastCorrect,expectLast);
        lastName.sendKeys("Upe");
        continueButton.click();
        String postCorrect = errorMessage.getText();
        String expectPost = "Error: Postal Code is required";
        Assert.assertEquals(postCorrect,expectPost);

    }

}
