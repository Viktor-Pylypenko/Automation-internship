package homework.lessons.variables;

public class Initialization {

    //Инициализация полей в месте объявления
    static final int VARIABLE_ONE = 1;
    final int VARIABLE_TWO = 2;

    //Инициализация в статическом блоке
    static final int VARIABLE_THREE;
    static {
        VARIABLE_THREE = 3;
    }

    //Инициализация в нестатическом блоке
    final int VARIABLE_FOUR;
    {
        VARIABLE_FOUR = 4;
    }

    //Инициализация в конструкторе класса
    final int VARIABLE_FIVE;

    Initialization() {
        VARIABLE_FIVE = 5;
    }

}
