package Thigk;


import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<IEmployee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }


    public void showAllEmployees() {
        for (IEmployee employee : employees) {
            employee.ShowInfo();
            System.out.println();
        }
    }

    public void updateEmployee(int index, IEmployee newEmployee) {
        if (index >= 0 && index < employees.size()) {
            employees.set(index, newEmployee);
        } else {
            System.out.println("Index out of range.");
        }
    }

    public void deleteEmployee(int index) {
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
        } else {
            System.out.println("Index out of range.");
        }
    }
}