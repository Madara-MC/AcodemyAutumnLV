package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    WebDriver driver;
    @FindBy(id="first-name")
    public static WebElement firstName;

    @FindBy(id="last-name")
    public static WebElement lastName;

    @FindBy(id="postal-code")
    public static WebElement postalCode;

    @FindBy(id="continue")
    public static WebElement continueButton;

    @FindBy(xpath="//*[@class='error-message-container error']/h3")
            //*[@class='error-message-container error']/h3")
    //*[@id='checkout_info_container']/div/form/div[1]/div[4]/h3/text()"
    public static WebElement firstNameErrorMessage;


    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillCheckOut (){
        firstName.sendKeys("Zane");
        lastName.sendKeys("Ozola");
        postalCode.sendKeys("LV-1010");
        continueButton.click();
    }
}
