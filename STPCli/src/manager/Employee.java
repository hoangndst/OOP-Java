package manager;
public class Employee {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String TFN;
    private String type; 
    private int hours;
    private double payPerHour;
    private double income;
    private double rate;
    private double net;
    private double deduction;
    private double superannuation;
    private double superRate;
    private Employer employer;

    public Employee(String name, String email, String phone, String address, String TFN, String type, int hours, double payPerHour) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.type = type;
        this.hours = hours;
        this.payPerHour = payPerHour;
        this.TFN = TFN;
        this.superRate = 0.09;

        this.income = this.hours * this.payPerHour * 52;
        this.superannuation = this.income * this.superRate;
        if (this.income >= 180000) {
            this.rate = 0.45;
        } else if (120000 <= this.income && this.income < 180000) {
            this.rate = 0.37;
        } else if (45000 <= this.income && this.income < 120000) {
            this.rate = 0.32;
        } else if (15000 <= this.income && this.income < 45000) {
            this.rate = 0.19;
        }
        this.net = this.income - this.income * rate;
        this.deduction = this.income - this.net;
    }

    public double getTax() {
        return this.rate * this.income;
    }    

    public double getIncome() {
        return income;
    }

    public double getSuperannuation() {
        return superannuation;
    }

    public double getNet() {
        return this.net;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTFN(String TFN) {
        this.TFN = TFN;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public void update() {
        this.income = this.hours * this.payPerHour * 52;
        this.superannuation = this.income * this.superRate;
        if (this.income >= 180000) {
            this.rate = 45/100;
        } else if (120000 <= this.income && this.income < 180000) {
            this.rate = 37/100;
        } else if (45000 <= this.income && this.income < 120000) {
            this.rate = 32/100;
        } else if (15000 <= this.income && this.income < 45000) {
            this.rate = 19/100;
        }
        this.net = this.income - this.income * rate;
        this.deduction = this.income - this.net;
    }

    public void setName(String name) {
        this.name = name;
    }

}
