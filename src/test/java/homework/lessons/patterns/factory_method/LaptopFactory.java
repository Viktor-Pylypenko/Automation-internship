package homework.lessons.patterns.factory_method;

public class LaptopFactory {

    public Laptop createLaptop(String laptopType) {
        switch (laptopType) {
            case "MacBook":
                return new MacBookLaptop();
            case "Asus":
                return new AsusLaptop();
            default:
                throw new IllegalArgumentException();
        }
    }
}
