package lekcijaSesi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MansOtraisSelenium extends BaseTest {

    private void attemptToLogIn(String email, String password) throws InterruptedException {
        driver.get("https://qaproject.acodemy.lv/login");

        WebElement loginEmailInput = driver.findElement(By.id("email"));
        WebElement loginPasswordlInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("btn-primary"));

        loginEmailInput.sendKeys(email);
        loginPasswordlInput.sendKeys(password);
        System.out.println("Mans otrais selenium tests");
        loginButton.click();

    }

    @Test
    public void succesfullLoginTest() throws InterruptedException {
    attemptToLogIn("emilysinclair@gmail.com","qwerty123456#");

    WebElement nameDropDown = driver.findElement(By.id("navbarDropdown"));
    Assert.assertEquals(driver.getCurrentUrl(),"https://qaproject.acodemy.lv/home", "User is not navigatet to home URL");
    Assert.assertEquals(nameDropDown.getText(),"Emily","Wrong username visible in user dropdown");
    }

    @Test
    public void wrongCredentioalsLoginTest() throws InterruptedException {
        attemptToLogIn("wrong@gmail.com","whasaukegthj23");
        WebElement emailFieldError = driver.findElement(By.className("invalid-feedback"));
        Assert.assertEquals(emailFieldError.getText(),"These credentials do not match our records.");


    }
}
