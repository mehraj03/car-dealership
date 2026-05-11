package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> matches = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                matches.add(v);
            }
        }
        return matches;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> matches = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
                matches.add(v);
            }
        }
        return matches;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> matches = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getYear() >= min && v.getYear() <= max) {
                matches.add(v);
            }
        }
        return matches;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> matches = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getColor().equalsIgnoreCase(color)) {
                matches.add(v);
            }
        }
        return matches;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> matches = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getOdometer() >= min && v.getOdometer() <= max) {
                matches.add(v);
            }
        }
        return matches;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> matches = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getVehicleType().equalsIgnoreCase(vehicleType)) {
                matches.add(v);
            }
        }
        return matches;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.inventory.remove(vehicle);
    }
}
