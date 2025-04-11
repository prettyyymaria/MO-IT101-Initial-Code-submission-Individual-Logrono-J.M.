import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void loadEmployees(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    Employee emp = new Employee(data[0], data[1], Double.parseDouble(data[2]));
                    employees.add(emp);
                }
            }
            System.out.println("Employee data loaded successfully.");
        } catch (Exception e) {
            System.out.println("Error loading employee data: " + e.getMessage());
        }
    }

    public void displayAllEmployees() {
        System.out.println("Employee List:");
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}
