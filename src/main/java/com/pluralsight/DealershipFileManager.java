package com.pluralsight;

import java.io.*;

public class DealershipFileManager {
    private String fileName = "src/main/resources/inventory.csv";

    public Dealership getDealership() {
        Dealership dealership = null;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            // First line is the dealership info
            String firstLine = br.readLine();
            String[] dealershipInfo = firstLine.split("\\|");
            String name = dealershipInfo[0];
            String address = dealershipInfo[1];
            String phone = dealershipInfo[2];

            dealership = new Dealership(name, address, phone);

            // Every other line is a vehicle
            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts[3];
                String vehicleType = parts[4];
                String color = parts[5];
                int odometer = Integer.parseInt(parts[6]);
                double price = Double.parseDouble(parts[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);

                line = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return dealership;
    }

    public void saveDealership(Dealership dealership) {
        // empty for now — fill in Phase 5
    }
}