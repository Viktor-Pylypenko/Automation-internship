package homework.lessons.methods.task1;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Random;

public class VarargOverload {

    String[] names = {"Petro", "Ivan", "Oleg"};

    LocalDate ld = LocalDate.now();
    String day = ld.getDayOfWeek().name();

    Temperature[] temp = new Temperature[3];

    @Test
    public void execute() {
        for (int i = 0; i < 3; i++) {
            temp[i] = new Temperature();
        }
        say(day, names, temp);
    }

    public void say(String username) {
        System.out.println("Hi " + username);
    }

    public void say(String... names) {
        for (String name : names) {
            System.out.println("Hi " + name);
        }
    }

    public void say(String day, String... names) {
        for (String name : names) {
            System.out.println("Hi " + name + "\nWhat a beautiful " + day + "\n");
        }
    }

    public void say(String day, String[] names, Temperature... temperature) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hi " + names[i] + "\nWhat a beautiful " + day + ",\n" + temperature[i] + "\n");
        }
    }

    static class Temperature {
        Random rand = new Random();

        @Override
        public String toString() {
            return rand.nextInt(50) + " degrees Celcius";
        }
    }
}
