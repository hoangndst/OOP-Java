package com.example.week6;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor.
     * @param name the name of the student
     * @param address the address of the student
     * @param program the program of the student
     * @param year the year of the student
     * @param fee the fee of the student
     */

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Getter for program.
     * @return the program of the student
     */

    public String getProgram() {
        return program;
    }

    /**
     * Setter for program.
     * @param program the program of the student
     */

    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Getter for year.
     * @return the year of the student
     */

    public int getYear() {
        return year;
    }

    /**
     * Setter for year.
     * @param year the year of the student
     */

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter for fee.
     * @return the fee of the student
     */

    public double getFee() {
        return fee;
    }

    /**
     * Setter for fee.
     * @param fee the fee of the student
     */

    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Override toString method.
     */

    @Override
    public String toString() {
        return "Student[Person[name=" + getName() + ",address=" + getAddress() 
        + "],program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }

    public void printType() {
        System.out.println("This is a student");
    }

    public static void main(String[] args) {
        // up-casting, biến person của lớp Person (lớp cha) tham chiếu tới đối tượng của lớp Student (lớp con)
        // Person person = new Student(20, "An", "18020000");
        // person.printType(); // This is a student
    }

}
