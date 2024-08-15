package Data;

import org.testng.annotations.DataProvider;

public class CountrySubscriptionData
{
    //packages data details for 3 countries
    @DataProvider(name = "LiteSubscriptionData")
    public Object[][] litedetails() {
        return new Object [][] {{"Egypt","eg","LITE","0.25","USD"},
                                {"UAE","ae","LITE","5.4","USD"},
                                {"Iraq","iq","LITE","2.4","USD"}};
    }
    @DataProvider(name = "ClassicSubscriptionData")
    public Object[][] classicdetails() {
        return new Object [][] {{"Egypt","eg","CLASSIC","0.5","USD"},
                                {"UAE","ae","CLASSIC","10.9","USD"},
                                {"Iraq","iq","CLASSIC","4.1","USD"}};
    }
    @DataProvider(name = "PremiumSubscriptionData")
    public Object[][] Premiumdetails() {
        return new Object [][] {{"Egypt","eg","PREMIUM","1","USD"},
                {"UAE","ae","PREMIUM","16.3","USD"},
                {"Iraq","iq","PREMIUM","6.2","USD"}};
    }

   // ,{"eg","Classic","0.5","USD"},{"eg","Premium","1","USD"}
   //{"eg","Lite","0.25","USD"}
}
