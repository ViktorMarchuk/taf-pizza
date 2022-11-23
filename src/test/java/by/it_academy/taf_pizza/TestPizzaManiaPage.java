package by.it_academy.taf_pizza;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestPizzaManiaPage extends BaseTest{

    @Test
    public void testActionsWithPizza(){
        PizzaManiaStep step=new PizzaManiaStep(webDriver);
        step.actionOnPageWithPizza();

        Assert.assertEquals(step.EXPECTED_PIZZA_MARGHERITA, step.getTextPizza());
    }

    @Test
    public void testActionsWithPizzaAndDrink(){
        PizzaManiaStep step=new PizzaManiaStep(webDriver);
        step.actionsOnPageWithPizzaAndDrink();

        Assert.assertEquals(step.EXPECTED_PIZZA_MARGHERITA,step.getTextPizza());
        Assert.assertEquals(step.EXPECTED_BEVERAGE_AURA, step.getTextDrink());
    }
}
