package ru.netology.test;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToObject;

public class PostmanEchoTest {
    @Test
    void shouldPostRequest() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalToObject("some info"))
        ;
    }
}
