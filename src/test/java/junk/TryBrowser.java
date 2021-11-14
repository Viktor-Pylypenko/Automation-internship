package junk;

import org.testng.annotations.Test;
import ui.core.BrowserFactory;

public class TryBrowser extends BrowserFactory {
    @Test
    public void execute() {
        driver().get("https://online.ukrsibbank.com/ibank/");
    }
}
