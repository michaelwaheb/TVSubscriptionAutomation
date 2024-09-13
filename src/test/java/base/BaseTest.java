package base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Functions;

import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;



    @BeforeSuite
    @Step("Setup")
    public void setup() {
        driver = new ChromeDriver();
        // Navigate to a website
        driver.get("https://subscribe.stctv.com");
        System.out.println("Session started");
        //Mazimize current window
        driver.manage().window().maximize();
    }

    @AfterSuite
    @Step("Terminate")
    public void terminate()
    {

        driver.quit();
        System.out.println("Session terminated");

//Start then stop Allure serve after test finish
        try {
            Functions.startAndStopAllureServe();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}

