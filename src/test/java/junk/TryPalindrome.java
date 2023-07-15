package junk;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lineData = br.readLine();

        System.out.println(isPalindrome(lineData));
    }

    public static String isPalindrome(String data) {
        return StringUtils.isNumeric(data) && StringUtils.reverse(data).equals(data) ? "true" : "false";
    }
}
