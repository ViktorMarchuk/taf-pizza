package by.it_academy.taf_pizza;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage{
    public final String URL = "https://pizzamania.by/";

    public static void clickButton(WebElement webElement){
        webElement.click();
    }
}
