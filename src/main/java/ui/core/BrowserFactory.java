package ui.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private static WebDriver driver = new ChromeDriver();

    public static WebDriver driver() {
        driver.manage().window().maximize();
        return driver;
    }

    public static void get(String url) {
        driver().get(url);
    }

    public static void tearDownDriver() {
        driver.quit();
    }
}
