package homework.lessons.oop.task1;

public class Engine {

    private int power;
    private String company;

    void run() {
        System.out.println("Engine is started!");
    }

    void off() {
        System.out.println("Engine is stopped!");
    }

    @Override
    public String toString() {
        return Engine.class.getSimpleName();
    }
}
