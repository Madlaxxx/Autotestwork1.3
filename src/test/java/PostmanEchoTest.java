import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void PostmanEchoTestBody() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Котики")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Котики"))
        ;

    }

}
