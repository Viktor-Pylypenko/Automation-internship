package ui.pages;

import org.openqa.selenium.By;
import ui.core.Constants;
import ui.core.PageElement;

import static ui.core.BrowserFactory.driver;

public class UKRSibHome {

    public PageElement dollarBuyingRate = new PageElement(By.cssSelector("#NALUSD > .rate__buy > p"));
    public PageElement dollarSellingRate = new PageElement(By.cssSelector("#NALUSD > .rate__sale > p"));

    public void navigate() {
        driver().navigate().to(Constants.UKRSIB_PATH);
    }

    public double getBuyingRate() {
        return Double.parseDouble(dollarBuyingRate.getNodeText());
    }

    public double getSellingRate() {
        return Double.parseDouble(dollarSellingRate.getNodeText());
    }
}
