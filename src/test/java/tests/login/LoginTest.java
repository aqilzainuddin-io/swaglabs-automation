package tests.login;

import setup.BaseTest;
import pages.login.LoginPage;
import setup.EnvReader;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void initPage() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void validLoginTest() {
        loginPage.login(EnvReader.get("VALID_USERNAME"), EnvReader.get("VALID_PASSWORD"));
    }
}
