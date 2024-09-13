package tests;

import Data.CountrySubscriptionData;
import base.BaseTest;
import io.qameta.allure.Story;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class SubscriptionPackagesTest extends BaseTest
{
    AllureLifecycle lifecycle = Allure.getLifecycle();

    //Test case to validate lite package with price and currency for three countries
    @Test  (dataProvider = "LiteSubscriptionData", dataProviderClass = CountrySubscriptionData.class)
    @Story("Validate lite package for countries")
    @Parameters({"expected country name", "countryid","Expected package type","price","currency"})
    public  void Validatelitepackageforcountries(String expectedcountryname,String countryid,String Expectedpackagetype,String price,String currency)
    {
    //change test names
        lifecycle.updateTestCase(testResult -> testResult.setName("Validate lite package for " + expectedcountryname));

    new pages.HomePage(driver)
            .clickenglishlanguagebutton()
            .opencountriespopup()
            .selectcountry(countryid)
            .checklitepackagedetailsforcountries(expectedcountryname,Expectedpackagetype,price,currency);
    }

    //Test case to validate classic package with price and currency for three countries
    @Test (dataProvider = "ClassicSubscriptionData", dataProviderClass = CountrySubscriptionData.class)
    @Story("Validate classic package for countries")
    @Parameters({"expected country name", "countryid","Expected package type","price","currency"})
    public  void Validateclassicpackageforcountries(String expectedcountryname,String countryid,String Expectedpackagetype,String price,String currency)
    {
        //change tests names
        lifecycle.updateTestCase(testResult -> testResult.setName("Validate classic package for " + expectedcountryname));


        new pages.HomePage(driver)
                .clickenglishlanguagebutton()
                .opencountriespopup()
                .selectcountry(countryid)
                .checkclassicpackagedetailsforcountries(expectedcountryname,Expectedpackagetype,price,currency);
    }

    //Test case to validate premium package with price and currency for three countries
    @Test (dataProvider = "PremiumSubscriptionData", dataProviderClass = CountrySubscriptionData.class)
    @Story("Validate premium package for countries")
    @Parameters({"expected country name", "countryid","Expected package type","price","currency"})
    public  void ValidatePremiumpackageforcountries(String expectedcountryname,String countryid,String Expectedpackagetype,String price,String currency)
    {
        //change tests names
        lifecycle.updateTestCase(testResult -> testResult.setName("Validate premium package for " + expectedcountryname));

        new pages.HomePage(driver)
                .clickenglishlanguagebutton()
                .opencountriespopup()
                .selectcountry(countryid)
                .checkPremiumpackagedetailsforcountries(expectedcountryname,Expectedpackagetype,price,currency);
    }

}
