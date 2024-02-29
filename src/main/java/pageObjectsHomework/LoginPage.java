package pageObjectsHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id="user-name")
    public static WebElement loginUsername;

    @FindBy(id="password")
    public static WebElement loginPassword;

    @FindBy(id="login-button")
    public static WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void sauceLogIn (){
        loginUsername.sendKeys("standard_user");
        loginPassword.sendKeys("secret_sauce");
        loginButton.click();
    }

    
}

