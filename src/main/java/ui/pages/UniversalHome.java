package ui.pages;

import org.openqa.selenium.By;
import ui.core.Constants;
import ui.core.PageElement;

import static ui.core.BrowserFactory.driver;

public class UniversalHome {

    public PageElement dollarBuyingRate = new PageElement(By.cssSelector("table:not(.conversion-rate) tbody>tr:nth-child(2)>td:nth-child(2)"));
    public PageElement dollarSellingRate = new PageElement(By.cssSelector("table:not(.conversion-rate) tbody>tr:nth-child(2)>td:nth-child(3)"));

    public void navigate() {
        driver().navigate().to(Constants.UNIVERSAL_PATH);
    }

    public double getBuyingRate() {
        return Double.parseDouble(dollarBuyingRate.getNodeText());
    }

    public double getSellingRate() {
        return Double.parseDouble(dollarSellingRate.getNodeText());
    }
}
