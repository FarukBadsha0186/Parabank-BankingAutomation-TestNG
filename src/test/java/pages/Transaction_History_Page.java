package pages;

import base.Setup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction_History_Page extends Setup {

    @FindBy(id = "amount")
    public WebElement amountInput;

    @FindBy(id = "findByAmount")
    public WebElement findTransactionsButton;

    public Transaction_History_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public void contactInfo( ){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", findTransactionsButton);

        amountInput.clear();
        amountInput.sendKeys("500");
        findTransactionsButton.click();
    }

}
