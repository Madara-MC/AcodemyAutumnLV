package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    WebDriver driver;
    @FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
    public static WebElement addShirtButton;
    @FindBy(id="shopping_cart_container")
    public static WebElement goToCart;
    //

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}
