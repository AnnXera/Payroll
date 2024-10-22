import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    
    private final List<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    public void calculatePayroll() {
        for (Employee employee : employees) {
            employee.calculatePay();
        }
    }
    
    public void printPayroll() {
        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Rate: " + employee.getRate());
            System.out.println("Hours: " + employee.getHours());
            System.out.println("Pay: " + employee.getPay() + "\n");
        }
    }
    
}
