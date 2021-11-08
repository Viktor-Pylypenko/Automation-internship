package homework.lessons.methods.task2.smartphones;

public class SmartPhone extends Phone {

    @Override
    public Number testMethod(String stringArg) throws IllegalArgumentException {
        return Integer.parseInt(stringArg);
    }
}
