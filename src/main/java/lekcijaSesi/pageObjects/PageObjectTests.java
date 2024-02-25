package lekcijaSesi.pageObjects;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectTests extends QaProjectBaseTest {
    @Test
    public void checkAllElementsOnLndingPage() {
        QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
        Assert.assertEquals(qaProjectLandingPage.checkIfElementsExistOnPage(), true);
    }

    @Test
    public void succesfullRegistration() throws InterruptedException {
        Faker faker = new Faker();
        QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
        QaProjectLandingPage.registerLink.click();

        QaProjectRegisterPage qaProjectRegisterPage = new QaProjectRegisterPage(driver);
        qaProjectRegisterPage.nameInputField.sendKeys("Madara");
        qaProjectRegisterPage.lastNameInputField.sendKeys("Cerina");
        String emailAddress = faker.internet().emailAddress();
        qaProjectRegisterPage.emailInputField.sendKeys(emailAddress);
        qaProjectRegisterPage.emailConfirmInputField.sendKeys(emailAddress);
        qaProjectRegisterPage.birthDate.sendKeys("08/01/1988");
        qaProjectRegisterPage.registerFormHeaderSection.click();
        qaProjectRegisterPage.passwordInputField.sendKeys("pasw3456");
        qaProjectRegisterPage.confirmPaswordInputField.sendKeys("pasw3456");
        qaProjectRegisterPage.termsAndConditionsCheckbox.click();
        qaProjectRegisterPage.registerButton.click();
        Thread.sleep(2500);
    }

}
    //izsaukt jauno metodi fillInRegisterForm

