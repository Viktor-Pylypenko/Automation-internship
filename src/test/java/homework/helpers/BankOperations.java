package homework.helpers;

import java.util.*;

public class BankOperations {
    public static void showRates(String bankName, double buyRate, double sellRate) {
        System.out.printf("\n%s:" +
                        "\nКурс покупки доллара равен %s гривен." +
                        "\nКурс продажи доллара равен %s гривен.\n",
                bankName, buyRate, sellRate);
    }

    public static void showRates(String bankName, double rate) {
        System.out.printf("\n%s:" +
                        "\nОфициальный курс НБУ к доллару США %s гривен.\n",
                bankName, rate);
    }

    public static void avgBuyingRate(double... buyingRate) {
        double sum = 0;
        for (double rate : buyingRate) {
            sum += rate;
        }
        System.out.println("\nСредний курс покупки доллара по всем банкам " + Math.round(sum/buyingRate.length * 100.0)/100.0 + " гривен.\n");
    }

    public static void avgSellingRate(double... selligRate) {
        double sum = 0;
        for (double rate : selligRate) {
            sum += rate;
        }
        System.out.println("\nСредний курс продажи доллара по всем банкам " + Math.round(sum/selligRate.length * 100.0)/100.0 + " гривен.\n");
    }

    public static void lowestBuyingRate(Map<String, Double> rates) {
        List<Double> list = new ArrayList<>(rates.values());
        Collections.sort(list);
        Double lowestRate = list.get(0);
        String bankWithLowestRate = null;
        for (Map.Entry<String, Double> entry : rates.entrySet()){
            if (entry.getValue().equals(lowestRate)) {
                bankWithLowestRate = entry.getKey();
            }
        }
        System.out.printf("\nБанк с самым низким курсом покупки доллара: %s - %s гривен.\n", bankWithLowestRate, lowestRate);
    }

    public static void highestSellingRate(Map<String, Double> rates) {
        List<Double> list = new ArrayList<>(rates.values());
        Collections.sort(list);
        Double highestRate = list.get(list.size()-1);
        String bankWithHighestRate = null;
        for (Map.Entry<String, Double> entry : rates.entrySet()){
            if (entry.getValue().equals(highestRate)) {
                bankWithHighestRate = entry.getKey();
            }
        }
        System.out.printf("\nБанк с самым высоким курсом продажи доллара: %s - %s гривен.\n", bankWithHighestRate, highestRate);
    }
}
