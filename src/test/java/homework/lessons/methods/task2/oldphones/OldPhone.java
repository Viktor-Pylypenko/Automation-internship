package homework.lessons.methods.task2.oldphones;

import homework.lessons.methods.task2.smartphones.Phone;

public class OldPhone extends Phone {
    @Override
    protected Number testMethod(String stringArg) throws NumberFormatException {
        return Integer.parseInt(stringArg);
    }
}
