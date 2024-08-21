package Inhertitance.Task2;

public class Person {
    String name;
    int age;

    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name:" + name + "\nAge:" + age);
    }

    public static void main(String[] args) {

        Employee employee = new Employee("dinesh", 18, 120000);
        Manager manager = new Manager("dinesh", 18, 120000, "EEE");
        Person person = new Person();
        manager.display();
        employee.display();
        person.display();
    }
}
