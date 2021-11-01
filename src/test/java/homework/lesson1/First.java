package homework.lesson1;

import homework.lesson1.helpers.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First extends ConsoleReader {

    public static void main(String[] args) throws IOException {

        System.out.println("\n" +
                "Please enter a character from 0-9, a-z or A-Z. " +
                "If you want to end the program press \"Enter\".");

        String s;

        while (!(s = getConsoleString(new BufferedReader(new InputStreamReader(System.in)))).equals("")) {
            if (s.equals("")) {
                break;
            } else {
                if (s.matches("\\d+")) {
                    System.out.println("Числовое значение введённого символа равено " + (int) s.charAt(0));
                } else if (Character.isLowerCase(s.charAt(0))) {
                    System.out.println("Символ введён в нижнем регистре.\n" +
                            "Числовое значение введённого символа равено " + (int) s.charAt(0));
                } else {
                    System.out.println("Символ введён в верхнем регистре.\n" +
                            "Числовое значение введённого символа равено " + (int) s.charAt(0));
                }

            }
        }

    }

}
