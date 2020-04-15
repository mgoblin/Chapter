package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public String marka;
    public String carClass;
    public Engine engine;
    public Driver driver;
    public int weight;

    public Car(String marka, String carClass, Engine engine, Driver driver, int weight) {
        this.marka = marka;
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали");
    }
    public void stop() {
        System.out.println("Останавливаемся");
    }
    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println(marka +' '+ carClass +' '+ engine +' '+ driver +' '+ weight);
    }

}
