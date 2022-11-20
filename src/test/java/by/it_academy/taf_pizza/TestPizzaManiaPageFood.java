package by.it_academy.taf_pizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPizzaManiaPageFood{

    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void testActionsWithPizza(){
        PizzaManiaPageFood page = new PizzaManiaPageFood(driver);
        page.actionOnPageWithPizza();

        Assert.assertEquals(page.PIZZA_MARGHERITA, page.getTextPizza());
    }

    @Test
    public void testActionsWithPizzaAndDrink(){
        PizzaManiaPageFood page = new PizzaManiaPageFood(driver);
        page.actionsOnPageWithPizzaAndDrink();

        Assert.assertEquals(page.PIZZA_MARGHERITA, page.getTextPizza());
        Assert.assertEquals(page.BEVERAGE_WATER_AURA, page.getTextDrink());
    }
}
