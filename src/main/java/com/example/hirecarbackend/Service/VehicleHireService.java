package com.example.hirecarbackend.Service;

import com.example.hirecarbackend.Model.Vehicles.EstateCar;
import com.example.hirecarbackend.Model.Vehicles.SmallCar;
import com.example.hirecarbackend.Model.Vehicles.Van;
import com.example.hirecarbackend.Model.Vehicles.Vehicle;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class VehicleHireService {


    public final List<Vehicle> vehicles = Arrays.asList(
            new Van("WRF4SEF", "Ford", "Transit", "Diesel"),
            new EstateCar("VW55FOE", "VW", "Polo", "Petrol"),
            new SmallCar("NA57WRY", "Toyota", "RAV4", "Petrol"),
            new EstateCar("OP34EEF", "VW", "Polo", "Petrol"),
            new SmallCar("AM43SOE", "Toyota", "RAV4", "Petrol"),
            new EstateCar("NA43AOE", "VW", "Polo", "Petrol"),
            new SmallCar("VD62EQZ", "Toyota", "RAV4", "Petrol"),
            new Van("LL55YUK", "Toyota", "VANNN", "Diesel")

    );

    public List<Vehicle> getAllVehicles() {
        vehicles.get(0).setHired(true);
        vehicles.get(0).setCustomerName("Robbie");
        vehicles.get(1).setHired(true);
        vehicles.get(1).setCustomerName("Jim");
        return vehicles;
    }

    public Vehicle getVehicle(String reg) {
        return vehicles.stream().filter(vehicle -> vehicle.getRegistration().equals(reg)).findFirst().orElse(null);
    }

    public List<Vehicle> AvailableVehicles() {
        return vehicles.stream().filter(vehicle -> !vehicle.getHired()).collect(Collectors.toList());
    }

    public long calculateCost(String startDate, String endDate, String Reg) {
        Vehicle tempVeh = vehicles.stream().filter(vehicle -> vehicle.getRegistration().equals(Reg)).findFirst().orElse(null);
        assert tempVeh != null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        long costPerDay = tempVeh.getPrice();
        long daysBetween = DAYS.between(LocalDate.parse(startDate, formatter), LocalDate.parse(endDate, formatter));

        return (daysBetween + 1) * costPerDay;
    }

    public Vehicle hireVehicle(String Reg, String CustName) {
        Vehicle tempVeh = vehicles.stream().filter(vehicle -> vehicle.getRegistration().equals(Reg)).findFirst().orElse(null);
        tempVeh.setHired(true);
        tempVeh.setCustomerName(CustName);
        return tempVeh;
    }
}
