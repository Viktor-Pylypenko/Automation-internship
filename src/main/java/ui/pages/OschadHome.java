package ui.pages;

import org.openqa.selenium.By;
import ui.core.Constants;
import ui.core.PageElement;

import static ui.core.BrowserFactory.driver;

public class OschadHome {

    public PageElement dollarBuyingRate = new PageElement(By.cssSelector(".currency>div:nth-child(2)>span:nth-child(2)>span"));
    public PageElement dollarSellingRate = new PageElement(By.cssSelector(".currency>div:nth-child(2)>span:nth-child(3)>span"));

    public void navigate() {
        driver().navigate().to(Constants.OSCHAD_PATH);
    }

    public double getBuyingRate() {
        return Double.parseDouble(dollarBuyingRate.getNodeText());
    }

    public double getSellingRate() {
        return Double.parseDouble(dollarSellingRate.getNodeText());
    }
}
