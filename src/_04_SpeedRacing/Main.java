package _04_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carsCount = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();


        for (int i = 0; i < carsCount; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            double fuelAmount = Double.parseDouble(carInfo[1]);
            double fuelCostFor1Km = Double.parseDouble(carInfo[2]);

            Car car = new Car(model, fuelAmount, fuelCostFor1Km);
            cars.put(model, car);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputParts = input.split("\\s+");
            String model = inputParts[1];
            int distance = Integer.parseInt(inputParts[2]);

            Car currentCar = cars.get(model);
            if (!currentCar.hasEnoughFuel(distance)) {
                System.out.println("Insufficient fuel for the drive");
            } else {
                currentCar.drive(distance);
            }
            input = scanner.nextLine();
        }
        cars.values().forEach(System.out::println);

    }
}
