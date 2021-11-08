package homework.lessons.methods.task1;

import org.testng.annotations.Test;

public class VarargOverload {

    String[] str = {"Petro", "Ivan", "Oleg"};

    @Test
    public void execute() {
        say(str);
    }

    public void say(String username) {
        System.out.println("Hi " + username);
    }

    public void say(String ...names) {
        for (String name : names) {
            System.out.println("Hi " + name);
        }
    }
}
