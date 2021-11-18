package ui.pages;

import org.openqa.selenium.By;
import ui.core.Constants;
import ui.core.PageElement;

import static ui.core.BrowserFactory.driver;

public class NBUHome {

    public PageElement dollarRate = new PageElement(By.cssSelector(".widget-macrovalues div:nth-child(4) .value"));

    public void navigate() {
        driver().navigate().to(Constants.NBU_PATH);
    }

    public double getRate() {
        return Double.parseDouble((dollarRate.getNodeText().replaceAll("\\s","")).replaceAll(",","."));
    }

}
