package TestNG;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class GetAllAthletesTestTemplate {

    @Test
    public void verify_GetAll_athlete_schema() {
        String userEndpoint = "";
        given().when().get(userEndpoint).then().assertThat().statusCode(200)
                .body(matchesJsonSchemaInClasspath("GetAllAthletes.json"));

    }

    @Test
    public void checkResponseBody() {
        String userEndpoint = "";
        // response =
        // given().when().get(userEndpoint).then().extract().response();
        Response response = given().when().get(userEndpoint);
        assertTrue(response != null);
        System.out.println("Whole resp: " + response.asString());
    }

    @Test(description = "Verify the response time for Get All athletes")
    public void checkResponseTime() {
        String userEndpoint = "";
        Response response = given().when().get(userEndpoint).then().extract().response();
        long respTime = response.getTime();
        assertTrue(respTime < 40000);
        System.out.println("Extract resp: " + response.asString());
    }

    @Test
    public void restAssuredAssertion() throws JsonProcessingException {
        Response response;
        String userEndpoint = "";
        /**
         * static import of hamcrest and RestAssuredMatchers
         */

        // Validating using assertThat
        // given().when().get(userEndpoint).then().assertThat().statusCode(200);

        // Validating using assertThat
        // given().when().get(userEndpoint).then().assertThat().statusLine("HTTP/1.1
        // 200 OK");

        // given().when().get(userEndpoint).then().assertThat().headers("Server",
        // "Cowboy", "Content-Type",
        // "application/json; charset=utf-8");

        given().when().get(userEndpoint).then().body("id[0]", equalTo(1));

    }

    @Test
    public void testNgAssertion() throws JsonProcessingException {
        String userEndpoint = "";
        // Validating using rest assured assertion
        Response response = given().when().get(userEndpoint);
        System.out.println(response.statusLine());

        // Validating status code using testNg
        assertEquals(response.statusCode(), 200);

        // validate response data using testNg
        assertTrue(response.statusLine().contains("200"));

    }

    @Test
    public void jsonPathTest() {
        String userEndpoint = "";
        Response response = given().when().get(userEndpoint);
        String respString = "{\r\n    \"athletes\": [\r\n        {\r\n            \"id\": 1,\r\n            \"fname\": \"Avishek\",\r\n            \"lname\": \"Behera\",\r\n            \"state\": \"KA\",\r\n            \"brmStatus\": \"SR\",\r\n            \"address\": [\r\n                {\r\n                    \"city\": \"Bangalore\",\r\n                    \"zip\": 560043,\r\n                    \"locality\": \"Horamavu\"\r\n                }\r\n            ]\r\n        },\r\n        {\r\n            \"id\": 2,\r\n            \"fname\": \"Pravin\",\r\n            \"lname\": \"Rana\",\r\n            \"state\": \"KA\",\r\n            \"brmStatus\": \"SR\",\r\n            \"address\": [\r\n                {\r\n                    \"city\": \"Bangalore\",\r\n                    \"zip\": 560044,\r\n                    \"locality\": \"Kanakpura\"\r\n                }\r\n            ]\r\n        },\r\n        {\r\n            \"id\": 3,\r\n            \"fname\": \"Kishore\",\r\n            \"lname\": \"Naga\",\r\n            \"state\": \"TS\",\r\n            \"brmStatus\": \"R\",\r\n            \"address\": [\r\n                {\r\n                    \"city\": \"Hyderabad\",\r\n                    \"zip\": 565504,\r\n                    \"locality\": \"Ameerpet\"\r\n                }\r\n            ]\r\n        }\r\n    ]\r\n}";

        // Converting response to jsonPath object and setting RootPath
        // JsonPath jsonPath = response.jsonPath().setRootPath("setRootPath");

        // Converting response to jsonPath object
        JsonPath jsonPath = response.jsonPath();
        String address = jsonPath.getString("athletes[0].address");
        System.out.println(address);

        // Extracting value using path from Array object
        String fname = response.then().extract().path("athletes[0].fname");
        System.out.println(fname);

        // Extracting json object using path from Array Object
        String add = response.then().extract().path("athletes[0].address").toString();
        System.out.println(add);

        /**
         * import com.jayway.jsonpath.JsonPath; JsonPath using Jayway JsonPath
         * expression More information: https://github.com/json-path/JsonPath
         * Online Jayway jsonpath evaluator: https://jsonpath.com/
         */
        // List<String> athleteNames = JsonPath.read(respString,
        // "athletes[?(@.id==1 && @.fname=='Avishek')]");
        // System.out.println(athleteNames);
    }

}
