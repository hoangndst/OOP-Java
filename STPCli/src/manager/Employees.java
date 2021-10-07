package manager;
import java.util.ArrayList;
import java.util.Formatter;
public class Employees {

    private ArrayList<Employee> employees;

    public Employees() {
        employees = new ArrayList<>();
    }
    
    public Employees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    public void viewEmployees() {
        System.out.println("+----------------------+---------------------------+------------+------------+");
        System.out.format(Utils.employeeFormat, "Employee Name", "Email", " Phone", "Type");
        System.out.println("+----------------------+---------------------------+------------+------------+");
        for (Employee employee : employees) {
            System.out.format(Utils.employeeFormat, employee.getName(), employee.getEmail()
                                                  , employee.getPhone(), employee.getType());
        }
        System.out.println("+----------------------+---------------------------+------------+------------+");
    }
    
    public void add(Employee employee) {
        employees.add(employee);
    }

    public void addEmployee() {
        String name = Utils.string("Name");
        String email = Utils.string("Email");
        String phone = Utils.string("Phone");
        String address = Utils.string("Address");
        String TFN = Utils.string("TFN");
        String type = Utils.string("Type");
        int hours = Utils.number("Paid Hours");
        double rate = Utils.amount("Hourly Rate");
        employees.add(new Employee(name, email, phone, address, TFN, type, hours, rate));
        System.out.println(name + " record has been created.");
    }


    public void updateEmployee() {
        String name = Utils.string("Name");
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().equals(name.toLowerCase())) {
                System.out.println("Updating " + employee.getName() + " record: ");
                String newName = Utils.string("Name");
                String email = Utils.string("Email");
                String phone = Utils.string("Phone");
                String address = Utils.string("Address");
                String TFN = Utils.string("TFN");
                String type = Utils.string("Type");
                int hours = Utils.number("Paid Hours");
                double payPerHour = Utils.amount("Hourly Rate");
                employee.setName(newName);
                employee.setEmail(email);
                employee.setPhone(phone);
                employee.setAddress(address);
                employee.setTFN(TFN);
                employee.setType(type);
                employee.setHours(hours);
                employee.setPayPerHour(payPerHour);
                employee.update();
                System.out.println(employee.getName() + " record has been updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void viewEmployee() {
        String name = Utils.string("Name");
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().equals(name.toLowerCase())) {
                System.out.println("+----------------------+---------------------------+------------+------------+");
                System.out.format(Utils.employeeFormat, "Employee Name", "Email", "Phone", "Type");
                System.out.println("+----------------------+---------------------------+------------+------------+");
                System.out.format(Utils.employeeFormat, employee.getName(), employee.getEmail()
                                                      , employee.getPhone(), employee.getType());
                System.out.println("+----------------------+---------------------------+------------+------------+");
                                                      
                return;
            }
        }
        System.out.println(name + " record does not exist!");
    }

    public void deleteEmployee() {
        String name = Utils.string("Name");
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().equals(name.toLowerCase())) {
                employees.remove(employee);
                System.out.println(name + " record has been deleted.");
                return;
            }
        }
        System.out.println(name + " record does not exist!");
    }

}
