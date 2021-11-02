package homework.helpers;

public class MathOperations extends ConsoleReader {

    public static void sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a+b));
    }

    public static void diff(int a, int b) {
        System.out.println("Difference of two integers: " + (a-b));
    }

    public static void prod(int a, int b) {
        System.out.println("Product of two integers: " + (a*b));
    }

    public static void avg(int a, int b) {
        System.out.println("Average of two integers: " + (float) (a+b)/2);
    }

    public static void dist(int a, int b) {
        System.out.println("Distance of two integers: " + Math.abs(a-b));
    }

    public static void max(int a, int b) {
        if (a > b) {
            System.out.println("Max of two integers: " + a);
            System.out.println("Min of two integers: " + b);
        } else {
            System.out.println("Max of two integers: " + b);
            System.out.println("Min of two integers: " + a);
        }
    }
}
