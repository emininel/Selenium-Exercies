package Pages;

import org.openqa.selenium.WebDriver;

public class AccountPage extends Page {
    public String menuProductBtnX = "//a[.='\uE8F8 Products']";
    public String menuCartBtnX = "//ul[@class='nav navbar-nav']//a[contains(.,'Cart')]";
    public AccountPage(WebDriver driver) {
        super(driver);
    }
}
