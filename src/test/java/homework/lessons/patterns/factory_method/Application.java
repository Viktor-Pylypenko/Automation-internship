package homework.lessons.patterns.factory_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LaptopFactory factory = new LaptopFactory();

        Laptop laptop = factory.createLaptop(br.readLine());
        laptop.turnOn();
        Thread.sleep(3000);
        laptop.turnOff();
    }

}
