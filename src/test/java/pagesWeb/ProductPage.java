package pagesWeb;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class ProductPage {
    By itemPhones = By.cssSelector("[onclick='byCat(\\'phone\\')']");
    By itemlaptops = By.xpath("//a[.='Laptops']");
    By itemMonitors = By.cssSelector("[onclick='byCat(\\'monitor\\')']");
    By brandNamePhone =By.cssSelector("#tbodyid > div:nth-of-type(1) .hrefch");
    By brandNameLaptop = By.xpath("//a[.='MacBook Pro']");
    By brandNameMonitors = By.xpath("//a[.='Apple monitor 24']");
    By addToCard = By.xpath("//a[.='Add to cart']");

    public void clickItemPhones() {
        driver.findElement(itemPhones).click();
    }
   public void clickNamePhone() {
        driver.findElement(brandNamePhone).click();
    }
    public void clickItemLaptop() {
        driver.findElement(itemlaptops).click();
    }
    public void clickNameLaptop() {
        driver.findElement(brandNameLaptop).click();
    }
    public void clickItemMonitors() {
        driver.findElement(itemMonitors).click();
    }
    public void clickNameMonitors() {
        driver.findElement(brandNameMonitors).click();
    }
    public void clickAddToCard(){
        driver.findElement(addToCard).click();
    }
}
