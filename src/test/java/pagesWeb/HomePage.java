package pagesWeb;

import helper.Utility;
import org.openqa.selenium.By;
import static helper.Utility.driver;

public class HomePage {
    By SignupLabel = By.id("signin2");
    By SignupUsername = By.id("sign-username");
    By SignupPassword = By.id("sign-password");
    By SignupButton = By.xpath("//button[.='Sign up']");

    public void openBrowser(){
        if (driver == null) {
            Utility.startDriver();  // Inisialisasi driver jika belum ada
        }
        driver.get("https://www.demoblaze.com/");
    }
    public void clickSignupLabel(){
        driver.findElement(SignupLabel).click();
    }

    public void signupUsername(String username){
        driver.findElement(SignupUsername).sendKeys(username);
    }
    public void signupPassword(String password){
        driver.findElement(SignupPassword).sendKeys(password);
    }
    public void clickBtnSignup(){
        driver.findElement(SignupButton).click();
    }



}
