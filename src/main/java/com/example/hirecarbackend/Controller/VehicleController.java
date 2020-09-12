package com.example.hirecarbackend.Controller;

import com.example.hirecarbackend.Model.Vehicles.Vehicle;
import com.example.hirecarbackend.Service.VehicleHireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleHireService vehicleHireService;

    @RequestMapping("/vehicles")
    public List<Vehicle> getAllVehicles() {
        return vehicleHireService.getAllVehicles();
    }

    @RequestMapping("/vehicles/available")
    public List<Vehicle> getAvailableVehicles() {
        return vehicleHireService.AvailableVehicles();
    }

    @RequestMapping("/vehicle/{reg}")
    public Vehicle returnOneVehicle(@PathVariable String reg) {
        return vehicleHireService.getVehicle(reg);
    }

    @RequestMapping("/vehicle/hire/{reg}/{CstName}")
    public Vehicle hireVehicle(@PathVariable String reg, @PathVariable String CstName) {
        return vehicleHireService.hireVehicle(reg, CstName);
    }

    @RequestMapping("vehicle/calculateCost/{reg}/{StartDate}/{EndDate}")
    public long calculateHireCost(@PathVariable String reg, @PathVariable String StartDate, @PathVariable String EndDate) {
        return vehicleHireService.calculateCost(StartDate, EndDate, reg);
    }

}
