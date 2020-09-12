package com.example.hirecarbackend.Model.Vehicles;

import com.example.hirecarbackend.Model.Customer.Customer;

import java.time.LocalDate;


public class Vehicle {

    private String registration;
    private String make;
    private String model;
    private String customerName;
    private String fuelType;
    private Boolean hired = false;
    private int price;
    private LocalDate hireEndDate;

    public Vehicle(String registration, String make, String model, String fuelType) {
        this.registration = registration;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        hired = false;
    }

    public Vehicle() {
    }

    public void hireVehicle(String cstName, LocalDate startDate, LocalDate endDate) {
        hired = true;
        customerName = cstName;
        hireEndDate = endDate;
        Customer customer = new Customer();
        customer.setCustomerName(cstName);
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Boolean getHired() {
        return hired;
    }

    public void setHired(Boolean hired) {
        this.hired = hired;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getHireEndDate() {
        return hireEndDate;
    }

    public void setHireEndDate(LocalDate hireEndDate) {
        this.hireEndDate = hireEndDate;
    }
}
