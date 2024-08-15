package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
    protected WebDriver driver;

    @BeforeClass
    public void setup()
    {
        driver  = new ChromeDriver();
        driver.get("https://subscribe.stctv.com");
    }

    @AfterClass
    public void terminate()
    {
        driver.quit();
    }
}
