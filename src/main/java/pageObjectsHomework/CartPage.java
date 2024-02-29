package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']")
    public static WebElement boltShirt;
    @FindBy(id="checkout")
    public static WebElement checkoutButton;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
