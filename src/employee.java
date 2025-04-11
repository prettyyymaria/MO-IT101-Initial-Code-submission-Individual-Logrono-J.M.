public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.printf("ID: %s | Name: %s | Salary: %.2f%n", id, name, salary);
    }
}