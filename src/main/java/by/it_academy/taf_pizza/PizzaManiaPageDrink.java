package by.it_academy.taf_pizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaManiaPageDrink{
    private WebDriver driver;
    public final String URL = "https://pizzamania.by/";
    public final String EXPECTED_BEVERAGE_JUICE_YA_APPLE = "Сок Я яблоко";
    private String xPathLinkDesserts = "//a[@href='/#desserts']";
    private String xPathButtonAddToBasketBeverageJuiceYaApple = "//article[@id='item-84']/div[2]/div/a";//"//a[@data-id='84']";
    private String xPathButtonBasket = "//a[@id='basket'][@class='btn btn_basket']";
    private String xPathChosenDrink = "//form[@id='cartform']/section/div/div[1]/div/div[2]/div/h5";

    public PizzaManiaPageDrink(WebDriver driver){
        this.driver = driver;
    }
    public void openUrl(String url){
        driver.navigate().to(url);
    }

    public void clickDrinkButton(){
        By drinkButton = By.xpath(xPathLinkDesserts);
        WebElement webElementDrinkButton = driver.findElement(drinkButton);
        webElementDrinkButton.click();
    }

    public void clickChosenDrink(){
        By inBasketButton = By.xpath(xPathButtonAddToBasketBeverageJuiceYaApple);
        WebElement webElementInBasketButton = driver.findElement(inBasketButton);
        webElementInBasketButton.click();
    }

    public void clickBasketButton(){
        By basketButton = By.xpath(xPathButtonBasket);
        WebElement webElementBasketButton = driver.findElement(basketButton);
        webElementBasketButton.click();
    }

    public String getTextDrink(){
        By chosenDrink = By.xpath(xPathChosenDrink);
        WebElement webElementChosenDrink = driver.findElement(chosenDrink);
        return webElementChosenDrink.getText();
    }

    public void openUrlClickDesertsAddJuiceAppleClickBasket(){
        openUrl(URL);
        clickDrinkButton();
        clickChosenDrink();
        clickBasketButton();
    }
}
