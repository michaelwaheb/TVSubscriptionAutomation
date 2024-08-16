package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage
{

    //Locators
    private final By languagebutton = By.id("translation-btn");
    private final By countrybutton = By.id("country-btn");
    private final By countryname = By.id("country-name");
    private final By Litepackage = By.id("name-lite");
    private final By Classicpackage = By.id("name-classic");
    private final By Premiumpackage = By.id("name-premium");
    private final By Litepricecurrency = By.id("currency-lite");
    private final By Classicpricecurrency = By.id("currency-classic");
    private final By Premiumpricecurrency = By.id("currency-premium");


//Methods to interact
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void clickenglishlanguagebutton()
    {
        driver.findElement(languagebutton).click();

    }
    public String validateenglishlanguage()
    {
        return driver.findElement(languagebutton).getText();
    }

    public void opencountriespopup()
    {
        driver.findElement(countrybutton).click();
    }

    public void selectcountry(String country)
    {
        driver.findElement( By.id(country)).click();
    }
    public String actualcountryname()
    {
        return driver.findElement(countryname).getText();
    }
    public String ActualPackagetypelite()
    {
        return driver.findElement(Litepackage).getText();
    }
    public String ActualPackagelitePriceCurrency()
    {
      return driver.findElement(Litepricecurrency).getText();
    }
    public String ActualPackagetypeClassic()
    {
        return driver.findElement(Classicpackage).getText();
    }
    public String ActualPackageClassicPriceCurrency()
    {
        return driver.findElement(Classicpricecurrency).getText();
    }
    public String ActualPackagetypePermium()
    {
        return driver.findElement( Premiumpackage).getText();
    }
    public String ActualPackageePermiumPriceCurrency()
    {
        return driver.findElement( Premiumpricecurrency).getText();
    }


}
