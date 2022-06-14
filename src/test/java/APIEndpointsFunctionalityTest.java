import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;



public class APIEndpointsFunctionalityTest {

    private static Response response;

//    @BeforeAll
//    public static void setup() {
//        response = given().get(Constants.URL+Constants.API_KEY);
//       System.out.println(response.asString());
//   }
    @Test
    public void getCurrencyConversionRatesTest(){
        response = given().get(Constants.URL+Constants.API_KEY);
        System.out.println(response.asString());

        response.then().statusCode(200);

    }
    @Test
    public void getCurrentCurrencyConversionRatesTest(){
        response = given().get(Constants.URL+Constants.API_KEY+Constants.Currencies);
        System.out.println(response.asString());

        response.then().statusCode(200);

    }
    @Test
    public void getInvalidCurrencyConversionRatesTest(){
        response = given().get(Constants.URL+Constants.API_KEY+Constants.Invalid_Currencies);
        System.out.println(response.asString());

        response.then().statusCode(200);

    }




    @Test
    public void getHistoricalCurrencyConversionRatesTest(){
        response = given().get(Constants.HISTORICAL_PARAMETERS+Constants.API_KEY+Constants.Currencies);
        System.out.println(response.asString());

        response.then().statusCode(200);

    }
    @Test
    public void getInvalidHistoricalCurrencyConversionRatesTest(){
        response = given().get(Constants.INVALID_HISTORICAL_PARAMETERS+Constants.API_KEY+Constants.Currencies);
        System.out.println(response.asString());

        response.then().statusCode(200);

    }



//    @Test
//    public void getCurrentCurrencyConversionRatesTest1(){
//        response = given().get(Constants.URL+Constants.API_KEY+Constants.);
//        System.out.println(response.asString());
//
//        response.then().statusCode(200);
//
//    }

//    @ParameterizedTest
//    @ValueSource(strings = {"quotes", "success", "timestamp","source"})
//    public void getCurrencyBySourceTest(String source) {
//      response = given().get(Constants.URL + Constants.API_KEY+Constants.Currencies);
//       System.out.println(response.asString());
//        response.then().statusCode(200);
//      // response.then().body("quotes.USDALL", notNullValue());
//       // response.then().body("quotes.USDALL", greaterThan(114.90222F));
//       response.then().body("quotes.USDALL",equalTo(1.793535f));
//       response.then().body("USD",contains(source));}




}

