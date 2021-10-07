package manager;
public class Employer {

    private String name;
    private String email;
    private String password;
    private Employees employees;
    private STP stp;

    public Employer() {
        this.employees = new Employees();
        // this.stp = new STP();
    }

    public Employer(String name, String email, String password, Employees employees) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.employees = employees;
        // this.stp = new STP();
    }

    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Employees getEmployees() {
        return employees;
    }

    public STP getStp() {
        return stp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

   
}
