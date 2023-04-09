package homework.lessons.reflection;

import org.testng.annotations.Test;

import java.lang.reflect.Field;

public class TestMethod {
//    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        Book book = new Book(32529, "HarryPotter", 786, "J. K. Rowling");
//
//        Class<? extends Book> bookClass = book.getClass();
//
//        Field privateField = bookClass.getDeclaredField("serialNumber");
//        privateField.setAccessible(true);
//        int privateSerialNumber = privateField.getInt(book);
//
//        System.out.println(privateSerialNumber);
//    }

    @Test
    public void v1() {
        System.out.println("1");

    }

    @Test(enabled = false)
    public void v2() {
        System.out.println("2");
    }
}
