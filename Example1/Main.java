package Example1;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            // Sample usage
            EmployeeUtility utility = new EmployeeUtility(); // Create an instance of EmployeeUtility

            // Create sample employee list
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "John Doe", 4.5f));
            employees.add(new Employee(2, "Jane Smith", 4.2f));
            employees.add(new Employee(3, "Alice Johnson", 4.8f));

            // Serialize and save employee list to a file
            utility.addEmployee("employees.dat", employees);

            // Deserialize and view employee by ID
            Employee foundEmployee = utility.viewEmployeeById("employees.dat", 2);
            if (foundEmployee != null) {
                System.out.println("Employee found: " + foundEmployee.getName()); // Output the name of the found employee
            } else {
                System.out.println("Employee not found."); // Output if employee not found
            }
        }
    }

