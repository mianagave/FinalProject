package stepDefApi;


import pagesApi.ApiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiStef {
    ApiPage apiPage;

    public ApiStef() {
        this.apiPage = new ApiPage(); //Kita membuat objek baru dari kelas ApiPage dan menyimpannya di variabel apiPage, supaya nanti bisa digunakan.
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();

    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiPage.validationStatusCodeIsEquals(status_code);

    }

    @Then("validation response body get list user")
    public void validationResponseBodyGetListUser() {
        apiPage.validationResponseBodyGetListUser();

    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);

    }


    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUser();

    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyCreateUser();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiPage.hitApiDeleteNew();
    }

    @And("hit api update data user")
    public void hitApiUpdateDataUser() {
        apiPage.hitApiUpdateDataUser();

    }

}
