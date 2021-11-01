package homework.lesson1.helpers;

public class TypeConverter extends ConsoleReader {

    public static int castCharToInt(String str) {
        return str.charAt(0);
    }

    public static char castIntToChar(String str) {
        int num = Integer.parseInt(str);
        return (char) num;
    }

    public static byte castCharToByte(String str) {
        return (byte) str.charAt(0);
    }

    public static char castFloatToChar(String str) {
        return (char) Float.parseFloat(str);
    }

    public static int castFloatToCharToInt(String str) {
        return castFloatToChar(str);
    }

}
