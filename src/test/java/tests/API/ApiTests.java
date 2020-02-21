package tests.API;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTests {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @Test()
    @Description("Get user by user id")
    @Story("Get user")
    public void getTest_getUserByValidId() {
        get("/api/users/1")
                .then()
                .statusCode(200)
                .assertThat()
                .body("data.email", equalTo("george.bluth@reqres.in"));
    }

    @Test()
    @Description("Create new user")
    @Story("User creation")
    public void postTest_createNewUser() {
        String payload = "{\"name\": \"Yaroslav\",\"job\": \"QA\"}";
                        given()
                        .contentType(ContentType.JSON)
                        .body(payload)
                        .post("/api/users")
                        .then()
                        .statusCode(201);
    }
}
