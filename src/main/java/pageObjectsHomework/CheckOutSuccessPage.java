package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutSuccessPage {
    WebDriver driver;
    //div[@class='card-header' and text()='Dashboard']
    @FindBy(xpath = "//*[@id='checkout_complete_container']/h2")
    public static WebElement orderComplete;

    @FindBy(id="back-to-products")
    public static WebElement backHome;

    public CheckOutSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
