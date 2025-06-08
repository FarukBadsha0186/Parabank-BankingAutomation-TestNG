package tests;

import base.Setup;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Transaction_History_Page;

public class Transaction_History_Runner extends Setup {

     Transaction_History_Page transactionHistoryPage;

    @Test(priority = 1)
    public void Login_with_invalid_data() {
        transactionHistoryPage = new Transaction_History_Page(getDriver());
        transactionHistoryPage.contactInfo();
    }
}
