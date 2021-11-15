package homework.lessons.oop;

public class Person {

    private int age;
    private String fullName;
    private String gender;

    Person(int age, String fullName, String gender) {
        this.age = age;
        this.fullName = fullName;
        this.gender = gender;
    }

    void putCarKey() {
        System.out.println("Key in ignition!");
    }

    void turnCarKey() {
        System.out.println("Key in turned!");
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

    Driver(int age, String fullName, String gender, int experienceYear, boolean license, int licenseNumber) {
        super(age, fullName, gender);
        this.experienceYear = experienceYear;
        this.license = license;
        this.licenseNumber = licenseNumber;
    }

}
