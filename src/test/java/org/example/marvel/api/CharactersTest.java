package org.example.marvel.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CharactersTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/characters")
          .then()
             .statusCode(200)
             .body(is("this is a character"));
    }

}