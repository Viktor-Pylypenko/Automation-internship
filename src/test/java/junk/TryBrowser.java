package junk;

import org.openqa.selenium.*;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;
import ui.core.BrowserFactory;

import java.util.List;
import java.util.Set;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

public class TryBrowser extends BrowserFactory {


    By login = By.cssSelector("ul > .header-nav__item:nth-child(5) > a");
    By usernameInput = By.cssSelector("#username");

    @Test
    public void execute() throws InterruptedException {
        driver().get("https://airslate.com/");
        finding(login);
        clickOnTheElement(login);

        finding(usernameInput);

        Set<Cookie> cookieSet = driver().manage().getCookies();
        showCookie(cookieSet);

        List<LogEntry> consoleLogs = driver().manage().logs().get(LogType.BROWSER).getAll();

        showConsoleLogs(consoleLogs);

        Thread.sleep(10000);

        tearDownDriver();
    }

    public void showCookie(Set<Cookie> cookieSet) {
        for (Cookie cookie : cookieSet) {
            System.out.printf("Cookie: %s\n", cookie.toString());
        }
    }

    public void showConsoleLogs(List<LogEntry> consoleLogs) {
        for (LogEntry logEntry : consoleLogs) {
            System.out.printf("Log: %s\n", logEntry.toString());
        }
    }

    public WebElement finding(By element) {
        Wait wait = new FluentWait(driver())
                .withTimeout(ofSeconds(10))
                .pollingEvery(ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);
        return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(element));


    }

    public boolean isReady(By element) {
        Wait wait = new FluentWait(driver())
                .withTimeout(ofSeconds(10))
                .pollingEvery(ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void clickOnTheElement(By element) {
        finding(element).click();
    }
}








