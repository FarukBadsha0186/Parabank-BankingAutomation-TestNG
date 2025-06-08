package tests;

import base.Setup;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginTestRunner extends Setup {
    LoginPage loginPage;

    @Test(priority = 1)
    public void Login_with_invalid_data() {
        loginPage = new LoginPage(getDriver());
        loginPage.login_wrong_data();
    }

    @Test(priority = 2)
    public void Login_with_valid_data() {
        loginPage = new LoginPage(getDriver());
        loginPage.login_valid_data();
    }
}