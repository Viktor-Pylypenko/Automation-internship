package homework.lessons.oop;

public class Driver {

    private int age;
    private String fullName;
    private int experienceYear;
    private boolean license;
    private int licenseNumber;

    Driver(int age, String fullName, int experienceYear, boolean license, int licenseNumber) {
        this.age = age;
        this.fullName = fullName;
        this.experienceYear = experienceYear;
        this.license = license;
        this.licenseNumber = licenseNumber;
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

class SportDriver extends Driver {

    SportDriver(int age, String fullName, int experienceYear, boolean license, int licenseNumber) {
        super(age, fullName, experienceYear, license, licenseNumber);
    }

}

class LorryDriver extends Driver {

    LorryDriver(int age, String fullName, int experienceYear, boolean license, int licenseNumber) {
        super(age, fullName, experienceYear, license, licenseNumber);
    }
}
