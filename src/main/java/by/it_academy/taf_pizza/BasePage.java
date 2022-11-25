package by.it_academy.taf_pizza;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage{
    WebDriver driver;
    public final String URL = "https://pizzamania.by/";

    public  void clickWebElement(WebElement webElement){
        webElement.click();
    }
}
