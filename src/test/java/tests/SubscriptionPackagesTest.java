package tests;

import Data.CountrySubscriptionData;
import base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SubscriptionPackagesTest extends BaseTest
{

    //Test case to validate lite package with price and currency for three countries
    @Test (dataProvider = "LiteSubscriptionData", dataProviderClass = CountrySubscriptionData.class)

    public  void Validatelitepackageforcountries(String expectedcountryname,String countryid,String Expectedpackagetype,String price,String currency)
    {
    //change test names with it's arguments in allure report to be more readable
    AllureLifecycle lifecycle = Allure.getLifecycle();
    lifecycle.updateTestCase(testResult -> testResult.setName("Validate lite package for " + expectedcountryname));


        HomePage homePage = new HomePage(driver);
    if (homePage.validateenglishlanguage().equals("English"))
    {
            homePage.clickenglishlanguagebutton();
    }
    homePage.opencountriespopup();
    homePage.selectcountry(countryid);

    //Validate country name
    Assert.assertEquals (homePage.actualcountryname(),expectedcountryname);

    //Validate Package type
    Assert.assertEquals(homePage.ActualPackagetypelite(),Expectedpackagetype);

    //Validate Package price & currency
    Assert.assertEquals(homePage.ActualPackagelitePriceCurrency(),price +" "+ currency + "/month");
    }

    //Test case to validate classic package with price and currency for three countries
    @Test (dataProvider = "ClassicSubscriptionData", dataProviderClass = CountrySubscriptionData.class)

    public  void Validateclassicpackageforcountries(String expectedcountryname,String countryid,String Expectedpackagetype,String price,String currency)
    {
        //change tests names
        AllureLifecycle lifecycle = Allure.getLifecycle();
        lifecycle.updateTestCase(testResult -> testResult.setName("Validate classic package for " + expectedcountryname));

        HomePage homePage = new HomePage(driver);
        if (homePage.validateenglishlanguage().equals("English"))
        {
            homePage.clickenglishlanguagebutton();
        }
        homePage.opencountriespopup();
        homePage.selectcountry(countryid);

        //Validate country name
        Assert.assertEquals (homePage.actualcountryname(),expectedcountryname);

        //Validate Package type
        Assert.assertEquals(homePage.ActualPackagetypeClassic(),Expectedpackagetype);

        //Validate Package price & currency
        Assert.assertEquals(homePage.ActualPackageClassicPriceCurrency(),price +" "+ currency + "/month");
    }

    //Test case to validate premium package with price and currency for three countries
    @Test (dataProvider = "PremiumSubscriptionData", dataProviderClass = CountrySubscriptionData.class)

    public  void ValidatePremiumpackageforcountries(String expectedcountryname,String countryid,String Expectedpackagetype,String price,String currency)
    {
        //change tests names
        AllureLifecycle lifecycle = Allure.getLifecycle();
        lifecycle.updateTestCase(testResult -> testResult.setName("Validate premium package for " + expectedcountryname));

        HomePage homePage = new HomePage(driver);
        if (homePage.validateenglishlanguage().equals("English"))
        {
            homePage.clickenglishlanguagebutton();
        }
        homePage.opencountriespopup();
        homePage.selectcountry(countryid);

        //Validate country name
        Assert.assertEquals (homePage.actualcountryname(),expectedcountryname);

        //Validate Package type
        Assert.assertEquals(homePage.ActualPackagetypePermium(),Expectedpackagetype);

        //Validate Package price & currency
        Assert.assertEquals(homePage.ActualPackageePermiumPriceCurrency(),price +" "+ currency + "/month");
    }




}
