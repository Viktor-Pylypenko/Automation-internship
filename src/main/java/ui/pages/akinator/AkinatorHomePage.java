package ui.pages.akinator;

import org.openqa.selenium.*;
import ui.core.Constants;
import ui.core.PageElement;

import static ui.core.BrowserFactory.driver;

public class AkinatorHomePage {

    PageElement iframe = new PageElement(By.cssSelector("#appconsent iframe"));
    PageElement acceptAllButton = new PageElement(By.cssSelector(".button__acceptAll"));
    PageElement playButton = new PageElement(By.cssSelector(".btn-play a"));

    public void open() {
        driver().get(Constants.AKINATOR_PATH);
    }

    public void acceptCookie() {
        iframe.switchToIframe(iframe);
        acceptAllButton.click();
        driver().switchTo().defaultContent();
    }

    public void startGame() {
        playButton.click();
    }
}
