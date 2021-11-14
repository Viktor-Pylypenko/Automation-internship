package homework.lessons.oop;

public class Driver extends Person {

    private int experience;

    Driver(int experience) {
        super(42, "Vin Diesel");
        this.experience = experience;
    }

    void wheelRight() {
        System.out.println("the steering wheel is turned to the right");
    }

    void wheelLeft() {
        System.out.println("the steering wheel is turned to the left");
    }

    @Override
    public String toString() {
        return Driver.class.getSimpleName();
    }
}
