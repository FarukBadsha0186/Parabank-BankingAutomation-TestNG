package pages;

import base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends Setup {

    @FindBy(css = "a[href='logout.htm']")
    public WebElement logoutBtn;

    public LogoutPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logout(){
        logoutBtn.click();
    }
}