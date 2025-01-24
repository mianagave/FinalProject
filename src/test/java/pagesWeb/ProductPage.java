package pagesWeb;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class ProductPage {

    By itemCategory = By.className("list-group-item");
    By addToCard = By.xpath("//a[.='Add to cart']");


    public void clickItemCategory() {
        driver.findElement(itemCategory).click();

    }

    public String generateLocator(String itemName) {
        String locator = "//a[.='" + itemName + "']";
        return locator;
    }

    public void clickItem(String itemName) {
        driver.findElement(By.xpath(generateLocator(itemName))).click();
    }


    public void clickAddToCard() {
        driver.findElement(addToCard).click();
    }
}
