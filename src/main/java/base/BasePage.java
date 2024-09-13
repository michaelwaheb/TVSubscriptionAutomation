package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class BasePage
{
    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void click(By locator)
    {
        driver.findElement(locator).click();
    }
    public String gettext(By locator)
    {
        return driver.findElement(locator).getText();
    }



}
