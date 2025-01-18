package stepDefWeb;


import io.cucumber.java.en.When;
import pagesWeb.CartPage;

public class CartStefDef {
    CartPage cartPage;

    public CartStefDef(){
        this.cartPage=new CartPage();
    }

    @When("user clicks label cart")
    public void userClicksLabelCart() {
        cartPage.clickCartLabel();
    }

    @When("user click Place order")
    public void userClickPlaceOrder() {
        cartPage.clickButtonPlaceOrder();
    }

}
