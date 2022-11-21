package by.it_academy.taf_pizza;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TestPizzaManiaPageFood extends BaseTest{

    @Test
    public void testActionsWithPizza(){
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PizzaManiaPageFood page = new PizzaManiaPageFood(webDriver);
        page.actionOnPageWithPizza();

        Assert.assertEquals(page.EXPECTED_PIZZA_MARGHERITA, page.getTextPizza());
    }

    @Test
    public void testActionsWithPizzaAndDrink(){
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PizzaManiaPageFood page = new PizzaManiaPageFood(webDriver);
        page.actionsOnPageWithPizzaAndDrink();

        Assert.assertEquals(page.EXPECTED_PIZZA_MARGHERITA, page.getTextPizza());
        Assert.assertEquals(page.EXPECTED_BEVERAGE_AURA, page.getTextDrink());
    }
}
