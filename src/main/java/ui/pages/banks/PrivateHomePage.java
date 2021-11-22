package ui.pages.banks;

import org.openqa.selenium.By;
import ui.core.Constants;
import ui.core.PageElement;

import static ui.core.BrowserFactory.driver;

public class PrivateHomePage {

    public PageElement dollarBuyingRate = new PageElement(By.cssSelector(".rates_2g6teezjyl>span:nth-child(1)"));
    public PageElement dollarSellingRate = new PageElement(By.cssSelector(".rates_2g6teezjyl>span:nth-child(3)"));

    public void open() {
        driver().get(Constants.PRIVAT24_PATH);
    }

    public double getBuyingRate() {
        return Double.parseDouble(
                dollarBuyingRate.getNodeText());
    }

    public double getSellingRate() {
        return Double.parseDouble(dollarSellingRate.getNodeText());
    }
}
