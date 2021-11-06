package homework.lessons.wrappers;

import homework.helpers.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Autoboxing extends ConsoleReader {
    public static void main(String[] args) throws IOException {
        try {
            // byte autoboxing
            System.out.println("\nPlease, enter an \"byte\" primitive [-128;127] which will be converted to an \"Byte\" wrapper:");
            byte primitive_byte = getConsoleByte(new BufferedReader(new InputStreamReader(System.in)));
            Byte wrapped_byte = primitive_byte;
            if (wrapped_byte instanceof Byte) {
                System.out.printf("The %s primitive is automatically packed to an %s wrapper.\n", primitive_byte, wrapped_byte);
            }
            // short autoboxing
            System.out.println("\nPlease, enter an \"short\" primitive [-32768;32768] which will be converted to an \"Short\" wrapper:");
            short primitive_short = getConsoleShort(new BufferedReader(new InputStreamReader(System.in)));
            Short wrapped_short = primitive_short;
            if (wrapped_short instanceof Short) {
                System.out.printf("The %s primitive is automatically packed to an %s wrapper.\n", primitive_short, wrapped_short);
            }
            // int autoboxing
            System.out.println("\nPlease, enter an \"int\" primitive [-2147483648;2147483647] which will be converted to an \"Integer\" wrapper:");
            int primitive_int = getConsoleInteger(new BufferedReader(new InputStreamReader(System.in)));
            Integer wrapped_int = primitive_int;
            if (wrapped_int instanceof Integer) {
                System.out.printf("The %s primitive is automatically packed to an %s wrapper.\n", primitive_int, wrapped_int);
            }
            // long autoboxing
            System.out.println("\nPlease, enter an \"long\" primitive [–9223372036854775808;9223372036854775807] which will be converted to an \"Long\" wrapper:");
            long primitive_long = getConsoleLong(new BufferedReader(new InputStreamReader(System.in)));
            Long wrapped_long = primitive_long;
            if (wrapped_long instanceof Long) {
                System.out.printf("The %s primitive is automatically packed to an %s wrapper.\n", primitive_long, wrapped_long);
            }
            // float autoboxing
            System.out.println("\nPlease, enter an \"float\" primitive [3.4e-038;3.4e+038] which will be converted to an \"Float\" wrapper:");
            float primitive_float = getConsoleFloat(new BufferedReader(new InputStreamReader(System.in)));
            Float wrapped_float = primitive_float;
            if (wrapped_float instanceof Float) {
                System.out.printf("The %s primitive is automatically packed to an %s wrapper.\n", primitive_float, wrapped_float);
            }
            // double autoboxing
            System.out.println("\nPlease, enter an \"double\" primitive [1.7e-308;1.7e+308] which will be converted to an \"Double\" wrapper:");
            double primitive_double = getConsoleDouble(new BufferedReader(new InputStreamReader(System.in)));
            Double wrapped_double = primitive_double;
            if (wrapped_double instanceof Double) {
                System.out.printf("The %s primitive is automatically packed to an %s wrapper.\n", primitive_double, wrapped_double);
            }
            // char autoboxing
            System.out.println("\nPlease, enter an \"char\" symbol which will be converted to an \"Character\" wrapper:");
            char primitive_char = getConsoleChar(new BufferedReader(new InputStreamReader(System.in)));
            Character wrapped_char = primitive_char;
            if (wrapped_char instanceof Character) {
                System.out.printf("The %s primitive is automatically packed to an %s wrapper.\n", primitive_char, wrapped_char);
            }
            // boolean autoboxing
            System.out.println("\nPlease, enter an \"boolean\" true or false value which will be converted to an \"Boolean\" wrapper:");
            boolean primitive_boolean = getConsoleBoolean(new BufferedReader(new InputStreamReader(System.in)));
            Boolean wrapped_boolean = primitive_boolean;
            if (wrapped_boolean instanceof Boolean && !(wrapped_boolean.equals(true) || wrapped_boolean.equals(false))) {
                System.out.printf("The %s primitive is automatically packed to an %s wrapper.\n", primitive_boolean, wrapped_boolean);
            } else {
                System.out.println("You entered an invalid value");
            }

        } catch (NumberFormatException e) {
            System.out.println("The field cannot be empty! Try again");
        }

    }
}
