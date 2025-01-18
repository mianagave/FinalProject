package pagesWeb;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class LoginPage {
    By LoginLabel = By.xpath("//a[.='Log in']");
    By LoginUsername = By.id("loginusername");
    By LoginPassword = By.id("loginpassword");
    By LoginButton = By.xpath("//button[.='Log in']");
    By AccountUser = By.id("narvbarx");


    public void clickLoginLabel() {
        driver.findElement(LoginLabel).click();
    }
    public void loginUsername(String username){
        driver.findElement(LoginUsername).sendKeys(username);
    }
    public void loginPassword(String password){
        driver.findElement(LoginPassword).sendKeys(password);
    }
    public void clickBtnLogin(){
        driver.findElement(LoginButton).click();
    }
    public void assertAccount(){
        driver.findElement(AccountUser).isDisplayed();
    }


}