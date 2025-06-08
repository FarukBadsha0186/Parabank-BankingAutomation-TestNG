package tests;

import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Account_Overview_PAge;
import pages.LoginPage;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class Accounts_TransferRunner extends Setup {

    Account_Overview_PAge accountOverviewPAge;
    LoginPage loginPage;



    @Test(priority = 1)
    public void login(){
        loginPage=new LoginPage(getDriver());
        loginPage.login_valid_data();

    }

    @Test(priority = 2)
    public void  invalid_amount() throws InterruptedException {

        accountOverviewPAge=new Account_Overview_PAge(getDriver());
        accountOverviewPAge.accountTransferinvalid_amount();
        Thread.sleep(500);


    }

    @Test(priority = 3)
    public void  accountOverview() throws InterruptedException {

        accountOverviewPAge=new Account_Overview_PAge(getDriver());

        accountOverviewPAge.accountOverView();
        Thread.sleep(5000);
        accountOverviewPAge.transferBtn.click();
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     //   WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title']")));

// Get and trim the text
   //     String actualText = heading.getText().trim();
   //     System.out.println("Actual Heading Text: '" + actualText + "'");

// Assert the text
   //     Assert.assertEquals(actualText, "Transfer Complete!", "Heading text did not match!");

    }
}
