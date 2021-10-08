package com.example.week5;

public class Person {
    private String name;
    private String address;

    /**
     * Constructor 1.
     */

    public Person() {
        this.name = "";
        this.address = "";
    }

    /**
     * Constructor 2.
     * @param name the name of the person
     * @param address the address of the person
     */

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Get the name of the person.
     * @return the name of the person
     */

    public String getName() {
        return name;
    }

    /**
     * Get the address of the person.
     * @return the address of the person
     */

    public String getAddress() {
        return address;
    }

    /**
     * Set the address of the person.
     * @param address the address of the person
     */

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
