package pages;

import base.Setup;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile extends Setup {



    @FindBy(css="a[href='updateprofile.htm']")
    public WebElement contactinfoBtn;

    @FindBy(id = "customer.lastName")
    public WebElement txtLastName;

    @FindBy(id = "customer.address.street")
    public WebElement txtStreetAddress;

    @FindBy(id = "customer.address.city")
    public WebElement txtCity;

    @FindBy(id = "customer.phoneNumber")
    public WebElement txtPhoneNumber;

    @FindBy(css = "input.button[value='Update Profile']")
    public WebElement updateProfileButton;

    @FindBy(css="a[href='findtrans.htm']")
    public WebElement TransactionBtn;


    public Profile(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public void contactInfo(){
        contactinfoBtn.click();
    }

    public void Modify_Contact_Information(){
        Faker faker = new Faker();

        txtLastName.clear();
        txtLastName.sendKeys(faker.name().lastName());

        txtStreetAddress.clear();
        txtStreetAddress.sendKeys(faker.address().streetAddress());

        txtCity.clear();
        txtCity.sendKeys(faker.address().city());

        txtPhoneNumber.clear();
        txtPhoneNumber.sendKeys(faker.phoneNumber().subscriberNumber(10));
        updateProfileButton.click();

    }
}
