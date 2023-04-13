package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page{
    public String SignupOrLoginButtonX = "//a[contains(.,'Signup / Login')]";

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
