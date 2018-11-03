package io.carsmaker.entities;

import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheels;
    private String name;

    public Car(Engine engine, List<Wheel> wheels, String name) {
        this.engine = engine;
        this.wheels = wheels;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }
}

