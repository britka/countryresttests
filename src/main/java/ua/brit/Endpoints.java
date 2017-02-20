package ua.brit;

/**
 * Created by sbryt on 1/30/2017.
 */
public class Endpoints {
    public static final String COUNTRIES_GET = "/country/get";
    public static final String COUNTRIES_GET_ALL = COUNTRIES_GET + "/all";
    public static final String COUNTRIES_GET_BY_ISO_2 = COUNTRIES_GET + "/iso2code/{alpha2_code}";
    public static final String COUNTRIES_GET_BY_ISO_3 = COUNTRIES_GET + "/iso3code/{alpha3_code}";
    public static final String COUNTRY_GLOBAL_SEARCH = "/country/search";

}
