package by.it_academy.taf_pizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPizzaManiaPageFood{

    @Test
    public void testActionsWithPizza(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PizzaManiaPageFood page = new PizzaManiaPageFood(driver);
        page.actionOnPageWithPizza();

        Assert.assertEquals(page.EXPECTED_PIZZA_MARGHERITA, page.getTextPizza());
        driver.quit();
    }

    @Test
    public void testActionsWithPizzaAndDrink(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PizzaManiaPageFood page = new PizzaManiaPageFood(driver);
        page.actionsOnPageWithPizzaAndDrink();

        Assert.assertEquals(page.EXPECTED_PIZZA_MARGHERITA, page.getTextPizza());
        Assert.assertEquals(page.EXPECTED_BEVERAGE_AURA, page.getTextDrink());
        driver.quit();
    }
}
