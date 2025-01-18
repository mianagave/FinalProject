package pagesWeb;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class CartPage {

    By CartLabel = By.xpath("//a[@id='cartur']");
    By ButtonPlaceOrder =By.xpath("//button[@class='btn btn-success']");

    public void clickCartLabel(){
        driver.findElement(CartLabel).click();

    }
    public void clickButtonPlaceOrder(){
        driver.findElement(ButtonPlaceOrder).click();

    }
}
