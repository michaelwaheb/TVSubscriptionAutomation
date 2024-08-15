package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

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

    public void opencountrypopup()
    {
        driver.findElement(countrybutton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public void selectcountry(String country)
    {
        driver.findElement( By.id(country)).click();
    }
    public String countryname()
    {
        return driver.findElement(countryname).getText();
    }
    public String ValidatePackagelite()
    {
        return driver.findElement(Litepackage).getText();
    }
    public String ValidatePackagelitePrice()
    {
      return driver.findElement(Litepricecurrency).getText();
    }
    public String ValidatePackageClassic()
    {
        return driver.findElement(Classicpackage).getText();
    }
    public String ValidatePackageClassicPrice()
    {
        return driver.findElement(Classicpricecurrency).getText();
    }
    public String ValidatePackagePermium()
    {
        return driver.findElement( Premiumpackage).getText();
    }
    public String ValidatePackagePermiumPrice()
    {
        return driver.findElement( Premiumpricecurrency).getText();
    }


}
