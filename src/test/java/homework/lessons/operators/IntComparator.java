package homework.lessons.operators;

import homework.helpers.MathOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntComparator extends MathOperations {

    public static void main(String[] args) throws IOException {

        System.out.println("\nPlease enter the first number for comparison");
        int first = getConsoleInteger(new BufferedReader(new InputStreamReader(System.in)));

        System.out.println("Please enter the second number for comparison");
        int second = getConsoleInteger(new BufferedReader(new InputStreamReader(System.in)));

        sum(first, second);
        diff(first,second);
        prod(first, second);
        avg(first, second);
        dist(first, second);
        max(first, second);

    }
}
