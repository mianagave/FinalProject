package pagesWeb;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class PurchasePage {

    By FormPlaceOrder = By.id("orderModalLabel");
    By NameInput = By.id("name");
    By CountryInput = By.id("country");
    By CityInput = By.id("city");
    By CardInput = By.id("card");
    By MonthInput = By.id("month");
    By YearInput = By.id("year");
    By PurchaseBTN = By.xpath("//button[.='Purchase']");
    By SuccessMSG = By.xpath("//h2[.='Thank you for your purchase!']");
    By SuccessfulTick = By.xpath("//div[@class='sa-placeholder']");
    By OkButton = By.xpath("//button[@class='confirm btn btn-lg btn-primary']");

    public void assertForm() {
        driver.findElement(FormPlaceOrder).isDisplayed();

    }

    public void UserName(String name) {
        driver.findElement(NameInput).sendKeys(name);
    }

    public void UserCountry(String country) {
        driver.findElement(CountryInput).sendKeys(country);
    }

    public void UserCity(String city) {
        driver.findElement(CityInput).sendKeys(city);
    }

    public void UserCard(String credit_card) {
        driver.findElement(CardInput).sendKeys(credit_card);
    }

    public void UserMonth(String month) {
        driver.findElement(MonthInput).sendKeys(month);
    }

    public void UserYear(String year) {
        driver.findElement(YearInput).sendKeys(year);
    }

    public void clickButtonPurchase() {
        driver.findElement(PurchaseBTN).click();
    }

    public void assertSuccessTick() {
        driver.findElement(SuccessfulTick).isDisplayed();

    }

    public void assertSuccessMessage(String message) {
        driver.findElement(SuccessMSG).isDisplayed();

    }

    public void clickButtonOK() {
        driver.findElement(OkButton).click();
    }


}