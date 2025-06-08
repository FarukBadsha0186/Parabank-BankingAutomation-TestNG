package tests;

import base.Setup;
import org.testng.annotations.Test;
import pages.Account_Overview_PAge;
import pages.LoginPage;
import pages.LogoutPage;
import pages.RegistrationPage;

public class RegistrationTestRunner extends Setup {

    RegistrationPage registrationPage;

    LogoutPage logoutPage;
    Account_Overview_PAge accountOverviewPAge;


    @Test(priority = 1)
    public void registrationMissing_requiredForm() {
        registrationPage = new RegistrationPage(getDriver());
        registrationPage.registrationPageGo();
        registrationPage.registration_missing_requiredForm();
    }
    @Test(priority = 2)
    public void registrationValiddata() throws InterruptedException {
        registrationPage = new RegistrationPage(getDriver());
      //  accountOverviewPAge = new Account_Overview_PAge(driver);
        registrationPage.registrationForm();
        logoutPage=new LogoutPage(getDriver());
        Thread.sleep(5000);
        logoutPage.logout();
        // loginPage.loginpage();
        //  accountOverviewPAge.accountOverView();

    }


}
