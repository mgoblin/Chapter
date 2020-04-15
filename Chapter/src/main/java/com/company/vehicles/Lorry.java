package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    public int carrying;

    public Lorry(String marka, String carClass, Engine engine, Driver driver, int weight) {
        super(marka, carClass, engine, driver, weight);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
