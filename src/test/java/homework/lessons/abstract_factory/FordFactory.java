package homework.lessons.abstract_factory;

public class FordFactory implements CarFactory {

    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }

}
