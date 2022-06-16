package _03_RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tier> tiers;

    public Car(String model, Engine engine, Cargo cargo, List<Tier> tiers) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tiers = new ArrayList<>();
        this.tiers.addAll(tiers);
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tier> getTiers() {
        return tiers;
    }
}
