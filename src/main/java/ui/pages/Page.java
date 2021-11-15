package ui.pages;

import org.openqa.selenium.By;
import ui.core.Constants;
import ui.core.PageElement;

import static ui.core.BrowserFactory.driver;

public class Page {
    public PageElement element = new PageElement(By.cssSelector("header .container ul li:first-child"));

    public void open() {
        driver().get(Constants.UKRSIB_PATH);
    }

    public void presenceOfElement() {
        element.findPageElement();
        element.click();
    }
}
