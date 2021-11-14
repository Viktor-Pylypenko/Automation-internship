package homework.lessons.oop;

public class Person {

    private int age;
    private String fullName;

    Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return Person.class.getSimpleName();
    }
}
