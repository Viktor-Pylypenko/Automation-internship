package homework.lessons.inner_classes;

public class OuterClass {

    public void saySmthOuter() {
        System.out.println("smth outer");
    }

    static class InnerClass {

        public static void saySmthInner() {
            System.out.println("smth inner");
        }

    }
}
