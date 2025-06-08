package pages;

import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Account_Overview_PAge extends Setup {



    @FindBy(css = "a[href='overview.htm']")
    public WebElement accountOverviewBtn;


    @FindBy(css = "a[href='transfer.htm']")
    public WebElement FundsTransferBTn;

    @FindBy(id = "amount")
    public  WebElement amountBtn;

    @FindBy(id = "fromAccountId")
    public  WebElement fromId;

    @FindBy(id = "toAccountId")
    public  WebElement reciverIdId;

    @FindBy(css = "input.button[value='Transfer']")
    public  WebElement transferBtn;
    public Account_Overview_PAge(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void accountTransferinvalid_amount(){
        accountOverviewBtn.click();
        FundsTransferBTn.click();
        amountBtn.sendKeys("jbhubh");
        WebElement fromDropdown = driver.findElement(By.xpath("//select[contains(@id,'from')]"));
        fromDropdown.isSelected();

        WebElement toDropdown = driver.findElement(By.xpath("//select[contains(@id,'to')]"));
        toDropdown.isSelected();
        transferBtn.click();

       /* String headingText = driver.findElement(By.cssSelector("h1.title")).getText();
        Assert.assertEquals(headingText, "Transfer Complete!", "Expected heading 'Transfer Complete!' not found!");*/
        //    Assert.assertEquals(driver.findElement(By.cssSelector("h1.title")).getText(), "Transfer Complete!", "Expected heading 'Transfer Complete!' not found!");


    }

    public void accountOverView(){

        FundsTransferBTn.click();
        amountBtn.sendKeys("500");
        WebElement fromDropdown = driver.findElement(By.xpath("//select[contains(@id,'from')]"));
        fromDropdown.isSelected();

        WebElement toDropdown = driver.findElement(By.xpath("//select[contains(@id,'to')]"));
        toDropdown.isSelected();
      //  transferBtn.click();


    }
}
