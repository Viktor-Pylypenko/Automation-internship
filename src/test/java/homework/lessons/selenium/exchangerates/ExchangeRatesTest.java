package homework.lessons.selenium.exchangerates;

import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ui.core.BrowserFactory;
import ui.pages.banks.*;

import java.util.Map;

import static homework.helpers.BankOperations.*;

@Epic("Regression")
@Feature("Parser")
public class ExchangeRatesTest extends BrowserFactory {

    PrivateHomePage privateBank = new PrivateHomePage();
    UKRSibHomePage ukrSibBank = new UKRSibHomePage();
    UniversalHomePage universalBank = new UniversalHomePage();
    OschadHomePage oschadBank = new OschadHomePage();
    NBUHomePage nbu = new NBUHomePage();

    @Story("Parse buying/selling rates")
    @Test
    public void execute() {
        privateBank.open();
        double privateBR = privateBank.getBuyingRate();
        double privateSR = privateBank.getSellingRate();
        showRates("Private Bank", privateBR, privateSR);

        ukrSibBank.navigate();
        double ukrsibBR = ukrSibBank.getBuyingRate();
        double ukrsibSR = ukrSibBank.getSellingRate();
        showRates("Ukrsib Bank", ukrsibBR, ukrsibSR);

        universalBank.navigate();
        double universalBR = universalBank.getBuyingRate();
        double universalSR = universalBank.getSellingRate();
        showRates("Universal Bank", universalBR, universalSR);

        oschadBank.navigate();
        double oschadBR = oschadBank.getBuyingRate();
        double oschadSR = oschadBank.getSellingRate();
        showRates("Oschad Bank", oschadBR, oschadSR);

        nbu.navigate();
        showRates("NBU", nbu.getRate());

        avgBuyingRate(privateBR, ukrsibBR, universalBR, oschadBR);

        avgSellingRate(privateSR, ukrsibSR, universalSR, oschadSR);

        Map<String, Double> ratesBuying = ImmutableMap.of(
            "Private Bank", privateBR,
            "Ukrsib Bank ", ukrsibBR,
            "Universal Bank", universalBR,
            "Oschadbank", oschadBR
        );
        lowestBuyingRate(ratesBuying);

        Map<String, Double> ratesSelling = ImmutableMap.of(
                "Private Bank", privateSR,
                "Ukrsib Bank ", ukrsibSR,
                "Universal Bank", universalSR,
                "Oschadbank", oschadSR
        );
        highestSellingRate(ratesSelling);

        tearDownDriver();
    }
}
