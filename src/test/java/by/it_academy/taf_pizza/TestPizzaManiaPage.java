package by.it_academy.taf_pizza;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestPizzaManiaPage extends BaseTest{

    @Test
    public void testActionsWithPizza(){
        PizzaManiaStep step=new PizzaManiaStep(webDriver);
        step.orderPizza();

        Assert.assertEquals(step.PIZZA_MARGHERITA, step.getTextPizza());
    }

    @Test
    public void testActionsWithPizzaAndDrink(){
        PizzaManiaStep step=new PizzaManiaStep(webDriver);
        step.orderPizzaAndDrink();

        Assert.assertEquals(step.PIZZA_MARGHERITA,step.getTextPizza());
        Assert.assertEquals(step.BEVERAGE_AURA, step.getTextDrink());
    }
}
