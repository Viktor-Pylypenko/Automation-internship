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
        this.race = race;
        this.height = height;
    }

    public Human(String race, Integer height, List family) {
        this.race = race;
        this.height = height;
        this.family = family;
    }
}

class Man extends Human {
    String weight;

    Man() {
        super(null);
    }

    Man(String weight) {
        super(null);
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