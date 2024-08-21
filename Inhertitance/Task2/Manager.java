package Inhertitance.Task2;

public class Manager extends Employee {
    String department;
    String name;
    int age;
    double salary;
    Employee employee;

    Manager() {
        // this.age = employee.age;
        // this.name = employee.name;
        // this.salary = employee.salary;
        // this.department = "";
    }

    Manager(String name, int age, double salary, String department) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    void display() {

    }

}
