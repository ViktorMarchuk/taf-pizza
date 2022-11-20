package by.it_academy.taf_pizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class PizzaManiaPageDrink{
    private WebDriver driver;
    public final String URL = "https://pizzamania.by/";
    public final String EXPECTED = "Сок Я яблоко";
    private String xPathDrinkButton = "//a[@href='/#desserts']";
    private String xPathInBasketButton = "//a[@data-id='84']";
    private String xPathBasketButton = "//a[@id='basket'][@class='btn btn_basket']";
    private String xPathChosenDrink = "//form[@id='cartform']/section/div/div[1]/div/div[2]/div/h5";

    public PizzaManiaPageDrink(WebDriver driver){
        this.driver = driver;
    }

    public void clickDrinkButton(){
        By drinkButton = By.xpath(xPathDrinkButton);
        WebElement webElementDrinkButton = driver.findElement(drinkButton);
        webElementDrinkButton.click();
    }

    public void clickChosenDrink(){
        By inBasketButton = By.xpath(xPathInBasketButton);
        WebElement webElementInBasketButton = driver.findElement(inBasketButton);
        webElementInBasketButton.click();
    }

    public void clickBasketButton(){
        By basketButton = By.xpath(xPathBasketButton);
        WebElement webElementBasketButton = driver.findElement(basketButton);
        webElementBasketButton.click();
    }

    public String getTextDrink(){
        By chosenDrink = By.xpath(xPathChosenDrink);
        WebElement webElementChosenDrink = driver.findElement(chosenDrink);
        return webElementChosenDrink.getText();
    }

    public void printActionsOnPage(){
        driver.navigate().to(URL);
        clickDrinkButton();
        clickChosenDrink();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        clickBasketButton();
    }
}
