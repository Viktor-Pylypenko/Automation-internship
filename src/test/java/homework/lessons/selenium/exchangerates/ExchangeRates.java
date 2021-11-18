package homework.lessons.selenium.exchangerates;

import com.google.common.collect.ImmutableMap;
import org.testng.annotations.Test;
import ui.core.BrowserFactory;
import ui.pages.*;

import java.util.Map;

import static homework.helpers.BankOperations.*;

public class ExchangeRates extends BrowserFactory {

    PrivateHome privateBank = new PrivateHome();
    UKRSibHome ukrSibBank = new UKRSibHome();
    UniversalHome universalBank = new UniversalHome();
    OschadHome oschadBank = new OschadHome();
    NBUHome nbu = new NBUHome();

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

    }
}
