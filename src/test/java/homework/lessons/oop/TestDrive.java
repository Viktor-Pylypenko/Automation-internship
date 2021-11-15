package homework.lessons.oop;

import homework.helpers.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDrive extends ConsoleReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car car = null;

        while (true) {
            System.out.println("Please enter model of your car: ");
            String carModel = getConsoleString(br);

            System.out.println("Please enter colour of your car: ");
            String carColour = getConsoleString(br);

            System.out.println("Please enter driver's age: ");
            int driverAge;
            if ((driverAge = getConsoleInteger(br)) < 18) {
                System.out.println("Your driver too young. You are not going anywhere!");
                break;
            }

            System.out.println("Please enter driver's name: ");
            String driverName = getConsoleString(br);

            System.out.println("Please enter driver's gender: ");
            String driverGender = getConsoleString(br);

            System.out.println("Please enter driver's experience: ");
            int driverExperience = getConsoleInteger(br);

            System.out.println("Does the driver have a license? true/false");
            boolean haveLicense = getConsoleBoolean(br);
            if (!haveLicense) {
                System.out.println("Your driver has no license. You are not going anywhere!");
                break;
            }

            System.out.println("Please enter driver's license number: ");
            int driverLicenseNumber = getConsoleInteger(br);

            System.out.println("Please enter car type (Sport or Regular): ");
            String carType;
            int carPower;
            double carFuelCompulsion;
            SportEngine sportEngine = null;
            RegularEngine regularEngine = null;
            if ((carType = getConsoleString(br)).equals("Sport")) {
                System.out.println("Please enter car's power: ");
                carPower = getConsoleInteger(br);
                System.out.println("Please enter car's FuelCompulsion: ");
                carFuelCompulsion = getConsoleDouble(br);
                sportEngine = new SportEngine(carPower, carFuelCompulsion);
            } else {
                System.out.println("Please enter car's power: ");
                carPower = getConsoleInteger(br);
                System.out.println("Please enter car's FuelCompulsion: ");
                carFuelCompulsion = getConsoleDouble(br);
                regularEngine = new RegularEngine(carPower, carFuelCompulsion);
            }


            int speed;
            int carryingCapacity;
            if (carType.equals("Sport")) {

                System.out.println("Please enter maximum speed: ");
                speed = getConsoleInteger(br);
                System.out.println("Please enter carrying capacity: ");
                carryingCapacity = getConsoleInteger(br);

                car = new SportCar(
                        carModel,
                        carColour,
                        new Driver(driverAge, driverName, driverGender, driverExperience, haveLicense, driverLicenseNumber),
                        sportEngine,
                        new Wheel(),
                        speed,
                        carryingCapacity
                );
            } else {
                System.out.println("Please enter maximum speed: ");
                speed = getConsoleInteger(br);
                System.out.println("Please enter carrying capacity: ");
                carryingCapacity = getConsoleInteger(br);

                car = new Lorry(
                        carModel,
                        carColour,
                        new Driver(driverAge, driverName, driverGender, driverExperience, haveLicense, driverLicenseNumber),
                        regularEngine,
                        new Wheel(),
                        speed,
                        carryingCapacity
                );
            }

            System.out.println("Nice choice. " + car);
            break;
        }

        if (car != null) {
            String command;
            car.driver.putCarKey();
            car.driver.turnCarKey();

            while (true) {
                System.out.println("Choose command left, right, beep, gas: ");
                command = br.readLine();

                if (command.equals("left")) {
                    car.wheel.wheelLeft();
                } else if (command.equals("right")) {
                    car.wheel.wheelRight();
                } else if (command.equals("beep")) {
                    car.wheel.signal();
                } else if (command.equals("gas")) {
                    car.gas();
                } else if (command.equals("")) {
                    car.engine.stop();
                    break;
                }

            }
        }

    }
}
