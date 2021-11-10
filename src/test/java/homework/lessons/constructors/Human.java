package homework.lessons.constructors;

import java.awt.*;

public class Human {
    String race;
    Integer height;
    List family;

    public Human(String race) {
        this.race = race;
    }

    public Human(String race, Integer height) {
        this(race);
        this.height = height;
    }

    public Human(String race, Integer height, List family) {
        this(race, height);
        this.family = family;
    }
}

class Man extends Human {
    String weight;

    Man() {
        super("Test");
    }

    Man(String weight) {
        super("Test");
        this.weight = weight;
    }

}

class Ignat extends Man {
    String age;

    Ignat() {

    }

    Ignat(String age) {
        this.age = age;
    }

}