package Pages;

import org.openqa.selenium.WebDriver;

public class CartPage extends Page{
    public String checkOutBtnCss =".check_out";
    public String placeOrderBtnCss = ".check_out";
    public String cardNameNameTxt="name_on_card";
    public String cardNumberNameTxt="card_number";
    public String cardCvcNameTxt = "cvc";
    public String cardExpirationNameTxt = "expiry_month";
    public String cardYearNameTxt = "expiry_year";
    public String payAndConfirmBtnName="submit";


    public CartPage(WebDriver driver) {
        super(driver);
    }
}
