package ui.core;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static ui.core.BrowserFactory.getWebDriverWait;

public class PageElement {

    private By by;
    private String name;

    PageElement(By by) {
        this.by = by;
    }

    PageElement(By by, String name) {
        this(by);
        this.name = name;
    }

    public WebElement findPageElement() {
        return getWebDriverWait(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click() {
        findPageElement().click();
    }

    public void type(String text) {
        findPageElement().clear();
        findPageElement().sendKeys(text);
    }

    public boolean isElementPresent() {
        try {
            getWebDriverWait(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        } catch (TimeoutException e) {
            return false;
        }

    }
}
