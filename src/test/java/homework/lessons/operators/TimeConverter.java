package homework.lessons.operators;

import homework.helpers.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConverter extends ConsoleReader {

    //Try 3456789 minutes;

    public static void main(String[] args) throws IOException {

        System.out.println("\nPlease enter the required number of minutes to convert it to years and days.");
        minuteConverter(getConsoleInteger(new BufferedReader(new InputStreamReader(System.in))));

    }

    public static void minuteConverter(int m) {

        int minutesInDay = 60 * 24;
        int minutesInYear = minutesInDay * 365;

        int years;
        int days;
        
        if (m > minutesInYear && (m % minutesInYear) > minutesInDay) {
            years = m/minutesInYear;
            days = (m % minutesInYear)/minutesInDay;

            System.out.printf("%d minutes it is approximately %d years and %d days", m, years, days);

        } else if (m > minutesInYear && (m % minutesInYear) < minutesInDay) {
            years = m/minutesInYear;

            System.out.printf("%d minutes it is approximately %d years", m, years);
        } else if (m < minutesInYear && m > minutesInDay) {
            days = m/minutesInDay;

            System.out.printf("%d minutes it is approximately %d days", m, days);
        } else {
            System.out.printf("%d minutes it is less then one day", m);
        }
    }

}
