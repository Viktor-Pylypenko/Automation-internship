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
        System.out.println("Gas combustion!");
    }

    void stopGas() {
        System.out.println("No gas is supplied to the engine!");
    }

}

class SportEngine extends Engine {
    SportEngine(int power, double fuelConsumption) {
        super(power, fuelConsumption);
    }

    void nitrogeSupply() {
        System.out.println("Nitrogen is supplied to the engine! Car rides faster");
    }
}

class RegularEngine extends Engine {
    RegularEngine(int power, double fuelConsumption) {
        super(power, fuelConsumption);
    }
}
