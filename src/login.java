import java.util.Scanner;

public class Login {
    private final String USERNAME = "admin";
    private final String PASSWORD = "password";

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUser = scanner.nextLine();
        System.out.print("Password: ");
        String inputPass = scanner.nextLine();

        if (inputUser.equals(USERNAME) && inputPass.equals(PASSWORD)) {
            System.out.println("Login successful!");
            EmployeeManager manager = new EmployeeManager();
            manager.loadEmployees("data/employees.csv");
            manager.displayAllEmployees();
        } else {
            System.out.println("Invalid credentials. Access denied.");
        }
        scanner.close();
    }
}
