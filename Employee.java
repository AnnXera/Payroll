public class Employee {
    
    String name;
    double rate, hours, pay;

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    
    String getName() {
        return name;
    }
    
    double getRate() {
        return rate;
    }
    
    double getHours() {
        return hours;
    }
    
    public void calculatePay() {
        pay = rate*hours;
    }
    
    double getPay() {
        pay = rate*hours;
        return pay;
    }
    
}
