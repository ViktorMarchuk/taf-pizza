package by.it_academy.taf_pizza;

import org.openqa.selenium.WebDriver;

public class PizzaManiaStep extends PizzaManiaPage{

    public PizzaManiaStep(WebDriver driver){
        super(driver);
    }

    public void orderPizza(){
        openPage(URL);
        scrollPage();
        clickButtonToBasket();
        clickButtonBasket();
    }

    public void orderPizzaAndDrink(){
        openPage(URL);
        scrollPage();
        clickButtonToBasket();
        clickButtonBasket();
        addDrinkButton();
        clickChosenDrink();
        clickButtonBasket();
    }
}
