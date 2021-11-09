package homework.lessons.methods.task2;

import org.openqa.selenium.By;

public class PhoneOverload {
    protected Number testMethod(String stringArg) throws Exception {
        return Integer.parseInt(stringArg);
    }

    class Samsung extends PhoneOverload {
        //Другой модификатор доступа, тип возвращаемого значения и более узкое исключение
        @Override
        public Number testMethod(String stringArg) throws IllegalArgumentException {
            return Integer.valueOf(stringArg);
        }
    }

    class Nokia extends PhoneOverload {
        //Без использования аннотации Override, более узким исключением, другим типов возвращаемого значения
        protected Number testMethod(String stringArg) throws NumberFormatException {
            return Byte.parseByte(stringArg);
        }
    }

    class Iphone extends PhoneOverload {
        //Переопределенный метод возвращает результат вызова метода суперкласса
        @Override
        protected Number testMethod(String stringArg) throws Exception {
            return super.testMethod(stringArg);
        }
    }
}
