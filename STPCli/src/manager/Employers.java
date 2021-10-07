package manager;
import java.util.ArrayList;

public class Employers {

    private ArrayList<Employer> employers;
    
    public Employers() {
        employers = new ArrayList<>();
    }

    public Employers(ArrayList<Employer> employers) {
        this.employers = employers;
    }
    
    public void addEmployer(Employer employer) {
        employers.add(employer);
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public boolean Login() {
        System.out.println("STP Payroll Management System:");
        System.out.println("L- Login");
        System.out.println("X- Exit");
        while (true) {
            char command = Utils.choice("Command (L/X)");
            if (command == 'L') {
                String username = Utils.string("Username");
                String password = Utils.string("Password");
                for (Employer employer : employers) {
                    if (employer.getEmail().equals(username) && employer.getPassword().equals(password)) {
                        System.out.println("STP Payroll Management System:");
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
                return false;
            } else if (command == 'X') {
                System.out.println("Session Terminated!");
                return false;
            }
        }
    }
    
}
