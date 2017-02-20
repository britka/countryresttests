package ua.brit;

import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * Created by sbryt on 1/30/2017.
 */
public class RequestEngine {

    public Response doGetRequest(String endpoint) {
        return given()
                .log().ifValidationFails(LogDetail.ALL)
                .get(endpoint);
    }

    public Response doGetWithParameters(String endpoint, String firstParameterName, Object firstParameterValue, Object... parameterNameValuePairs) {
        Response result;
        if (parameterNameValuePairs.length > 0) {
            result = given().log().all().params(firstParameterName, firstParameterValue, parameterNameValuePairs).get(endpoint);
        } else {
            result = given().log().all().params(firstParameterName, firstParameterValue)
                    .get(endpoint);
        }
        return result;
    }

    public Response doGetWithPathParameter(String endpoint, String pathParameter, String pathParameterValue) {
        return given().pathParam(pathParameter, pathParameterValue).get(endpoint);
    }
}
