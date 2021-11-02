package homework.lessons.operators;

import homework.helpers.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintTime extends ConsoleReader {

    static long currentTimeMillis = System.currentTimeMillis();

    public static void main(String[] args) throws IOException {
        System.out.println("\nInput the time zone offset: ");
        long timeZoneChange = Long.parseLong(getConsoleString(new BufferedReader(new InputStreamReader(System.in))));

        long seconds = currentTimeMillis / 1000;

        long currentSeconds = seconds % 60;

        long minutes = seconds / 60;

        long currentMinutes = minutes % 60;

        long hours = minutes / 60;

        long currentHours = ((hours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);

    }
}
