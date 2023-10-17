package homework.lessons.patterns.abstract_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Holding {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        CarFactory factory = clientRequest(bufferedReader.readLine());

        factory.createCoupe().getCoupeCar();
    }

    public static CarFactory clientRequest(String request) {
        switch (request) {
            case "TOYOTA":
                return new ToyotaFactory();
            case "FORD":
                return new FordFactory();
            default:
                throw new IllegalArgumentException("UNKNOWN CAR");
        }
    }
}
