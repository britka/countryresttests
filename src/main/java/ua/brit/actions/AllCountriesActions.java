package ua.brit.actions;

import ua.brit.Endpoints;
import ua.brit.RequestEngine;
import ua.brit.models.response.allcountries.AllCountriesResponse;
import ua.brit.models.response.allcountries.ShortCodeCountryResponse;

/**
 * Created by sbryt on 1/30/2017.
 */
public class AllCountriesActions {
    private RequestEngine requestEngine;

    public AllCountriesActions(RequestEngine requestEngine) {
        this.requestEngine = requestEngine;
    }

    public AllCountriesResponse getAllCountries() {
        return requestEngine.doGetRequest(Endpoints.COUNTRIES_GET_ALL).jsonPath().getObject("RestResponse", AllCountriesResponse.class);
    }

    public ShortCodeCountryResponse getCountryByIso2Code(String iso2Code) {
        return requestEngine
                .doGetWithPathParameter(
                        Endpoints.COUNTRIES_GET_BY_ISO_2,
                        "alpha2_code",
                        iso2Code)
                .jsonPath()
                .getObject("RestResponse", ShortCodeCountryResponse.class);

    }

    public ShortCodeCountryResponse getCountryByIso3Code(String iso3Code) {
        return requestEngine
                .doGetWithPathParameter(
                        Endpoints.COUNTRIES_GET_BY_ISO_3,
                        "alpha3_code",
                        iso3Code)
                .jsonPath()
                .getObject("RestResponse", ShortCodeCountryResponse.class);
    }

    public AllCountriesResponse countryGlobalSearch(String searchString) {
        return requestEngine
                .doGetWithParameters(Endpoints.COUNTRY_GLOBAL_SEARCH, "text", searchString)
                .jsonPath()
                .getObject("RestResponse", AllCountriesResponse.class);
    }


}
