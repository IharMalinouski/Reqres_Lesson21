package adapters;

import com.google.gson.Gson;
import io.restassured.response.Response;
import responseParametrs.UserList;

import static io.restassured.RestAssured.given;

public class BaseAdapter {

    public static final String BASE_URL = "https://reqres.in/api";
    Gson converter = new Gson();
    private io.restassured.response.Response Response;

    public Response get(String url) {
        String responseListUser = given()
        .when()
                .get(BASE_URL + url)
        .then()
                .log().all()
                .extract().body().asString();
        UserList userList = new Gson().fromJson(responseListUser, UserList.class);
      //  int getId = userList.getData().get(0).getId();
       // System.out.println("--------------------"+getId);
      //  System.out.println("111111111------" + responseListUser);
        return Response;

    }

    public Response post(String url, String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
        .when()
                .post(BASE_URL + url)
        .then()
                .log().all()
                .extract().response();
    }

    public Response put(String url, String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
        .when()
                .put(BASE_URL + url)
        .then()
                .log().all()
                .extract().response();
    }

    public Response patch(String url, String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
        .when()
                .patch(BASE_URL + url)
        .then()
                .log().all()
                .extract().response();
    }

    public Response delete(String url, int status) {
        return given()
                .header("Content-Type", "application/json")
        .when()
                .delete(BASE_URL + url)
        .then()
                .log().all()
                .statusCode(status)
                .extract().response();

    }
}
