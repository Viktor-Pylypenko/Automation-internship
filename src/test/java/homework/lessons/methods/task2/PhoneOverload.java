package homework.lessons.methods.task2;

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
        protected Byte testMethod(String stringArg) throws NumberFormatException {
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

    class Huawei extends PhoneOverload {
        //Переопределенный метод не пробрасывает исключение
        @Override
        public Integer testMethod(String stringArg) {
            return Integer.parseInt(stringArg);
        }
    }

    static class Xiaomi extends PhoneOverload {
        //Переопределенный метод возвращает исключение
        @Override
        public Integer testMethod(String stringArg) {
            throw new RuntimeException();
        }
    }
}
