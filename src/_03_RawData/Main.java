package _03_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];

            int engineSpeed = Integer.parseInt(data[1]);
            int enginePower = Integer.parseInt(data[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tier> tiers = new ArrayList<>();

            for (int j = 5; j < data.length; j += 2) {
                double tirePressure = Double.parseDouble(data[j]);
                int tireAge = Integer.parseInt(data[j + 1]);
                Tier tier = new Tier(tirePressure, tireAge);
                tiers.add(tier);
            }
            Car car = new Car(model, engine, cargo, tiers);
            cars.add(car);
        }
        String cargoType = scanner.nextLine();
        if (cargoType.equals("fragile")) {
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("fragile"))
                    .filter(car -> car.getTiers().stream().anyMatch(tier -> tier.getPressure() < 1))
                    .forEach(car -> System.out.println(car.getModel()));

        } else {
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("flamable"))
                    .filter(car -> car.getEngine().getPower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}
