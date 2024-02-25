package homework.firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsHomework extends BaseTestH{
    private void attemptToLogIn(String username, String password) throws InterruptedException {

        WebElement loginEmailInput = driver.findElement(By.id("user-name"));
        WebElement loginPasswordlInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("btn_action"));

        loginEmailInput.sendKeys(username);
        loginPasswordlInput.sendKeys(password);
        loginButton.click();
        Thread.sleep(2500);
    }
    @Test
    public void emptyUsername () throws InterruptedException {
        attemptToLogIn("","secret_sauce");
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessage.getText(),"Epic sadface: Username is required","Wrong error message appears when no username is entered");
    }
    @Test
    public void emptyPassword () throws InterruptedException {
        attemptToLogIn("problem_user", "");
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessage.getText(), "Epic sadface: Password is required", "Wrong error message appears when no password is entered");
    }
    @Test
    public void emptyFields () throws InterruptedException {
        attemptToLogIn("", "");
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessage.getText(), "Epic sadface: Username is required", "Wrong error message appears when all fields are left empty");
    }
    @Test
    public void wrongCredentials () throws InterruptedException {
        attemptToLogIn("madara","asdf123");
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessage.getText(),"Epic sadface: Username and password do not match any user in this service", "Wrong error message appears when incorrect username and password entered");
    }
    @Test
    public void wrongPassword () throws InterruptedException {
        attemptToLogIn("problem_user", "asdf123");
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessage.getText(), "Epic sadface: Username and password do not match any user in this service", "Wrong error message appears when incorrect password entered");
    }
// correct user, wrong password
    //wrong user, correct password
    //only one letter as user
    //one symbol as password
    //username numbers or symbols

}
