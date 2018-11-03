package io.carsmaker.bl.launchers;

import io.carsmaker.bl.CarBuilder;
import io.carsmaker.entities.Car;
import io.carsmaker.entities.Engine;
import io.carsmaker.entities.Wheel;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car fordFocus = CarBuilder.aCar()
                            .withName("FOCUS")
                            .withEngine(new Engine())
                            .withWheels(List.of(new Wheel()))
                            .build();
        System.out.println(fordFocus);

    }
}
