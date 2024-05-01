package DesignPatterns;

import DesignPatterns.Models.*;

public class EmployeeFactory {

    public static Employee makeEmployee(int id, String name, int age, int serviceTime, EmployeeType employeeType) {
        return employeeType == EmployeeType.DEVELOPER ?
                new Developer(id, name, age, serviceTime)
                    :
                employeeType == EmployeeType.QA ?
                        new QA(id, name, age, serviceTime)
                            :
                        new HR(id, name, age, serviceTime);
    }
}

