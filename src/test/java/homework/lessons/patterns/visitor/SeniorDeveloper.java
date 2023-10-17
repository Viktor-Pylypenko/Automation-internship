package homework.lessons.patterns.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewrite class after junior ...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fix database ...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Fix test after junior ...");
    }
}
