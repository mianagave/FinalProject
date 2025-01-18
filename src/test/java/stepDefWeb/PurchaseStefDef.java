package stepDefWeb;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pagesWeb.PurchasePage;

public class PurchaseStefDef {
    PurchasePage purchasePage;

    public PurchaseStefDef() {
        this.purchasePage = new PurchasePage();
    }


    @Then("the user will be directed to fill in the data form")
    public void theUserWillBeDirectedToFillInTheDataForm() {
        purchasePage.assertForm();
    }

    @And("user fills in the name {string}")
    public void userFillsInTheName(String name) {
        purchasePage.UserName(name);
    }

    @And("user fills in the Country  {string}")
    public void userFillsInTheCountry(String country) {
        purchasePage.UserCountry(country);
    }

    @And("user fills in the City {string}")
    public void userFillsInTheCity(String city) {
        purchasePage.UserCity(city);

    }

    @And("user fills in the Credit card {string}")
    public void userFillsInTheCreditCard(String credit_card) {
        purchasePage.UserCard(credit_card);

    }

    @And("user fills in the Month {string}")
    public void userFillsInTheMonth(String month) {
        purchasePage.UserMonth(month);

    }

    @And("user fills in the Year {string}")
    public void userFillsInTheYear(String year) {
        purchasePage.UserYear(year);
    }

    @Then("user click Purchase button")
    public void userClickPurchaseButton() {
        purchasePage.clickButtonPurchase();

    }

    @Then("user will receive a notification SuccessfulTick")
    public void userWillReceiveANotificationSuccessfulTick() {
        purchasePage.assertSuccessTick();

    }

    @And("user will receive a message {string}")
    public void userWillReceiveAMessage(String message) {
        purchasePage.assertSuccessMessage(message);

    }

    @And("user click OK button")
    public void userClickOKButton() {
        purchasePage.clickButtonOK();
    }


}
