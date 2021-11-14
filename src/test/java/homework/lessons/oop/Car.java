package homework.lessons.oop;

public class Car {
    private String carClass;
    private String marka;

    Car(String carClass, String marka) {
        this.carClass = carClass;
        this.marka = marka;
    }

    private Engine engine = new Engine(247, "Mercedes");
    private Driver driver = new Driver(30);

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

    SportCar(double speed) {
        super("S", "BMW");
        this.speed = speed;
    }

    @Override
    public String toString() {
        return SportCar.class.getSimpleName();
    }
}

class Lorry extends Car {

    private int carrying;
    Lorry(int carrying) {
        super("RST", "Isuzu");
    }

    @Override
    public String toString() {
        return Lorry.class.getSimpleName();
    }
}

