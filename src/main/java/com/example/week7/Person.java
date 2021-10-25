package com.example.week7;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Constructor.
     * @param name name of person
     * @param address address of person
     */

    public Person(String name, String address) {
        this.vehicleList = new ArrayList<>();
        this.name = name;
        this.address = address;
    }

    /**
     * Add vehicle to person.
     */

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    /**
     * Remove vehicle from person.
     * @param registrationNumber registration number of vehicle
     */

    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicle);
                break;
            }
        }
    }

    /**
     * Get Vehicle information from person.
     * @return all vehicle information from person
     */

    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return this.name + " has no vehicle!";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.name + " has:\n\n");
        for (Vehicle vehicle : vehicleList) {
            sb.append(vehicle.getInfo() + "\n");
        }
        return sb.toString();
    }

    /**
     * Get name of person.
     * @return name of person
     */

    public String getName() {
        return name;
    }

    /**
     * Get address of person.
     * @return address of person
     */

    public String getAddress() {
        return address;
    }

    /**
     * Set name of person.
     * @param name name of person
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set address of person.
     * @param address address of person
     */

    public void setAddress(String address) {
        this.address = address;
    }

}

