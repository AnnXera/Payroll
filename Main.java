public class Main {

    public static void main(String[] args) {
        
        PayrollSystem payrolls = new PayrollSystem();
        
        Employee emp1 = new Employee("Hulyo", 10, 70);
        Employee emp2 = new Employee("Maria", 10, 20);
        
        payrolls.addEmployee(emp1);
        payrolls.addEmployee(emp2);
        
        payrolls.calculatePayroll();
        payrolls.printPayroll();
    }
    
}
