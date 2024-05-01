package DesignPatterns;

import DesignPatterns.Models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerSingleton {

    private static EmployeeManagerSingleton instance;

    public static EmployeeManagerSingleton getInstance()
    {
        if (instance == null)
            instance = new EmployeeManagerSingleton();
        return instance;
    }

    private List<Employee> employees = new ArrayList<Employee>();

    private EmployeeManagerSingleton() {

    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employees.remove(emp);
    }

    public Employee getEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}
