package homework.lessons.oop.task1;

public class Car {
    private String carClass;
    private String marka;
    private final Engine ENGINE = new Engine();
    private final Driver DRIVER = new Driver();

    public void start() {
        ENGINE.run();
    }

    public void stop() {
        ENGINE.off();
    }

    public void turnRight() {
        DRIVER.wheelRight();
    }

    public void turnLeft() {
        DRIVER.wheelLeft();
    }

    @Override
    public String toString() {
        return Car.class.getSimpleName();
    }
}

class SportCar extends Car {
    private double speed;

    @Override
    public String toString() {
        return SportCar.class.getSimpleName();
    }
}

class Lorry extends Car {
    private int carrying;

    @Override
    public String toString() {
        return Lorry.class.getSimpleName();
    }
}

