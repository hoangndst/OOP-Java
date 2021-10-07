package manager;
import java.util.ArrayList;
import java.util.Date;

public class STP {
    private double totalWages;
    private double totalTax;
    private double totalNet;
    private double totalSuper;
    private double bas;
    private Date date;
    private Employees employees;
    private ArrayList<Report> reports;
    private STPLog stpLog;
    private Employer employer;
    
    public STP(Employer employer, Employees employees, Date date) {
        this.employer = employer;
        this.employees = employees;
        this.date = date;
        this.reports = new ArrayList<Report>();
        for (Employee employee : employees.getEmployees()) {
            this.reports.add(new Report(employee));
        }
        for (Report report : this.reports) {
            this.totalWages += report.getWages();
            this.totalTax += report.getTax();
            this.totalNet += report.getNet();
            this.totalSuper += report.getSuperannuation();
        }
        this.bas = this.totalTax + this.totalSuper;
        this.stpLog = new STPLog();
    }

    public void viewSTPReport() {
        System.out.println("STP Report");
        System.out.println("+-----------------+-------------+-------------+-------------+-------------+");
        System.out.format("| %-15s | %-11s | %-11s | %-11s | %-11s |%n", "Employee Name", "Wages", "TAX", "Net", "Super");
        System.out.println("+-----------------+-------------+-------------+-------------+-------------+");
        for (Report report : this.reports) {
            System.out.format(Utils.stpFormat, report.getName(), report.getWages(), report.getTax(), report.getNet(), report.getSuperannuation());
        }
        System.out.println("+-----------------+-------------+-------------+-------------+-------------+");
        System.out.println("");
        System.out.println("+-----------------+-------------+");
        System.out.format("| %-15s | %s%-10.2f |%n", "Total Wages", " ", + this.totalWages);
        System.out.format("| %-15s | %s%-10.2f |%n", "Total Tax", " ", + this.totalTax);
        System.out.format("| %-15s | %s%-10.2f |%n", "Total Net", " ", + this.totalNet);
        System.out.format("| %-15s | %s%-10.2f |%n", "Total Super", " ", + this.totalSuper);
        System.out.format("| %-15s | %s%-10.2f |%n", "Quarterly Bas", " ", + this.bas);
        System.out.println("+-----------------+-------------+");
    }

    public Date getDate() {
        return date;
    }
}

