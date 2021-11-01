package homework.lesson1;

import homework.lesson1.helpers.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second extends ConsoleReader {
    public static void main(String[] args) throws IOException {
        System.out.println("\n" +
                "Please enter an integer to convert it to char. " +
                "If you want to end the program press \"Enter\".");

        String s;
        while (!(s = getConsoleString(new BufferedReader(new InputStreamReader(System.in)))).equals("")) {
            if (s.equals("")) {
                break;
            } else {
                int num = Integer.parseInt(s);
                System.out.println("Символ введенного числа: " + ((char) num));
            }
        }
    }
}

