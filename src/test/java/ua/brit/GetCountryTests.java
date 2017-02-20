package ua.brit;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.brit.models.response.allcountries.AllCountriesResponse;
import ua.brit.models.response.allcountries.ShortCodeCountryResponse;
import ua.brit.models.response.allcountries.ShortCountryModel;

/**
 * Created by sbryt on 1/30/2017.
 */
public class GetCountryTests extends BaseTest {
    @Test
    public void getAllCountriesTest() {
        System.out.println(allCountriesActions.getAllCountries().getResult());
    }

    @Test
    public void checkCorrectSize() {
        AllCountriesResponse arrayOfCountries = allCountriesActions.getAllCountries();
        Assert.assertEquals(arrayOfCountries.getResult().size(), arrayOfCountries.getTotalCountOfObjects());
    }

    @Test
    public void findCountryByISO2() {
        String iso2 = "UA";
        ShortCodeCountryResponse country = allCountriesActions.getCountryByIso2Code(iso2);
        Assert.assertEquals(country.getResult().getAlpha2Code(), iso2);
    }

    @Test
    public void findCountryByISO3() {
        String iso3 = "UKR";
        ShortCodeCountryResponse country = allCountriesActions.getCountryByIso3Code(iso3);
        Assert.assertEquals(country.getResult().getAlpha3Code(), iso3);
    }

    @Test
    public void searchTest() {
        String searchText = "br";
        AllCountriesResponse allCountriesResponse = allCountriesActions.countryGlobalSearch(searchText);
        for (ShortCountryModel shortCodeCountryResponse : allCountriesResponse.getResult()) {
            Assert.assertTrue(isContainsTextInShortCountryModel(shortCodeCountryResponse, searchText), shortCodeCountryResponse.toString() + " search text is: " + searchText);
        }
    }

    @Test
    public void noMachSearchTest() {
        String searchText = "blabla";
        AllCountriesResponse allCountriesResponse = allCountriesActions.countryGlobalSearch(searchText);
        Assert.assertEquals(allCountriesResponse.getResult().size(), 0);
        Assert.assertEquals(allCountriesResponse.getMessages().get(1), "No matching country found for requested code [" + searchText + "].");
    }

    private boolean isContainsTextInShortCountryModel(ShortCountryModel shortCountryModel, String text) {
        return shortCountryModel.getName().toLowerCase().contains(text.toLowerCase())
                || shortCountryModel.getAlpha2Code().toLowerCase().contains(text.toLowerCase())
                || shortCountryModel.getAlpha3Code().toLowerCase().contains(text.toLowerCase());
    }
}
