package LLD3.Assignments.UserStudentEmployeeProblem;

public class Employee extends User {

    // TODO: Implement an Employee class which is also a subclass of User with the following additional properties:
    //employeeId: representing the unique identifier of the employee.
    //department: representing the department in which the employee works.
    int employeeId;
    String department;

    public Employee(String username, String email, int employeeId, String department) {
        super(username, email);
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Department: " + this.department);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("john_smith", "john.smith@example.com", 201, "Human Resources");
        System.out.println("Username: " + employee.getUsername());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Department: " + employee.getDepartment());
        employee.displayInfo();
    }
}
