package com.example.week5;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     * @param name the name of the staff member
     * @param address the address of the staff member
     * @param school the school the staff member is employed at
     * @param pay the pay of the staff member
     */

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Getter for the school.
     * @return the school
     */

    public String getSchool() {
        return school;
    }

    /**
     * Setter for the school.
     * @param school the school
     */

    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Getter for the pay.
     * @return the pay
     */

    public double getPay() {
        return pay;
    }

    /**
     * Setter for the pay.
     * @param pay the pay
     */

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Overrides the toString method.
     */

    @Override
    public String toString() {
        return "Staff[Person[name=" + getName() + ",address=" + getAddress()
        + "],school=" + school + ",pay=" + pay + "]";
    }

}
