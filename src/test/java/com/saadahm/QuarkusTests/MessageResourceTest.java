package com.saadahm.QuarkusTests;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class MessageResourceTest {

    @Test
    public void test_getMessageResource() {
        given()
                .when().get("/getMessage")
                .then()
                .statusCode(200)
                .body(is("{\"message\":\"Running in test profile coming from config service\"}"));
    }
}
