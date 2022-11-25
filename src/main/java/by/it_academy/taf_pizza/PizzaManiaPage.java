package by.it_academy.taf_pizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;


public class PizzaManiaPage extends BasePage {
    //private WebDriver driver;
    public final String PIZZA_MARGHERITA = "Маргарита*";
    public final String BEVERAGE_AURA = "AURA";
    private String xPathButtonToBasket = "//article[@id='item-37']/div[2]/div/a";
    private String xPathButtonBasket = "//a[@id='basket']";
    private String xPathChosenPizza = "//div[@data-id='37']/div[2]/div/h5";
    private String xPathChooseDrinkButton = "//a[@href='/#beverages']";
    private String xPathButtonToBasketWaterAura = "//article[@id='item-95']/div[2]/div/a";
    private String xPathChosenDrink = "//div[@data-id='95']/div[2]/div/h5";

    public PizzaManiaPage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url){
        driver.navigate().to(URL);
    }

    public void scrollPage(){
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 10);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 7500)
                .perform();
    }

    public void clickButtonToBasket(){
        By buttonToBasket = By.xpath(xPathButtonToBasket);
        WebElement webElementButtonToBasket = driver.findElement(buttonToBasket);
        clickWebElement(webElementButtonToBasket);
    }

    public void clickButtonBasket(){
        By buttonBasket = By.xpath(xPathButtonBasket);
        WebElement webElementButtonBasket = driver.findElement(buttonBasket);
        clickWebElement(webElementButtonBasket);

    }

    public String getTextPizza(){
        By chosenPizza = By.xpath(xPathChosenPizza);
        WebElement webElementChosenPizza = driver.findElement(chosenPizza);
        return webElementChosenPizza.getText();
    }

    public void addDrinkButton(){
        By chosenDrinkButton = By.xpath(xPathChooseDrinkButton);
        WebElement webElementDrinkButton = driver.findElement(chosenDrinkButton);
        clickWebElement(webElementDrinkButton);
    }

    public void clickChosenDrink(){
        By clickButtonToBasketWaterAura = By.xpath(xPathButtonToBasketWaterAura);
        WebElement webElementButtonToBasketWaterAura = driver.findElement(clickButtonToBasketWaterAura);
        clickWebElement(webElementButtonToBasketWaterAura);
    }

    public String getTextDrink(){
        By chosenDrink = By.xpath(xPathChosenDrink);
        WebElement webElementChosenDrink = driver.findElement(chosenDrink);
        return webElementChosenDrink.getText();
    }
}
