package pages;

import base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Setup {


    @FindBy(name = "username")
   public   WebElement loginUsername;

    @FindBy(name = "password")
    public WebElement loginPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void login_wrong_data(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        loginUsername.sendKeys("farukparabank9");
        loginPassword.sendKeys("password12345");
        loginButton.click();
    }
    public void login_valid_data(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        loginUsername.sendKeys("farukparabank36");
        loginPassword.sendKeys("password123");
        loginButton.click();
    }
}
