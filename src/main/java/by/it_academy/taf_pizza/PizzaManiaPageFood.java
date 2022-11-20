package by.it_academy.taf_pizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PizzaManiaPageFood{
    private WebDriver driver;
    public final String URL = "https://pizzamania.by/";
    public final String PIZZA_MARGHERITA = "Маргарита*";
    public final String BEVERAGE_WATER_AURA = "AURA";
    private String xPathLinkPizza = "//a[@href='/#pizza']";
    private String xPathClickButtonToBasket = "//article[@id='item-37']/div[2]/div/a";
    private String xPathButtonBasket = "//a[@id='basket']";
    private String xPathChosenPizza = "//div[@data-id='37']/div[2]/div/h5";
    private String xPathChooseDrinkButton = "//a[@href='/#beverages']";
    private String xPathButtonAddBeverageAuraToBasket = "//a[@data-id='95']";
    private String xPathChosenDrink = "//div[@data-id='95']/div[2]/div/h5";

    public PizzaManiaPageFood(WebDriver driver){
        this.driver = driver;
    }

    public void clickButtonPizza(){
        By buttonPizza = By.xpath(xPathLinkPizza);
        WebElement webElementButtonPizza = driver.findElement(buttonPizza);
        webElementButtonPizza.click();
    }

    public void clickButtonToBasket(){
        By buttonToBasket = By.xpath(xPathClickButtonToBasket);
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
        String str = webElementChosenPizza.getText();
        System.out.println("PizzaManiaPageFood.getTextPizza() = " + str);
        return str;
    }

    public void addDrinkButton(){
        By chosenDrinkButton = By.xpath(xPathChooseDrinkButton);
        WebElement webElementDrinkButton = driver.findElement(chosenDrinkButton);
        webElementDrinkButton.click();
    }

    public void clickChosenDrink(){
        By clickButtonToBasketWaterAura = By.xpath(xPathButtonAddBeverageAuraToBasket);
        WebElement webElementButtonToBasketWaterAura = driver.findElement(clickButtonToBasketWaterAura);
        webElementButtonToBasketWaterAura.click();
    }

    public String getTextDrink(){
        By chosenDrink = By.xpath(xPathChosenDrink);
        WebElement webElementChosenDrink = driver.findElement(chosenDrink);
        String str = webElementChosenDrink.getText();
        System.out.println("PizzaManiaPageFood.getTextDrink() = " + str);
        return str;
    }

    public void actionsOnPageWithPizzaAndDrink(){
        driver.navigate().to(URL);
        clickButtonPizza();
        clickButtonToBasket();
        clickButtonBasket();
        addDrinkButton();
        clickChosenDrink();
        clickButtonBasket();

    }

    public void actionOnPageWithPizza(){
        driver.navigate().to(URL);
        clickButtonPizza();
        clickButtonToBasket();
        clickButtonBasket();
    }
}
