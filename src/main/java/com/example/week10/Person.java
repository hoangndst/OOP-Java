package com.example.week10;

public class Person implements Comparable<Person> {
    
    private String name;
    private int age;
    private String address;

    /**
     * Constructor for objects of class Person.
     * @param name The name of the person.
     * @param age The age of the person.
     * @param address The address of the person.
     */

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Constructor 2 for objects of class Person.
     */

    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    /**
     * Get the name of the person.
     * @return The name of the person.
     */

    public String getName() {
        return name;
    }

    /**
     * Set the name of the person.
     * @param name The name of the person.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the age of the person.
     * @return The age of the person.
     */

    public int getAge() {
        return age;
    }

    /**
     * Set the age of the person.
     * @param age The age of the person.
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the address of the person.
     * @return The address of the person.
     */

    public String getAddress() {
        return address;
    }

    /**
     * Set the address of the person.
     * @param address The address of the person.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Override compareTo method.
     */

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0) {
            return this.age - o.age;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}