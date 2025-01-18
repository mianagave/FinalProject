package stepDefWeb;

import helper.Utility;
import io.cucumber.java.en.Then;
import pagesWeb.HomePage;
import pagesWeb.ProductPage;

public class ProductStefDef {
    ProductPage productPage;



    public ProductStefDef() {
        this.productPage = new ProductPage();

    }

    @Then("user selects category phones")
    public void userSelectsCategoryPhones() {
        productPage.clickItemPhones();
    }

    @Then("user select product phone {string}")
    public void userSelectProduct(String phones) {
        productPage.clickNamePhone();

    }
    @Then("user selects category laptops")
    public void userSelectsCategoryLaptops() {
        productPage.clickItemLaptop();

    }
    @Then("user select product laptop {string}")
    public void userSelectProductLaptop(String laptops) {
        productPage.clickNameLaptop();
    }
    @Then("user selects category monitors")
    public void userSelectsCategoryMonitors() {
        productPage.clickItemMonitors();
    }

    @Then("user select product monitor {string}")
    public void userSelectProductMonitor(String monitor) {
        productPage.clickNameMonitors();
    }



    @Then("user clicks add to cart button")
    public void userClicksAddToCartButton(){
        productPage.clickAddToCard();

    }



}
