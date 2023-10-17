package homework.lessons.patterns.factory_method;

public class AsusLaptop implements Laptop {
    @Override
    public void turnOn() {
        System.out.println("Asus is turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Asus is turned Off");
    }
}
