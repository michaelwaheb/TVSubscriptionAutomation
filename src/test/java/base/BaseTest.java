package base;

import io.qameta.allure.AllureLifecycle;
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
        // Navigate to a website
        driver.get("https://subscribe.stctv.com");
        //Mazimize current window
        driver.manage().window().maximize();
    }

    @AfterClass
    public void terminate()
    {
        driver.quit();

    }
}
