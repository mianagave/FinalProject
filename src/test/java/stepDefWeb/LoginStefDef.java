package stepDefWeb;

import helper.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesWeb.HomePage;
import pagesWeb.LoginPage;

public class LoginStefDef {
    LoginPage loginPage;
    HomePage homePage;
    Utility util = new Utility();


    public LoginStefDef(){
        this.loginPage=new LoginPage();
        this.homePage= new HomePage();
    }

    @And("user clicks the sign in button")
    public void userClicksTheSignInButton() {
       loginPage.clickLoginLabel();

    }

    @And("user enters username {string} on login page")
    public void userEntersUsernameOnLoginPage(String username) {
        loginPage.loginUsername(username);

    }

    @And("user enters password {string} on login page")
    public void userEntersPasswordOnLoginPag(String password) {
        loginPage.loginPassword(password);

    }

    @When("user click the login button")
    public void userClickTheLoginButton() {
        loginPage.clickBtnLogin();
    }

    @Then("the user will be redirected to his account")
    public void theUserWillBeRedirectedToHisAccount() {
        loginPage.assertAccount();
    }

    @Then("user fails to log in and a notification appears {string}")
    public void userFailsToLogInAndANotificationAppears(String message) throws InterruptedException {
            Thread.sleep(1000);
            Utility.popup();
    }
}
