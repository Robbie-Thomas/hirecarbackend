package com.example.hirecarbackend.Model.Vehicles;

public class EstateCar extends Vehicle {
    public EstateCar(String registration, String make, String model, String fuelType) {
        super(registration, make, model, fuelType);
    }

    @Override
    public int getPrice() {
        return 35;
    }

    @Override
    public String getVehicleType() {
        return "Estate Car";
    }
}
