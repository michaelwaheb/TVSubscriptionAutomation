package tests;

import Data.CountrySubscriptionData;
import base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SubscriptionPackages extends BaseTest
{

    //Test case to validate lite package with price and currency for three countries
    @Test (dataProvider = "LiteSubscriptionData", dataProviderClass = CountrySubscriptionData.class)

    public  void Validatelitepackageforcountries(String countryname,String countryid,String type,String price,String currency)
    {
    //change tests names
    AllureLifecycle lifecycle = Allure.getLifecycle();
    lifecycle.updateTestCase(testResult -> testResult.setName("Validate lite package for " + countryname));

    HomePage homePage = new HomePage(driver);
    if (homePage.validateenglishlanguage().equals("English"))
    {
            homePage.clickenglishlanguagebutton();
    }
    homePage.opencountrypopup();
    homePage.selectcountry(countryid);

    //Validate country name
    String actualcountryname = homePage.countryname();
    String expectedcountryname = countryname;
    Assert.assertEquals (actualcountryname,expectedcountryname);

    //Validate Package type
    String typeactualmessage = homePage.ValidatePackagelite();
    String typeExpectedmessage = type;
    Assert.assertEquals(typeactualmessage,typeExpectedmessage);

    //Validate Package price & currency
    String actualPricecurrency = homePage.ValidatePackagelitePrice();
    String expectedPricecurrency = price +" "+ currency + "/month" ;
    Assert.assertEquals(actualPricecurrency,expectedPricecurrency);
    }

    //Test case to validate classic package with price and currency for three countries
    @Test (dataProvider = "ClassicSubscriptionData", dataProviderClass = CountrySubscriptionData.class)

    public  void Validateclassicpackageforcountries(String countryname,String countryid,String type,String price,String currency)
    {
        //change tests names
        AllureLifecycle lifecycle = Allure.getLifecycle();
        lifecycle.updateTestCase(testResult -> testResult.setName("Validate classic package for " + countryname));

        HomePage homePage = new HomePage(driver);
        if (homePage.validateenglishlanguage().equals("English"))
        {
            homePage.clickenglishlanguagebutton();
        }
        homePage.opencountrypopup();
        homePage.selectcountry(countryid);

        //Validate country name
        String actualcountryname = homePage.countryname();
        String expectedcountryname = countryname;
        Assert.assertEquals (actualcountryname,expectedcountryname);

        //Validate Package type
        String typeactualmessage = homePage.ValidatePackageClassic();
        String typeExpectedmessage = type;
        Assert.assertEquals(typeactualmessage,typeExpectedmessage);

        //Validate Package price & currency
        String actualPricecurrency = homePage.ValidatePackageClassicPrice();
        String expectedPricecurrency = price +" "+ currency + "/month" ;
        Assert.assertEquals(actualPricecurrency,expectedPricecurrency);
    }

    //Test case to validate premium package with price and currency for three countries
    @Test (dataProvider = "PremiumSubscriptionData", dataProviderClass = CountrySubscriptionData.class)

    public  void ValidatePremiumpackageforcountries(String countryname,String countryid,String type,String price,String currency)
    {
        //change tests names
        AllureLifecycle lifecycle = Allure.getLifecycle();
        lifecycle.updateTestCase(testResult -> testResult.setName("Validate premium package for " + countryname));

        HomePage homePage = new HomePage(driver);
        if (homePage.validateenglishlanguage().equals("English"))
        {
            homePage.clickenglishlanguagebutton();
        }
        homePage.opencountrypopup();
        homePage.selectcountry(countryid);

        //Validate country name
        String actualcountryname = homePage.countryname();
        String expectedcountryname = countryname;
        Assert.assertEquals (actualcountryname,expectedcountryname);

        //Validate Package type
        String typeactualmessage = homePage.ValidatePackagePermium();
        String typeExpectedmessage = type;
        Assert.assertEquals(typeactualmessage,typeExpectedmessage);

        //Validate Package price & currency
        String actualPricecurrency = homePage.ValidatePackagePermiumPrice();
        String expectedPricecurrency = price +" "+ currency + "/month" ;
        Assert.assertEquals(actualPricecurrency,expectedPricecurrency);
    }




}
