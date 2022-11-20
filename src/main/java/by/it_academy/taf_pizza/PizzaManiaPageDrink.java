package by.it_academy.taf_pizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaManiaPageDrink{
    private WebDriver driver;
    public final String URL = "https://pizzamania.by/";
    public final String BEVERAGE_JUICE_YA_APPLE = "Сок Я яблоко";
    private String xPathLinkDesserts = "//a[@href='/#desserts']";
    private String xPathButtonAddToBasketBeverageJuiceYaApple = "//a[@data-id='84']";
    private String xPathBasketButton = "//a[@id='basket'][@class='btn btn_basket']";
    private String xPathChosenDrink = "//form[@id='cartform']/section/div/div[1]/div/div[2]/div/h5";

    public PizzaManiaPageDrink(WebDriver driver){
        this.driver = driver;
    }

    public void clickLinkDesserts(){
        By drinkButton = By.xpath(xPathLinkDesserts);
        WebElement webElementDrinkButton = driver.findElement(drinkButton);
        webElementDrinkButton.click();
    }

    public void clickButtonAddToBasketBeverageJuiceYaApple(){
        By inBasketButton = By.xpath(xPathButtonAddToBasketBeverageJuiceYaApple);
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
        String str = webElementChosenDrink.getText();
        System.out.println("PizzaManiaPageDrink.getTextDrink() = " + str);
        return str;
    }

    public void openUrlClickDesertsAddJuiceAppleClickBasket(){
        driver.navigate().to(URL);
        clickLinkDesserts();
        clickButtonAddToBasketBeverageJuiceYaApple();
        clickBasketButton();
    }
}
