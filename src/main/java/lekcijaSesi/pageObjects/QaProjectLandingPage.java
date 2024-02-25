package lekcijaSesi.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaProjectLandingPage extends QaProjectBaseTest {
    WebDriver driver;
    @FindBy(xpath = "//div[contains(@class,'top-0')]/a[text()='Home']")
    WebElement homeLink;

    @FindBy(xpath = "//div[contains(@class,'top-0')]/a[text()='Login']")
    WebElement loginLink;

    @FindBy(xpath = "//div[contains(@class,'top-0')]/a[text()='Register']")
    public static WebElement registerLink;

    @FindBy(xpath = "//div[@class='flex items-center']//a")
    WebElement QAPostsLink;

    public QaProjectLandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public boolean checkIfElementsExistOnPage(){
        return QAPostsLink.isDisplayed() && loginLink.isDisplayed() && registerLink.isDisplayed();
    }
}
