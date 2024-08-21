package Inhertitance.Task2;

public class Employee extends Person {
    double salary;
    int age;
    String name;

    Employee() {
        this.name = "";
        this.age = 0;
        this.salary = 0;
    }

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public void display() {
        System.out.println(name + " " + age + " " + " " + salary);

    }

    public void work() {

    }

}
