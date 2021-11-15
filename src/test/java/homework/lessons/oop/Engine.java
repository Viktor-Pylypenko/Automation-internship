package homework.lessons.oop;

public class Engine {

    private int power;
    private double fuelConsumption;

    Engine(int power, double fuelConsumption) {
        this.power = power;
        this.fuelConsumption = fuelConsumption;
    }

    void putGas() {
        System.out.println("Gas is supplied to the engine!");
    }

    void burnGas() {
        System.out.println("Gas combustion");
    }

    void run() {
        putGas();
        burnGas();
        System.out.println("Engine is started!");
    }

    void stop() {
        System.out.println("Engine is stopped!");
    }

}

class SportEngine extends Engine {
    SportEngine(int power, double fuelConsumption) {
        super(power, fuelConsumption);
    }
    @Override
    void run() {
        putGas();
        burnGas();
        System.out.println(SportEngine.class.getSimpleName() + " is started!");
    }

    @Override
    void stop() {
        System.out.println(SportEngine.class.getSimpleName() + " is stopped!");
    }
}

class RegularEngine extends Engine {
    RegularEngine(int power, double fuelConsumption) {
        super(power, fuelConsumption);
    }
    @Override
    void run() {
        putGas();
        burnGas();
        System.out.println(RegularEngine.class.getSimpleName() + " is started!");
    }

    @Override
    void stop() {
        System.out.println(RegularEngine.class.getSimpleName() + " is stopped!");
    }
}
