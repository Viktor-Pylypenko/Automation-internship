package homework.lessons.oop;

public class Person {

    private int age;
    private String fullName;

    Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    void putCarKey() {
        System.out.println("Key in ignition!");
    }

    void turnCarKey() {
        System.out.println("Key in turned!");
    }

    void pullOutKey() {
        System.out.println("Key is pulled out!");
    }

    @Override
    public String toString() {
        return fullName;
    }
}

class Driver extends Person {

    private int experienceYear;
    private boolean license;
    private int licenseNumber;

    Driver(int age, String fullName, int experienceYear, boolean license, int licenseNumber) {
        super(age, fullName);
        this.experienceYear = experienceYear;
        this.license = license;
        this.licenseNumber = licenseNumber;
    }

}
