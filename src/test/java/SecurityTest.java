import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class SecurityTest {
    private static Response response;



    @Test
    public void getAllEndpointsRespondTest(){
        Response response = given().get(Constants.URL+Constants.API_KEY);
        System.out.println(response.asString());

        response.then().statusCode(200);

    }
    @Test
    public void getAllEndpointsRespondErrorTest(){
       response = given().get(Constants.URL);
        System.out.println(response.asString());

        response.then().statusCode(401);

    }





}
