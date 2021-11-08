package homework.lessons.methods.task3;

public class Counter {

    public static int instanceCount = 0;

    Counter() {
        System.out.println("Objects created: " + ++instanceCount);
    }
}
