package by.it_academy.taf_pizza;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest{
    WebDriver webDriver;

    @BeforeEach
    public void openWebDriver(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();

    }

    @AfterEach
    public void closeWebDriver(){
        webDriver.quit();
    }
}
