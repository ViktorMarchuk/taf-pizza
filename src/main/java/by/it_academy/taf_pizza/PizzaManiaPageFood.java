package by.it_academy.taf_pizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PizzaManiaPageFood{
    private WebDriver driver;
    public final String URL = "https://pizzamania.by/";
    public final String EXPECTED_PIZZA_MARGHERITA = "Маргарита*";
    public final String EXPECTED_BEVERAGE_AURA = "AURA";
    private String xPathLinkPizza = "//a[@href='/#pizza']";
    private String xPathButtonToBasket = "//article[@id=\"item-37\"]/div[2]/div/a";
    private String xPathButtonBasket = "//a[@id='basket']";
    private String xPathChosenPizza = "//div[@data-id='37']/div[2]/div/h5";
    private String xPathChooseDrinkButton = "//a[@href='/#beverages']";
    private String xPathButtonToBasketWaterAura = "//article[@id='item-95']/div[2]/div/a";
    private String xPathChosenDrink = "//div[@data-id='95']/div[2]/div/h5";

    public PizzaManiaPageFood(WebDriver driver){
        this.driver = driver;
    }

    public void openUrl(String url){
        driver.navigate().to(url);
    }

    public void clickButtonPizza(){
        By buttonPizza = By.xpath(xPathLinkPizza);
        WebElement webElementButtonPizza = driver.findElement(buttonPizza);
        webElementButtonPizza.click();
    }

    public void clickButtonToBasket(){
        By buttonToBasket = By.xpath(xPathButtonToBasket);
        WebElement webElementButtonToBasket = driver.findElement(buttonToBasket);
        webElementButtonToBasket.click();
    }

    public void clickButtonBasket(){
        By buttonBasket = By.xpath(xPathButtonBasket);
        WebElement webElementButtonBasket = driver.findElement(buttonBasket);
        webElementButtonBasket.click();

    }

    public String getTextPizza(){
        By chosenPizza = By.xpath(xPathChosenPizza);
        WebElement webElementChosenPizza = driver.findElement(chosenPizza);
        return webElementChosenPizza.getText();
    }

    public void addDrinkButton(){
        By chosenDrinkButton = By.xpath(xPathChooseDrinkButton);
        WebElement webElementDrinkButton = driver.findElement(chosenDrinkButton);
        webElementDrinkButton.click();
    }

    public void clickChosenDrink(){
        By clickButtonToBasketWaterAura = By.xpath(xPathButtonToBasketWaterAura);
        WebElement webElementButtonToBasketWaterAura = driver.findElement(clickButtonToBasketWaterAura);
        webElementButtonToBasketWaterAura.click();
    }

    public String getTextDrink(){
        By chosenDrink = By.xpath(xPathChosenDrink);
        WebElement webElementChosenDrink = driver.findElement(chosenDrink);
        return webElementChosenDrink.getText();
    }

    public void actionsOnPageWithPizzaAndDrink(){
        openUrl(URL);
        // driver.navigate().to(URL);
        clickButtonPizza();
        clickButtonToBasket();
        clickButtonBasket();
        addDrinkButton();
        clickChosenDrink();
        clickButtonBasket();

    }

    public void actionOnPageWithPizza(){
        openUrl(URL);
        //  driver.navigate().to(URL);
        clickButtonPizza();
        clickButtonToBasket();
        clickButtonBasket();
    }
}
