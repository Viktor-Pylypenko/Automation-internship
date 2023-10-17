package homework.lessons.patterns.abstract_factory;

public class ToyotaFactory implements CarFactory {

    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }

}
