package Tests;

import Pages.HomePage;
import Pages.NextSignUpPage;
import Pages.SignUpOrLoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class SignUpTests {
    HomePage homePage;
    NextSignUpPage nextSignUpPage;
    SignUpOrLoginPage signUpOrLoginPage;
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homePage = new HomePage(driver);
        nextSignUpPage = new NextSignUpPage(driver);
        signUpOrLoginPage = new SignUpOrLoginPage(driver);
    }

    @Test
    void signUpTests() {
        driver.get("https://automationexercise.com/");
        homePage.clickXPath(homePage.SignupOrLoginButtonX);
        signUpOrLoginPage.writeName(signUpOrLoginPage.nameTxt, "autoExTR");
        signUpOrLoginPage.writeXPath(signUpOrLoginPage.signupEmailTxtX, "autoextr@gmail.com");
        signUpOrLoginPage.clickXPath(signUpOrLoginPage.signupBtnX);
        nextSignUpPage.clickXPath(nextSignUpPage.genderCheckX);
        nextSignUpPage.writeId(nextSignUpPage.passwordTxt, "autoextr123");
        nextSignUpPage.writeId(nextSignUpPage.day, "29");
        nextSignUpPage.writeId(nextSignUpPage.month, "October");
        nextSignUpPage.writeId(nextSignUpPage.years, "1923");
        nextSignUpPage.clickId(nextSignUpPage.newsteller);
        nextSignUpPage.clickId(nextSignUpPage.specialOffer);
        nextSignUpPage.writeId(nextSignUpPage.firstName, "Automation");
        nextSignUpPage.writeId(nextSignUpPage.lastName, "Exercie");
        nextSignUpPage.writeId(nextSignUpPage.company, "ExerciesAuto");
        nextSignUpPage.writeXPath(nextSignUpPage.adressX, "Exercie st. no 263");
        nextSignUpPage.writeId(nextSignUpPage.countryChoicer, "United States");
        nextSignUpPage.writeId(nextSignUpPage.stateTxt, "Florida");
        nextSignUpPage.writeId(nextSignUpPage.city, "Orlando");
        nextSignUpPage.writeId(nextSignUpPage.zipCode, "4072023");
        nextSignUpPage.writeId(nextSignUpPage.phoneNumber, "+195407552023");
        nextSignUpPage.clickXPath(nextSignUpPage.createAccountX);
    }

    @AfterEach
    void close() {
        driver.close();
    }

}
