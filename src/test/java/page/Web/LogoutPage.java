package page.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;

public class LogoutPage {

    By logoutButton = By.xpath("//a[.='Log out']");

    public void clickLogoutButton() {
//        driver.findElement(logoutButton).click();
        try {
            Thread.sleep(2000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("logout failed" + e);
        }
    }
}
