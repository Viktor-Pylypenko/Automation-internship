package homework.lessons.oop.task1;

public class Driver extends Person {

    private int experience;

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
