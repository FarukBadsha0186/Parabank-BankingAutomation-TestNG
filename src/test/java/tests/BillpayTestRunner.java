package tests;

import base.Setup;
import org.testng.annotations.Test;
import pages.BillPay;
import pages.LoginPage;

import static base.Setup.getDriver;

public class BillpayTestRunner extends Setup {

   BillPay billPay;
    LoginPage loginPage;

  //  @Test(priority = 1)
    public void Login_with_valid_data() {
        loginPage = new LoginPage(getDriver());
        loginPage.login_valid_data();
    }


//@Test(priority = 2)
@Test(priority = 1)
    public  void Bill() throws InterruptedException {
        billPay=new BillPay(getDriver());
        billPay.billpay();
        Thread.sleep(5000);

  }

   // @Test(priority = 3)
    @Test(priority = 2)
    public  void Service_Form_missing_info(){
        billPay=new BillPay(getDriver());
        billPay.Bill_Payment_missing_info();
    }

    //@Test(priority = 4)
    @Test(priority = 3)
    public void serviceForm(){
        billPay=new BillPay(getDriver());
        billPay.Bill_Payment_Service_Form();
    }
}
