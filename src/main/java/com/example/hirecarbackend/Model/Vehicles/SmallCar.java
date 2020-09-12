package com.example.hirecarbackend.Model.Vehicles;

public class SmallCar extends Vehicle {
    public SmallCar(String registration, String make, String model, String fuelType) {
        super(registration, make, model, fuelType);
    }

    @Override
    public int getPrice() {
        return 25;
    }
}
