package tests;

import base.Setup;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Profile;

public class ProfileTestRunner extends Setup {


    LoginPage loginPage;
    Profile profile;
 //   @Test(priority = 1)
    public void Login_with_valid_data() {
        loginPage = new LoginPage(getDriver());
        loginPage.login_valid_data();
    }

  //  @Test(priority = 2)
    @Test(priority = 1)
    public void ContactpageGo() {
        profile = new Profile(getDriver());
        profile.contactInfo();
    }

   // @Test(priority = 3)
    @Test(priority = 2)
    public void Update_contact_information() {
        profile = new Profile(getDriver());
        profile.Modify_Contact_Information();
       // Profile.TransactionBtn.click();
        profile.TransactionBtn.click();
    }
}
