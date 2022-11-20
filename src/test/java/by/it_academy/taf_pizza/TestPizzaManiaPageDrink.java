package by.it_academy.taf_pizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPizzaManiaPageDrink{
    @Test
    public void testPageDrinkActions(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PizzaManiaPageDrink pageDrink = new PizzaManiaPageDrink(driver);
        pageDrink.openUrlClickDesertsAddJuiceAppleClickBasket();

        Assert.assertEquals(pageDrink.EXPECTED_BEVERAGE_JUICE_YA_APPLE, pageDrink.getTextDrink());
        driver.quit();
    }
}
