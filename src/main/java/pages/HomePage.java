package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage
{

    //Locators
    private final By language = By.id("translation-btn");
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

    public HomePage clickenglishlanguagebutton()
    {
        if (gettext(language).equals("English"))
        {
            click(language);
        }
        return new HomePage(driver);
    }


    public HomePage opencountriespopup()
    {
        click(countrybutton);
        return new HomePage(driver);
    }

    public HomePage selectcountry(String country)
    {

        click( By.id(country));
        return new HomePage(driver);
    }


    public HomePage checklitepackagedetailsforcountries(String Expectedcountryname,String Expectedpackagetype,String price,String currency)
    {
        //Validate country name
        Assert.assertEquals (gettext(countryname),Expectedcountryname);

        //Validate Package type
        Assert.assertEquals(gettext(Litepackage),Expectedpackagetype);

        //Validate Package price & currency
        Assert.assertEquals(gettext(Litepricecurrency),price +" "+ currency + "/month");
        return new HomePage(driver);
    }

    public HomePage checkclassicpackagedetailsforcountries(String Expectedcountryname,String Expectedpackagetype,String price,String currency)
    {
        //Validate country name
        Assert.assertEquals (gettext(countryname),Expectedcountryname);

        //Validate Package type
        Assert.assertEquals(gettext(Classicpackage),Expectedpackagetype);

        //Validate Package price & currency
        Assert.assertEquals(gettext(Classicpricecurrency),price +" "+ currency + "/month");
        return new HomePage(driver);
    }
    public HomePage checkPremiumpackagedetailsforcountries(String Expectedcountryname,String Expectedpackagetype,String price,String currency)
    {
        //Validate country name
        Assert.assertEquals (gettext(countryname),Expectedcountryname);

        //Validate Package type
        Assert.assertEquals(gettext(Premiumpackage),Expectedpackagetype);

        //Validate Package price & currency
        Assert.assertEquals(gettext(Premiumpricecurrency),price +" "+ currency + "/month");
        return new HomePage(driver);
    }

}
