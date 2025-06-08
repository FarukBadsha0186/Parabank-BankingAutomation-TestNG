package tests;

import base.Setup;
import org.testng.annotations.Test;
import pages.LogoutPage;

public class LogoutPageRunner extends Setup {

    LogoutPage logoutPage;

    @Test(priority = 1)
    public void logout(){
        logoutPage=new LogoutPage(getDriver());
        logoutPage.logout();
    }
}
