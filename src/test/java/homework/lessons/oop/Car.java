package homework.lessons.oop;

public class Car {
    private String name;
    private String colour;
    Person driver;
    Engine engine;
    Wheel wheel;

    Car(String name, String colour, Person driver, Engine engine, Wheel wheel) {
        this.name = name;
        this.colour = colour;
        this.driver = driver;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void gas() {
        System.out.println("The " + name + " goes faster");
    }

    @Override
    public String toString() {
        return "You have an incredible " + getClass().getSimpleName() + " " + name + " with professional driver: " + driver;
    }
}

class SportCar extends Car {

    private int speed;
    private int carryingCapacity;

    SportCar(String model, String colour, Driver driver, Engine engine, Wheel wheel, int speed, int carryingCapacity) {
        super(model, colour, driver, engine, wheel);
        this.speed = speed;
        this.carryingCapacity = carryingCapacity;

    }

}

class Lorry extends Car {

    private int speed;
    private int carryingCapacity;

    Lorry(String model, String colour, Driver driver, Engine engine, Wheel wheel, int speed, int carryingCapacity) {
        super(model, colour, driver, engine, wheel);
        this.speed = speed;
        this.carryingCapacity = carryingCapacity;
    }


}

