package Example1;

import java.io.*;
import java.util.ArrayList;

public class EmployeeUtility {
    public boolean addEmployee(String fileName, ArrayList<Employee> employeeList) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(employeeList);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Employee viewEmployeeById(String fileName, int employeeId) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            ArrayList<Employee> employeeList = (ArrayList<Employee>) inputStream.readObject(); // Reading the ArrayList from the file
            for (Employee employee : employeeList) {
                if (employee.getEmployeeId() == employeeId) {
                    return employee;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}