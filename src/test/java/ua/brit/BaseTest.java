package ua.brit;


import io.restassured.RestAssured;
import ua.brit.actions.AllCountriesActions;

/**
 * Created by sbryt on 1/30/2017.
 */
public class BaseTest {
    static {
        RestAssured.baseURI = "http://services.groupkt.com";
    }

    RequestEngine requestEngine;
    AllCountriesActions allCountriesActions;

    public BaseTest() {
            requestEngine = new RequestEngine();
            allCountriesActions = new AllCountriesActions(requestEngine);
    }
}
