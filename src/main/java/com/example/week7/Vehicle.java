package com.example.week7;

abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructor for objects of class Vehicle.
     * @param brand The brand of the vehicle.
     * @param model The model of the vehicle.
     * @param registrationNumber The registration number of the vehicle.
     * @param owner The owner of the vehicle.
     */

    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Abstract method for get information about the vehicle.
     * @return The information about the vehicle.
     */

    abstract String getInfo();

    /**
     * Transfer the vehicle to another owner.
     * @param newOwner The new owner of the vehicle.
     */

    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * Get the brand of the vehicle.
     * @return The brand of the vehicle.
     */
    
    public String getBrand() {
        return brand;
    }

    /**
     * Set the brand of the vehicle.
     * @param brand The brand of the vehicle.
     */

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get the model of the vehicle.
     * @return The model of the vehicle.
     */

    public String getModel() {
        return model;
    }

    /**
     * Set the model of the vehicle.
     * @param model The model of the vehicle.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get the registration number of the vehicle.
     * @return The registration number of the vehicle.
     */

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Set the registration number of the vehicle.
     * @param registrationNumber The registration number of the vehicle.
     */

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Get the owner of the vehicle.
     * @return The owner of the vehicle.
     */

    public Person getOwner() {
        return owner;
    }   

    /**
     * Set the owner of the vehicle.
     * @param owner The owner of the vehicle.
     */

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
