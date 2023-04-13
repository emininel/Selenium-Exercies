package Tests;

import Pages.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AllTests {
    HomePage homePage;
    NextSignUpPage nextSignUpPage;
    SignUpOrLoginPage signUpOrLoginPage;
    AccountPage accountPage;
    CartPage cartPage;
    ProductsPage productsPage;
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver);
        nextSignUpPage = new NextSignUpPage(driver);
        signUpOrLoginPage = new SignUpOrLoginPage(driver);
        accountPage = new AccountPage(driver);
        cartPage = new CartPage(driver);
        productsPage = new ProductsPage(driver);
        driver.get("https://automationexercise.com/");
    }

    @Test
    void signUpTests() {


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

    @Test
    void Login(){

        homePage.clickXPath(homePage.SignupOrLoginButtonX);
        signUpOrLoginPage.writeXPath(signUpOrLoginPage.loginEmailTxtX,"autoextr@gmail.com");
        signUpOrLoginPage.writeName(signUpOrLoginPage.passwords,"autoextr123");
        signUpOrLoginPage.clickXPath(signUpOrLoginPage.loginBtnX);
        accountPage.clickXPath(accountPage.menuProductBtnX);
        driver.navigate().refresh();
        accountPage.clickXPath(accountPage.menuProductBtnX);
        productsPage.clickXPath(productsPage.categorieWomenOpenX);
        productsPage.clickXPath(productsPage.categoireWomenOptionDressX);
        productsPage.clickXPath(productsPage.addCartBtnWomenDressX);
        productsPage.clickCss(productsPage.continueShoppingBtnCss);
        productsPage.clickXPath(productsPage.categorieWomenOpenX);
        productsPage.clickXPath(productsPage.categoireWomenOptionTopsX);
        productsPage.clickXPath(productsPage.addCartBtnWomenTopsX);
        productsPage.clickCss(productsPage.continueShoppingBtnCss);
        productsPage.clickXPath(productsPage.categorieWomenOpenX);
        productsPage.clickXPath(productsPage.categoireWomenOptionSareeX);
        productsPage.clickXPath(productsPage.addCartBtnWomenSareeX);
        productsPage.clickCss(productsPage.continueShoppingBtnCss);
        productsPage.clickXPath(productsPage.categorieMenOpenX);
        productsPage.clickXPath(productsPage.categoireMenOptionTshirtX);
        productsPage.clickXPath(productsPage.addCartBtnMenTshirtsX);
        productsPage.clickCss(productsPage.continueShoppingBtnCss);
        productsPage.clickXPath(productsPage.categorieMenOpenX);
        productsPage.clickXPath(productsPage.categoireMenOptionJeansX);
        productsPage.clickXPath(productsPage.addCartBtnMenJeanX);
        productsPage.clickCss(productsPage.continueShoppingBtnCss);
        productsPage.clickXPath(productsPage.categorieKidsOpenX);
        productsPage.clickXPath(productsPage.categoireKidsOptionDressX);
        productsPage.clickXPath(productsPage.addCartBtnKidsDressX);
        productsPage.clickCss(productsPage.continueShoppingBtnCss);
        productsPage.clickXPath(productsPage.categorieKidsOpenX);
        productsPage.clickXPath(productsPage.categoireKidsOptionTopAndShirtX);
        productsPage.clickXPath(productsPage.addCartBtnKidsTopAndShirtX);
        productsPage.clickCss(productsPage.continueShoppingBtnCss);
        accountPage.clickXPath(accountPage.menuCartBtnX);
        cartPage.clickCss(cartPage.checkOutBtnCss);
        cartPage.clickCss(cartPage.placeOrderBtnCss);
        cartPage.writeName(cartPage.cardNameNameTxt,"Yeni Kartım");
        cartPage.writeName(cartPage.cardNumberNameTxt,"123");
        cartPage.writeName(cartPage.cardCvcNameTxt,"123");
        cartPage.writeName(cartPage.cardExpirationNameTxt,"123");
        cartPage.writeName(cartPage.cardYearNameTxt,"123");
        cartPage.clickId("submit");
        driver.findElement(By.xpath("//a[contains(.,'Delete Account')]")).click(); // Delete Account
    }
    @AfterEach
    void close() {
        driver.close();
    }

}
