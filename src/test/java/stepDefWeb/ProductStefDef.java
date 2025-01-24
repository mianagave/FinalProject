package stepDefWeb;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pagesWeb.ProductPage;

public class ProductStefDef {
    ProductPage productPage;


    public ProductStefDef() {
        this.productPage = new ProductPage();

    }

    @And("user selects item category")
    public void thenUserSelectsItemCategory() {
        productPage.clickItemCategory();
    }

    @Then("user select product {string}")
    public void userSelectProduct(String itemName) {
        productPage.clickItem(itemName);
    }


    @Then("user clicks add to cart button")
    public void userClicksAddToCartButton() {
        productPage.clickAddToCard();

    }


}
