interface Display {
    void showDetails();
}
abstract class Employee {
    String name;
    int id;
    double salary;
    abstract void calculateSalary();
}
class Manager extends Employee implements Display {
    Manager() {
        name = "Madhumita";
        id = 201;
        salary = 50000;
    }
    void calculateSalary() {
        salary = salary + 10000;   
    }
    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Total Salary: " + salary);
    }
}
class MultipleInheritanceDemo{ 
    public static void main(String args[]) {
        Manager m = new Manager();
        m.calculateSalary();
        m.showDetails();
    }
}