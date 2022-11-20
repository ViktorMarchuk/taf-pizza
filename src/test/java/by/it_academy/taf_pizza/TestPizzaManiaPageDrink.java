package by.it_academy.taf_pizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPizzaManiaPageDrink{
    @Test
    public void testPageDrinkActions(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        PizzaManiaPageDrink pageDrink = new PizzaManiaPageDrink(driver);
        pageDrink.printActionsOnPage();

        Assert.assertEquals(pageDrink.EXPECTED, pageDrink.getTextDrink());
        driver.quit();
    }
}
