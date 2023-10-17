package homework.lessons.patterns.factory_method;

public class MacBookLaptop implements Laptop {
    @Override
    public void turnOn() {
        System.out.println("MacBook is turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("MacBook is turned Off");
    }
}
