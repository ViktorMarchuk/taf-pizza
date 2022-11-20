package by.it_academy.taf_pizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPizzaManiaPageFood{

    @Test
    public void testActionsWithPizza(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        PizzaManiaPageFood page = new PizzaManiaPageFood(driver);
        page.actionOnPageWithPizza();

        Assert.assertEquals(page.PIZZA_MARGHERITA, page.getTextPizza());
        driver.quit();
    }

    @Test
    public void testActionsWithPizzaAndDrink(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        PizzaManiaPageFood page = new PizzaManiaPageFood(driver);
        page.actionsOnPageWithPizzaAndDrink();

        Assert.assertEquals(page.PIZZA_MARGHERITA, page.getTextPizza());
        Assert.assertEquals(page.BEVERAGE_WATER_AURA, page.getTextDrink());
        driver.quit();
    }
}
