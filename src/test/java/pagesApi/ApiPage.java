package pagesApi;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {

    String  setURL;
    Response res;

    public void prepareUrlFor(String url) {
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                setURL = Endpoint.CREATE_NEW_USERS;
                break;
            case "DELETE_USERS":
                setURL = Endpoint.DELETE_USERS;
                break;
            default:
                System.out.println("input right url");
        }
       // System.out.println(setURL);

    }

    public void hitApiGetListUsers() {
        res = getListUsers(setURL);

    }

    public void hitApiPostCreateUser() {
        res = postCreateUser(setURL);


    }


    public void validationStatusCodeIsEquals(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);

    }

    public void validationResponseBodyGetListUser() {
        List<Integer> ids = res.jsonPath().getList("data.id", Integer.class);
        List<String> emails = res.jsonPath().getList("data.email", String.class);
        List<String> firstName = res.jsonPath().getList("data.first_name", String.class);
        List<String> lastName = res.jsonPath().getList("data.last_name", String.class);
        List<String> avatars = res.jsonPath().getList("data.avatar", String.class);

        assertThat(ids.get(0)).isNotNull();
        assertThat(emails.get(0)).isNotNull();
        assertThat(firstName.get(0)).isNotNull();
        assertThat(lastName.get(0)).isNotNull();
        assertThat(avatars.get(0)).isNotNull();

    }

    public void validationResponseJsonWithJSONSchema(String filename) {
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));

    }

    public void validationResponseBodyCreateUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
     //   System.out.println(res.getBody().asString());

        String emails = jsonPathEvaluator.get("email");
        String firstName = jsonPathEvaluator.get("first_name");
        String lastName = jsonPathEvaluator.get("last_name");

        assertThat(emails).isNotNull();
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();

    }
    public void hitApiDeleteNew(){
        res = deleteDataUser(setURL);

    }
    public void hitApiUpdateDataUser(){
        res = updateDataUser(setURL);

    }

}
