package lekcijaSesi.pageObjects;

import lekcijaSesi.BaseTest;
import lekcijaSesi.pageObjects.pageObjects1a.OneLandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class BrowserNavigation extends BaseTest {
    @Test
    public void testBrowserNavigation() throws InterruptedException {
        driver.get("http://www.1a.lv");
        WebElement smartNetBanner = driver.findElement(By.className("smart-net-banner__info-button-text"));
        smartNetBanner.click();
        List<WebElement> listOnInputFields = driver.findElements(By.className("users-session-form__input--text"));

        for (WebElement listOnInputField : listOnInputFields) {
            listOnInputField.sendKeys("Madara");
        }
        Thread.sleep(1000);


        //back
        WebDriver.Navigation navigate = driver.navigate();
        navigate.back();

        //forward
        driver.navigate().forward();
        Thread.sleep(2500);

        //refresh
        driver.navigate().refresh();
    }

    //ja jātestē kad kaut ko noklišķinot kaut kas izmainijies, piemāram ka cookies banner (logs, cits statuss)
    @Test
    public void testAcceptCookies() throws InterruptedException {
        driver.get("http://www.1a.lv");
        WebElement acceptAllCookiesButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertTrue(cookieBanner.isDisplayed(),"Cookie banner is not displayed");
        System.out.println(cookieBanner.getTagName());
        assertEquals(cookieBanner.getCssValue("display"), "block");
        acceptAllCookiesButton.click();
        Assert.assertFalse(cookieBanner.isDisplayed(),"Cookie banner is displayed");
        assertEquals(cookieBanner.getCssValue("display"), "none");
        Thread.sleep(2500);
    }

//ka parbaudit ka elements neeksiste uz lapas (piemeram cookies pec aizvershanas)
    @Test
    public void test220Cookies() throws InterruptedException {
        driver.get("https://220.lv/lv/");
        WebElement cookieBlock = driver.findElement(By.className("cookie_wrapper"));
        Assert.assertTrue(cookieBlock.isDisplayed(),"Cookie block is not displayed");

        Assert.assertFalse(cookieBlock.isDisplayed(),"Cookie block is displayed");

    }

    //<div uc sakumi tie ir tagi; class, name, lang utt tie ir atributi;
    // testa kludas pazinojuma "stale element reference"
    //FindElemnts (ar S beigas), lieto, ja japarbauda visi elementi kas ir lapa, ka tads elements tur tiesham neeksistee
    @Test
    public void testAttributeIn1a () throws InterruptedException {
        driver.get("http://www.1a.lv");
        OneLandingPage oneLandingPage = new OneLandingPage(driver);
        List<WebElement> languageElements = driver.findElements(By.xpath("//li[contains(@class,'language-switcher')]/a"));
        assertEquals(OneLandingPage.cookieBanner.getAttribute("lang"),"lv");
        //oneLandingPage.switchLanguage("RU");
        languageElements.get(1).click();
        Thread.sleep(2500);
        Assert.assertEquals(OneLandingPage.cookieBanner.getAttribute("lang"),"ru");
        oneLandingPage.switchLanguage("LV");
        Assert.assertEquals(OneLandingPage.cookieBanner.getAttribute("lang"),"lv");
    }
    @Test
    public void testKeyboardActions() throws InterruptedException {
        driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/");
        new Actions(driver).keyDown(Keys.CONTROL).sendKeys("K").perform();
        Thread.sleep(2500);
        new Actions(driver).sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2500);
    }
}
