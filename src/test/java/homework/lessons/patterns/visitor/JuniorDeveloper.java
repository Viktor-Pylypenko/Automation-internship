package homework.lessons.patterns.visitor;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Write incorrect class ...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database ...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Write bad test ...");
    }
}
