package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverviewPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='summary_subtotal_label' and text()='15.99']")
    public static WebElement checkoutShirt;
    @FindBy(id="finish")
    public static WebElement finishButton;
    //


    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
