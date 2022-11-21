package by.it_academy.taf_pizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPizzaManiaPageDrink extends BaseTest{
    @Test
    public void testPageDrinkActions(){
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PizzaManiaPageDrink pageDrink = new PizzaManiaPageDrink(webDriver);
        pageDrink.openUrlClickDesertsAddJuiceAppleClickBasket();

        Assert.assertEquals(pageDrink.EXPECTED_BEVERAGE_JUICE_YA_APPLE, pageDrink.getTextDrink());
    }
}
