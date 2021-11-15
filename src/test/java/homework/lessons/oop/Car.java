package homework.lessons.oop;

import java.util.Set;

public class Car {
    private String name;
    private Driver driver;
    private Engine engine;
    private SteeringWheel steeringWheel;
    private Set<Wheel> wheelSet;

    public Car(String name, Driver driver, Engine engine, SteeringWheel steeringWheel, Set<Wheel> wheelSet) {
        this.name = name;
        this.driver = driver;
        this.engine = engine;
        this.steeringWheel = steeringWheel;
        this.wheelSet = wheelSet;
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
        steeringWheel.wheelRight();
    }
    public void turnLeft() {
        steeringWheel.wheelLeft();
    }
    public void signal() {
        steeringWheel.signal();
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

    SportCar(String model, Driver driver, Engine engine, SteeringWheel steeringWheel, Set<Wheel> wheelSet,int speed) {
        super(model, driver, engine, steeringWheel, wheelSet);
        this.speed = speed;
    }

    @Override
    public void gas() {
        System.out.println("Add NITRO!");
    }

}

class Lorry extends Car {

    private int carryingCapacity;

    Lorry(String model, Driver driver, Engine engine, SteeringWheel steeringWheel, Set<Wheel> wheelSet, int carryingCapacity) {
        super(model, driver, engine, steeringWheel, wheelSet);
        this.carryingCapacity = carryingCapacity;
    }

}

