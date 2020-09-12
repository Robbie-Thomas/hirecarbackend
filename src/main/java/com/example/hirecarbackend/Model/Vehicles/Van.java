package com.example.hirecarbackend.Model.Vehicles;

public class Van extends Vehicle {
    public Van(String registration, String make, String model, String fuelType) {
        super(registration, make, model, fuelType);
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
