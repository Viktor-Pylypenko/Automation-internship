package homework.lessons.inner_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Runner {
    public static void main(String[] args) throws IOException {

        String in = new BufferedReader(new InputStreamReader(System.in)).readLine();


        if (in.matches("\\b(as-rc|as-prod|as-prod-au|as-stage)\\b") && in.contains("bot")) {
            System.out.println("bot");
        } else if (in.matches("\\b(as-rc|as-prod|as-prod-au|as-stage)\\b")) {
            System.out.println("other");
        } else {
            System.out.println("NOT");
        }
    }
}
