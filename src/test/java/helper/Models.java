package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders() {
        request = RestAssured.given().header("Content-Type", "application/json");//agar server memahami bahwa payload yang dikirim adalah dalam format JSON

    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint) {
        String email = "mianagave@gmail.com";
        String first_name = "Mian";
        String last_name = "Agave";
        JSONObject payload = new JSONObject();
        payload.put("email", email);
        payload.put("first_name", first_name);
        payload.put("last_name", last_name);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);

    }

    public static Response deleteDataUser(String endpoint) {
        setupHeaders();
        String finalEndpoint = endpoint + "/";
        return request.when().delete(finalEndpoint);

    }

    public static Response updateDataUser(String endpoint) {

        setupHeaders();
        String name = "morpheus";
        String job = "zion resident";

        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("job", job);


        String finalEndpoint = endpoint + "/";
        return request.body(payload.toString()).when().delete(finalEndpoint);

    }
}
