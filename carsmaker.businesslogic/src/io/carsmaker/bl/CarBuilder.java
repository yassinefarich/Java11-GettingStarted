package io.carsmaker.bl;

import io.carsmaker.entities.Car;
import io.carsmaker.entities.Engine;
import io.carsmaker.entities.Wheel;

import java.util.List;

public class CarBuilder {

    private Engine engine;
    private List<Wheel> wheels;
    private String name;

    private CarBuilder() {
    }

    public static CarBuilder aCar() {
        return new CarBuilder();
    }

    public CarBuilder withEngine(Engine carEngine) {
        this.engine = carEngine;
        return this;
    }

    public CarBuilder withWheels(List<Wheel> carWheels) {
        this.wheels = List.copyOf(carWheels);
        return this;
    }

    public CarBuilder withName(String carName) {
        this.name = carName;
        return this;
    }

    public Car build() {
        return new Car(engine, wheels, name);
    }
}



