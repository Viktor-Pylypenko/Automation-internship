package junk;

import org.testng.annotations.Test;
import ui.core.BrowserFactory;
import ui.core.Constants;

public class TryBrowser extends BrowserFactory {
    @Test
    public void execute() {
        driver().get(Constants.UKRSIB_PATH);
    }
}
