package homework.lessons.constructors;

import java.awt.*;

public class Phone {
    String model;
    Integer year;
    List list;

    public Phone() {

    }

    public Phone(String model) {
        this.model = model;
    }

    public Phone(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    public Phone(String model, Integer year, List list) {
        this.model = model;
        this.year = year;
        this.list = list;
    }
}
