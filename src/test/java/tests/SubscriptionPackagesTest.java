package tests;

import Data.CountrySubscriptionData;
import base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import org.testng.annotations.Test;

public class SubscriptionPackagesTest extends BaseTest
{
    AllureLifecycle lifecycle = Allure.getLifecycle();
    //Test case to validate lite package with price and currency for three countries
    @Test (dataProvider = "LiteSubscriptionData", dataProviderClass = CountrySubscriptionData.class)

    public  void Validatelitepackageforcountries(String expectedcountryname,String countryid,String Expectedpackagetype,String price,String currency)
    {
    //change test names with it's arguments in allure report to be more readable

    lifecycle.updateTestCase(testResult -> testResult.setName("Validate lite package for " + expectedcountryname));


    new pages.HomePage(driver)
            .clickenglishlanguagebutton()
            .opencountriespopup()
            .selectcountry(countryid)
            .checklitepackagedetailsforcountries(expectedcountryname,Expectedpackagetype,price,currency);


    }


    //Test case to validate classic package with price and currency for three countries
    @Test (dataProvider = "ClassicSubscriptionData", dataProviderClass = CountrySubscriptionData.class)

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
