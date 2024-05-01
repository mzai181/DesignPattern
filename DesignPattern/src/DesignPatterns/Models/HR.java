package DesignPatterns.Models;

public class HR extends Employee {
    public HR(int id, String name, int age, int serviceTime) {
        super(id, name, age, serviceTime);
    }

    @Override
    public double getSalary() {
        return this.getServiceTime() * this.getAge() * 0.6;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.HR;
    }
}
