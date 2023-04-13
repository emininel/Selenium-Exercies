package Pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends Page{

    public String categorieMenOpenX= "//a[@href='#Men']//i[@class='fa fa-plus']";
    public String categorieWomenOpenX= "//a[@href='#Women']//i[@class='fa fa-plus']";
    public String categorieKidsOpenX= "//a[@href='#Kids']//i[@class='fa fa-plus']";
    public String categoireMenOptionTshirtX= "//a[contains(.,'Tshirts')]";
    public String categoireMenOptionJeansX= "//a[contains(.,'Jeans')]";
    public String categoireWomenOptionDressX= "//a[@href='/category_products/1']";
    public String categoireWomenOptionTopsX= "//a[@href='/category_products/2']";
    public String categoireWomenOptionSareeX= "//a[contains(.,'Saree')]";
    public String categoireKidsOptionDressX= "//a[@href='/category_products/4']";
    public String categoireKidsOptionTopAndShirtX= "//a[contains(.,'Tops & Shirts')]";
    public String addCartBtnWomenDressX = "//div[@class='features_items']/div[2]//div[@class='productinfo text-center']/a[.='Add to cart']";
    public String addCartBtnWomenTopsX = "//div[@class='features_items']/div[2]//div[@class='productinfo text-center']/a[.='Add to cart']";
    public String addCartBtnWomenSareeX="//div[@class='features_items']/div[2]//div[@class='productinfo text-center']/a[.='Add to cart']";
    public String addCartBtnMenTshirtsX = "//div[@class='features_items']/div[2]//div[@class='productinfo text-center']/a[.='Add to cart']";
    public String addCartBtnMenJeanX ="//div[@class='features_items']/div[2]//div[@class='productinfo text-center']/a[.='Add to cart']";
    public String addCartBtnKidsDressX = "//div[@class='features_items']/div[2]//div[@class='productinfo text-center']/a[.='Add to cart']";
    public String addCartBtnKidsTopAndShirtX = "//div[@class='features_items']/div[2]//div[@class='productinfo text-center']/a[.='Add to cart']";
    public String continueShoppingBtnCss=".btn-success";
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
}
