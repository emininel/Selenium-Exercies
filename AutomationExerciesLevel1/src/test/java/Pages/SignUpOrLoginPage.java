package Pages;

import org.openqa.selenium.WebDriver;

public class SignUpOrLoginPage extends Page {
    public String nameTxt = "name";
    public String signupEmailTxtX = "//div[@class='signup-form']//input[@name='email']";
    public String signupBtnX = "//button[.='Signup']";
    public String loginEmailTxtX="//div[@class='login-form']//input[@name='email']";
    public String passwords = "password";
    public String loginBtnX="//button[.='Login']";

    public SignUpOrLoginPage(WebDriver driver) {
        super(driver);
    }
}
