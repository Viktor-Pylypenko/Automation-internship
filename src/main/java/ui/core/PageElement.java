package ui.core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

import static ui.core.BrowserFactory.driver;

public class PageElement {

    private By by;

    public PageElement(By by) {
        this.by = by;
    }

    private WebElement findPageElement() {
        Wait wait = new FluentWait(driver())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);
        return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private List<WebElement> findPageElements() {
        Wait wait = new FluentWait(driver())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);
        return (List<WebElement>) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void switchToIframe(PageElement pageElement) {
        driver().switchTo().frame(pageElement.findPageElement());
    }

    public void click() {
        findPageElement().click();
    }

    public void type(String text) {
        findPageElement().clear();
        findPageElement().sendKeys(text);
    }

    public String getNodeText() {
        return findPageElement().getAttribute("innerText");
    }

    public List<WebElement> getListOfElements() {
        return findPageElements();
    }

    public boolean isElementPresent() {
        try {
            findPageElement();
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

}
