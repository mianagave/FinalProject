package stepDef.Web;

import io.cucumber.java.en.When;
import page.Web.CartPage;

public class CartStefDef {
    CartPage cartPage;

    public CartStefDef() {
        this.cartPage = new CartPage();
    }

    @When("user clicks label cart")
    public void userClicksLabelCart() {
        cartPage.clickCartLabel();
    }

    @When("user click Place order button")
    public void userClickPlaceOrder() {
        cartPage.clickButtonPlaceOrder();
    }


}
