package homework.lessons.methods.task4;

public class Dog extends Animal {

    public static void main(String[] args) {

        //Call hidden method
        Animal.voice();

        voice();
    }

    public static void voice() {
        System.out.println("Now it is a Dog");
    }
}
