package homework.lessons.oop;

import homework.helpers.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class TestDrive extends ConsoleReader {

    public static Car car;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Please enter model of your car: ");
            String carModel = getConsoleString(br);

            System.out.println("Please enter driver's age: ");
            int driverAge;
            if ((driverAge = getConsoleInteger(br)) < 18) {
                System.out.println("Your driver too young. You are not going anywhere!");
                break;
            }

            System.out.println("Please enter driver's name: ");
            String driverName = getConsoleString(br);

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

                car = new SportCar(
                        carModel,
                        new SportDriver(driverAge, driverName, driverExperience, haveLicense, driverLicenseNumber),
                        sportEngine,
                        new SteeringWheel(),
                        Set.of(
                                new Wheel("Summer", "Top", "Left"),
                                new Wheel("Summer", "Top", "Right"),
                                new Wheel("Summer", "Bottom", "Left"),
                                new Wheel("Summer", "Bottom", "Right")
                        ),
                        speed
                );
            } else {
                System.out.println("Please enter carrying capacity: ");
                carryingCapacity = getConsoleInteger(br);

                car = new Lorry(
                        carModel,
                        new LorryDriver(driverAge, driverName, driverExperience, haveLicense, driverLicenseNumber),
                        regularEngine,
                        new SteeringWheel(),
                        Set.of(
                                new Wheel("Winter", "Top", "Left"),
                                new Wheel("Winter", "Top", "Right"),
                                new Wheel("Winter", "Bottom", "First Left"),
                                new Wheel("Winter", "Bottom", "Second Left"),
                                new Wheel("Winter", "Bottom", "First Right"),
                                new Wheel("Winter", "Bottom", "Second Right")
                        ),
                        carryingCapacity
                );
            }

            System.out.println("Nice choice. " + car);
            break;
        }

        if (car != null) {
            String command;
            System.out.println("Enter 'start' to start your car");
            while (!(command = br.readLine()).equals("start")) {
                System.out.println("Incorrect command " + command);
            }
            car.startCar();

            boolean loopIsAlive = true;

            while (loopIsAlive) {

                System.out.println("Choose command gas, left, right, signal to drive the car or '' to stop");
                command = br.readLine();

                switch (command) {
                    case "gas":
                        car.gas();
                        break;
                    case "right":
                        car.turnRight();
                        break;
                    case "left":
                        car.turnLeft();
                        break;
                    case "signal":
                        car.signal();
                        break;
                    case "":
                        car.stopCar();
                        loopIsAlive = false;
                        break;
                    default:
                        System.out.println("Unknown command");
                }
            }
        }
    }
}
