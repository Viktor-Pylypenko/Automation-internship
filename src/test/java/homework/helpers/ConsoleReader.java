package homework.helpers;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleReader {

    public static String getConsoleString(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.readLine();
    }

    public static int getConsoleInteger(BufferedReader bufferedReader) throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }

}