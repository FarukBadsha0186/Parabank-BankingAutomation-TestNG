package pages;

import base.Setup;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BillPay extends Setup {


    @FindBy(css = "a[href='billpay.htm']")
    public WebElement billpayBtn;

    @FindBy(name = "payee.name")
    public WebElement txtPayeeName;

    @FindBy(name = "payee.address.street")
    public WebElement txtAddress;

    @FindBy(name = "payee.address.city")
    public WebElement txtCity;

    @FindBy(name = "payee.address.state")
    public WebElement txtState;

    @FindBy(name = "payee.address.zipCode")
    public WebElement txtZipCode;

    @FindBy(name = "payee.phoneNumber")
    public WebElement txtPhone;

    @FindBy(name = "payee.accountNumber")
    public WebElement txtAccountNumber;

    @FindBy(name = "verifyAccount")
    public WebElement txtVerifyAccountNumber;

    @FindBy(name = "amount")
    public WebElement txtAmount;

    @FindBy(name = "fromAccountId")
    public WebElement ddlFromAccount;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement btnSendPayment;


    public BillPay(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void billpay(){
        billpayBtn.click();
    }

    public void Bill_Payment_missing_info(){

        Faker faker = new Faker();
        txtPayeeName.sendKeys(faker.name().fullName());
        txtAddress.sendKeys(faker.address().streetAddress());
        txtCity.sendKeys(faker.address().city());
     //   txtState.sendKeys(faker.address().stateAbbr());
        txtZipCode.sendKeys(faker.address().zipCode());
        txtPhone.sendKeys(faker.phoneNumber().subscriberNumber(10));

        String acc = faker.finance().iban().replaceAll("[^0-9]", "").substring(0, 9);
        txtAccountNumber.sendKeys(acc);
        txtVerifyAccountNumber.sendKeys(acc);
        txtAmount.sendKeys("500");

        Select select = new Select(ddlFromAccount);
        select.selectByIndex(0);

        btnSendPayment.click();


    }
    public void Bill_Payment_Service_Form(){

        Faker faker = new Faker();
        txtPayeeName.sendKeys(faker.name().fullName());
        txtAddress.sendKeys(faker.address().streetAddress());
        txtCity.sendKeys(faker.address().city());
        txtState.sendKeys(faker.address().stateAbbr());
        txtZipCode.sendKeys(faker.address().zipCode());
        txtPhone.sendKeys(faker.phoneNumber().subscriberNumber(10));

        String acc = faker.finance().iban().replaceAll("[^0-9]", "").substring(0, 9);
        txtAccountNumber.sendKeys(acc);
        txtVerifyAccountNumber.sendKeys(acc);
        txtAmount.sendKeys("500");

        Select select = new Select(ddlFromAccount);
        select.selectByIndex(0);

        btnSendPayment.click();


    }
}
