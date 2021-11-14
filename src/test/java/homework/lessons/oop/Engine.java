package homework.lessons.oop;

public class Engine {

    private int power;
    private String company;

    Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

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
