package manager;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
public class Session {
    private Employers employers;
    
    public Session() {
        this.employers = new Employers();
    }

    public void addEmployee(Employees employees) {
        employees.addEmployee();
    }

    public void viewEmployees(Employees employees) {
        employees.viewEmployees();
    }

    public void updateEmployee(Employees employees) {
        employees.updateEmployee();
    }
    
    public void viewEmployee(Employees employees) {
        employees.viewEmployee();
    }

    public void deleteEmployee(Employees employees) {
        employees.deleteEmployee();
    }

    public boolean Login(Employers employers) {
        while (true) {
            char command = Utils.choice("Command (L/X)");
            if (command == 'L') {
                String username = Utils.string("Email");
                String password = Utils.string("Password");
                for (Employer employer : employers.getEmployers()) {
                    if (employer.getEmail().equals(username) && employer.getPassword().equals(password)) {
                        this.employers.addEmployer(employer);
                        System.out.println("Employer Menu: ");
                        System.out.println("C- Add Employee");
                        System.out.println("R- View Employee");
                        System.out.println("U- Update Employee");
                        System.out.println("D- Delete Employee");
                        System.out.println("V- View Employees");
                        System.out.println("S- STP Menu");
                        System.out.println("X- Logout");
                        return true;
                    }
                }
                System.out.println("Incorrect employer details!");
            } else if (command == 'X') {
                System.out.println("\nSession Terminated!");
                return false;
            } else {
                System.out.println("STP Payroll Management System:");
                System.out.println("L- Login");
                System.out.println("X- Exit");
            }
        }
    }

    public void stpMenu() {
        System.out.println("STP Menu: ");
        System.out.println("F- Find PAYG Report");
        System.out.println("V- View STP Report");
        System.out.println("A- Archive STP Report");
        System.out.println("R- Retrieve STP Report");
        System.out.println("S- Show STP Log");
        System.out.println("X- Close");
    }

    public void findPAYGReport(Employees employees) {
        String name = Utils.string("Name");
        for (Employee e : employees.getEmployees()) {
            if (e.getName().toLowerCase().equals(name.toLowerCase())) {
                Report report = new Report(e);
                report.printReport();
                return;
            }
        }
        System.out.println("PAYG does not exist for " + name + "!");
    }

    public void start(Employers employers) throws ParseException {
        while (true) {
            ArrayList<Employer> tmp = this.employers.getEmployers();
            Employees employees = tmp.get(tmp.size() - 1).getEmployees();
            char command = Utils.choice("Session Admin: " + tmp.get(tmp.size() - 1).getName() + " - Menu Commands (C/R/U/D/V/S/X)");
            if (command == 'C') {
                addEmployee(employees);
            } else if (command == 'R') {
                viewEmployee(employees);
            } else if (command == 'U') {
                updateEmployee(employees);
            } else if (command == 'D') {
                deleteEmployee(employees);
            } else if (command == 'V') {
                viewEmployees(employees);
            } else if (command == 'S') {
                stpMenu();
                STPLog stpLog = new STPLog();
                while (true) {
                    command = Utils.choice("Session Admin: " + tmp.get(tmp.size() - 1).getName() + " - Menu Commands (F/V/A/R/S/X)");
                    if (command == 'F') {
                        findPAYGReport(employees);
                    } else if (command == 'V') {
                        Date date = new Date();
                        STP stp = new STP(tmp.get(tmp.size() - 1), employees, date);
                        stp.viewSTPReport();
                    } else if (command == 'A') {
                        Date date = new Date();
                        STP stp = new STP(tmp.get(tmp.size() - 1), employees, date);
                        stpLog.archiveSTPReport(stp);
                    } else if (command == 'R') {
                        String sDate = Utils.string("Date");
                        stpLog.retrieveSTPReport(sDate);
                    } else if (command == 'S') {
                        stpLog.showSTPRecord();
                    } else if (command == 'X') {
                        System.out.println("\nEmployer Menu: ");
                        break;
                    } 
                }
            } else if (command == 'X') {
                System.out.println("");
                System.out.println("STP Payroll Management System:");
                if (Login(employers)) {
                    continue;
                }
                break;
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Thomas Muller", "thomas.muller@uts.com", "99991111", "3 Byern St. Sydney 2001", "888-888", "Full-Time", 40, 35));
        employeeList.add(new Employee("Alice Stefan", "alice.stefan@uts.com", "88881111", "24 Pitt St. Sydney 2001", "777-123", "Part-Time", 20, 29));
        employeeList.add(new Employee("Lucy Lu", "lucy.lu@uts.com", "98981100", "11 Hunter St. Sydney 2100", "111-154", "Casual", 20, 45));
        employeeList.add(new Employee("Andreas Brehme", "andreas.b@uts.com", "90001222", "91 Sussex St. Sydney 2100", "172-288", "Full-Time", 40, 33));
        employeeList.add(new Employee("Ruddy Voller", "ruddy.v@uts.com", "98980000", "15 Stan St. Sydney 2100", "155-154", "Full-Time", 40, 80));
        employeeList.add(new Employee("Monica Shwarz", "monica.s@uts.com", "92241188", "155 Jones St. Sydney 2001", "110-994", "Casual", 8, 20));
        Employees employees = new Employees(employeeList);

        ArrayList<Employer> employerList = new ArrayList<>();
        employerList.add(new Employer("John Smith", "john.smith@uts.com", "super123", employees));
        employerList.add(new Employer("Jane Doe", "jane.doe@uts.com", "user222", employees));
        Employers employers = new Employers(employerList);
        
        Session session = new Session();
        System.out.println("STP Payroll Management System:");
        System.out.println("L- Login");
        System.out.println("X- Exit");
        if (session.Login(employers)) {
            session.start(employers);
        }
        
    }
}
