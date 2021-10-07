package manager;
public class Report {

    private String name;
    private double wages;
    private double tax;
    private double net;
    private double superannuation;

    public Report(Employee employee) {
        this.name = employee.getName();
        this.net = employee.getNet();
        this.superannuation = employee.getSuperannuation();
        this.wages = employee.getIncome();
        this.tax = employee.getTax();
    }

    public void printReport() {
        System.out.println("PAYG Report ");
        System.out.println("+-----------------+-------------+-------------+-------------+-------------+");
        System.out.format("| %-15s | %-11s | %-11s | %-11s | %-11s |%n", "Employee Name", "Wages", "TAX", "Net", "Super");
        System.out.println("+-----------------+-------------+-------------+-------------+-------------+");
        System.out.format(Utils.stpFormat, this.name, this.wages, this.tax, this.net, this.superannuation);
        System.out.println("+-----------------+-------------+-------------+-------------+-------------+");
    }

    

    public String getName() {
        return name;
    }

    public double getWages() {
        return wages;
    }

    public double getTax() {
        return tax;
    }

    public double getNet() {
        return net;
    }

    public double getSuperannuation() {
        return superannuation;
    }
    
}
