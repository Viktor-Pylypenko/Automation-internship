package junk;

import org.testng.annotations.Test;
import ui.core.BrowserFactory;
import ui.pages.Page;

public class TryBrowser extends BrowserFactory {

    Page page = new Page();

    @Test
    public void execute() {
        page.open();
        page.presenceOfElement();
    }
}
