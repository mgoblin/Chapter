package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    public double speed;

    public SportCar(String marka, String carClass, Engine engine, Driver driver, int weight) {
        super(marka, carClass, engine, driver, weight);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
