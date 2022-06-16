package _04_SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double consumption;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distanceTraveled = 0;
    }

    public boolean hasEnoughFuel(int distance) {
        double fuelNeeded = distance * consumption;
        return fuelAmount >= fuelNeeded;
    }

    public void drive(int distance) {
        double fuelNeeded = distance * consumption;
        fuelAmount -= fuelNeeded;
        distanceTraveled += distance;
    }

    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount,this.distanceTraveled);
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getConsumption() {
        return consumption;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}
