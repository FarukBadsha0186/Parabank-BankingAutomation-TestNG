package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import java.time.Duration;

public class Setup {
    protected static WebDriver driver;

    @BeforeSuite
    public void setup() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/parabank/index.htm");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

   // @AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
