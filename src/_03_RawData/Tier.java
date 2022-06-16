package _03_RawData;

public class Tier {
    private double pressure;
    private int age;


    public Tier(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
