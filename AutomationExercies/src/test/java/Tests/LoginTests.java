package Tests;

import Pages.HomePage;
import Pages.NextSignUpPage;
import Pages.SignUpOrLoginPage;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTests {
    HomePage homePage;
    SignUpOrLoginPage signUpOrLoginPage;
    WebDriver driver;
    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        signUpOrLoginPage = new SignUpOrLoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    void loginTests(){
        driver.get("https://automationexercise.com/login");
        homePage.clickXPath(homePage.SignupOrLoginButtonX);
        signUpOrLoginPage.writeXPath(signUpOrLoginPage.loginEmailTxtX,"autoextr@gmail.com");
        signUpOrLoginPage.writeName(signUpOrLoginPage.passwords,"autoextr123");
        signUpOrLoginPage.clickXPath(signUpOrLoginPage.loginBtnX);
        driver.findElement(By.xpath("//a[contains(.,'Delete Account')]")).click(); // Delete Account
    }
    @AfterEach
    void close(){
        driver.close();
    }

}
