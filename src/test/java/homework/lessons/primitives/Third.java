package homework.lessons.primitives;

import homework.helpers.TypeConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third extends TypeConverter {
    public static void main(String[] args) throws IOException {
        System.out.println("\n" +
                "Please enter an char/float value to convert it. " +
                "If you want to end the program press \"Enter\".");

        String s;
        while (!(s = getConsoleString(new BufferedReader(new InputStreamReader(System.in)))).equals("")) {
            if (s.equals("")) {
                break;
            } else {

                if (s.matches("\\D")) {
                    System.out.println("Введенный символ в пересчете на Byte равен " + castCharToByte(s));

                } else {
                    System.out.println("Введенное число с плавающей точкой,\n" +
                            "предварительно переконвертированное в символ, равно числу: " + castFloatToCharToInt(s));
                }
            }
        }
    }


}
