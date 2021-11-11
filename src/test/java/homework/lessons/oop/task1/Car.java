package homework.lessons.oop.task1;

public class Car {
    private String carClass;
    private String marka;
    private final Engine engine;
    private final Driver driver;

    Car (Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public void start() {
        engine.run();
    }

    public void stop() {
        engine.off();
    }

    public void turnRight() {
        driver.wheelRight();
    }

    public void turnLeft() {
        driver.wheelLeft();
    }

    @Override
    public String toString() {
        return Car.class.getSimpleName();
    }
}

class SportCar extends Car {
    private double speed;

    SportCar() {
        super(new Engine(), new Driver());
    }

    @Override
    public String toString() {
        return SportCar.class.getSimpleName();
    }
}

class Lorry extends Car {
    private int carrying;

    Lorry() {
        super(new Engine(), new Driver());
    }

    @Override
    public String toString() {
        return Lorry.class.getSimpleName();
    }
}

