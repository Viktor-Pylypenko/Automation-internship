package homework.lessons.oop;

public class Car {
    private String name;
    Driver driver;
    Engine engine;
    SportEngine sportEngine;
    Wheel wheel;

    Car(String name, Driver driver, Engine engine, Wheel wheel) {
        this.name = name;
        this.driver = driver;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void startCar() {
        driver.putCarKey();
        driver.turnCarKey();
        engine.putGas();
        engine.burnGas();
    }

    public void stopCar() {
        driver.turnCarKey();
        engine.stopGas();
        driver.pullOutKey();
    }

    public void turnRight() {
        wheel.wheelRight();
    }
    public void turnleft() {
        wheel.wheelLeft();
    }
    public void signal() {
        wheel.signal();
    }
    public void gas() {
        System.out.println("Add gas!");
    }


    @Override
    public String toString() {
        return "You have an incredible " + getClass().getSimpleName() + " " + name + " with professional driver: " + driver;
    }
}

class SportCar extends Car {

    private int speed;
    private int carryingCapacity;

    SportCar(String model, Driver driver, Engine engine, Wheel wheel, int speed, int carryingCapacity) {
        super(model, driver, engine, wheel);
        this.speed = speed;
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void gas() {
        System.out.println("Add NITRO!");
    }

}

class Lorry extends Car {

    private int speed;
    private int carryingCapacity;

    Lorry(String model, Driver driver, Engine engine, Wheel wheel, int speed, int carryingCapacity) {
        super(model, driver, engine, wheel);
        this.speed = speed;
        this.carryingCapacity = carryingCapacity;
    }

}

