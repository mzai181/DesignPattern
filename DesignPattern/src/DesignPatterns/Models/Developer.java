package DesignPatterns.Models;

public class Developer extends Employee {
    public Developer(int id, String name, int age, int serviceTime) {
        super(id, name, age, serviceTime);
    }

    @Override
    public double getSalary() {
        return this.getServiceTime() * this.getAge() * 0.9;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.DEVELOPER;
    }
}
