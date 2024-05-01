package DesignPatterns.Models;

public class QA extends Employee {
    public QA(int id, String name, int age, int serviceTime) {
        super(id, name, age, serviceTime);
    }

    @Override
    public double getSalary() {
        return this.getServiceTime() * this.getAge() * 0.5;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.QA;
    }
}
