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

    public static byte getConsoleByte(BufferedReader bufferedReader) throws IOException {
        return Byte.parseByte(bufferedReader.readLine());
    }

    public static short getConsoleShort(BufferedReader bufferedReader) throws IOException {
        return Short.parseShort(bufferedReader.readLine());
    }

    public static long getConsoleLong(BufferedReader bufferedReader) throws IOException {
        return Long.parseLong(bufferedReader.readLine());
    }

    public static float getConsoleFloat(BufferedReader bufferedReader) throws IOException {
        return Float.parseFloat(bufferedReader.readLine());
    }

    public static double getConsoleDouble(BufferedReader bufferedReader) throws IOException {
        return Double.parseDouble(bufferedReader.readLine());
    }

    public static char getConsoleChar(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.readLine().charAt(0);
    }

    public static boolean getConsoleBoolean(BufferedReader bufferedReader) throws IOException {
        return Boolean.parseBoolean(bufferedReader.readLine());
    }


}
