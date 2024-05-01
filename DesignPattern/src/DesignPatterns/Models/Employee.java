package DesignPatterns.Models;

public abstract class Employee
{
    private int id;
    private String name;
    private int age;
    private int serviceTime;

    public Employee(int id, String name, int age, int serviceTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.serviceTime = serviceTime;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public abstract double getSalary();

    public abstract EmployeeType getType();
}
