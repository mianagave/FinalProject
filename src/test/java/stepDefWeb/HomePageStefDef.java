package stepDefWeb;

import static helper.Utility.startDriver;
import helper.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesWeb.HomePage;


public class HomePageStefDef {
    HomePage homePage;
    Utility util = new Utility();


    public HomePageStefDef() {
        this.homePage = new HomePage();
    }

    @Given("the user is in the main view")
    public void theUserIsInTheMainView() {
        homePage.openBrowser();
    }

    @And("user clicks the sign up button")
    public void userClicksTheSignUpButton() {
        homePage.clickSignupLabel();
    }

    @And("user enters username {string}")
    public void userEntersUsername(String username) {
        homePage.signupUsername(username);

    }

    @And("user enters  password {string}")
    public void userEntersPassword(String password) {
        homePage.signupPassword(password);
    }

    @When("user click the sign up button")
    public void userClickTheSignUpButton() {
        homePage.clickBtnSignup();
    }

    @Then("user will receive a notification {string}")
    public void userWillReceiveANotification(String message ) throws InterruptedException {
        Thread.sleep(1000);
       util.popup();


    }
}

