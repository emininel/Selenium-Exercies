package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickId(String elementId){
        driver.findElement(By.id(elementId)).click();
    }
    public void clickXPath(String elementX){
        driver.findElement(By.xpath(elementX)).click();
    }
    public void writeId (String elementId,String keys){
        driver.findElement(By.id(elementId)).sendKeys(keys);
    }
    public void writeXPath(String elementXP,String keys){
        driver.findElement(By.xpath(elementXP)).sendKeys(keys);
    }
    public void writeName(String elementName,String keys){
        driver.findElement(By.name(elementName)).sendKeys(keys);
    }
}
