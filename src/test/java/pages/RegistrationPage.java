package pages;

import base.Setup;
import com.github.javafaker.Faker;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPage extends Setup {

   // @FindBy(xpath = "//a[@href='register.htm']")
   @FindBy(xpath = "//a[contains(text(),'Register')]")
    public WebElement registerLink;
   @FindBy(name ="customer.firstName")
   public WebElement firstName;
    @FindBy(name = "customer.lastName")
    public WebElement lastName;

    @FindBy(name = "customer.address.street")
    public WebElement address;

    @FindBy(name = "customer.address.city")
    WebElement city;

    @FindBy(name = "customer.address.state")
    public WebElement state;

    @FindBy(name = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(name = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(name = "customer.ssn")
    public WebElement ssn;

    @FindBy(name = "customer.username")
    public  WebElement username;

    @FindBy(name = "customer.password")
    public  WebElement password;

    @FindBy(name = "repeatedPassword")
    public  WebElement confirmPassword;

    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerButton;


    public  RegistrationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public  void registrationPageGo(){
        registerLink.click();

    }

    public  void registration_missing_requiredForm(){

        Faker faker=new Faker();
        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().firstName());
        address.sendKeys(faker.name().firstName());
        city.sendKeys(faker.name().firstName());
        zipCode.sendKeys(faker.name().firstName());
        phoneNumber.sendKeys(faker.name().firstName());
        ssn.sendKeys(faker.name().firstName());
        username.sendKeys("farukparabank10");
        password.sendKeys("password123");
        confirmPassword.sendKeys("password123");
        registerButton.click();
        Assert.assertTrue(driver.findElement(By.id("customer.address.state.errors")).getText().equals("State is required."), "Expected state error message not found!");


    }


    public  void registrationForm(){

        Faker faker=new Faker();
        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().firstName());
        address.sendKeys(faker.name().firstName());
        city.sendKeys(faker.name().firstName());
        zipCode.sendKeys(faker.name().firstName());
        phoneNumber.sendKeys(faker.name().firstName());
        state.sendKeys(faker.name().firstName());
        ssn.sendKeys(faker.name().firstName());
        username.clear();
        username.sendKeys("farukparabank36");
        password.sendKeys("password123");
        confirmPassword.sendKeys("password123");
        registerButton.click();
     //   Assert.assertTrue(driver.getTitle().contains("farukparabank1"));
    //    Assert.assertTrue(driver.getTitle().contains("Welcome farukparabank3"), "Title does not contain expected username!");
        Assert.assertTrue(driver.findElement(By.cssSelector("h1.title")).getText().contains("farukparabank36"), "Welcome message does not contain expected username!");


    }
}
