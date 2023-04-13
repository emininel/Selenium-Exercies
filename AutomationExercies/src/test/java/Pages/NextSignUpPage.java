package Pages;

import org.openqa.selenium.WebDriver;

public class NextSignUpPage extends Page {
    public String genderCheckX = "//input[@value='Mr']";
    public String passwordTxt = "password";
    public String day = "days";
    public String month = "months";
    public String years = "years";
    public String newsteller = "newsletter";
    public String specialOffer = "optin";
    public String firstName = "first_name";
    public String lastName = "last_name";
    public String company= "company";
    public String adressX = "//p[4]/input[@class='form-control']";
    public String countryChoicer= "country";
    public String stateTxt="state";
    public String city = "city";
    public String zipCode="zipcode";
    public String phoneNumber ="mobile_number";
    public String createAccountX="//button[.='Create Account']";

    public NextSignUpPage(WebDriver driver) {
        super(driver);
    }
}
