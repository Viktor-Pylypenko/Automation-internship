package homework.lessons.oop.task1;

public class Person {

    private int age;
    private String fullName;

    @Override
    public String toString() {
        return Person.class.getSimpleName();
    }
}
