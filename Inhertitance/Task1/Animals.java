package Inhertitance.Task1;

public class Animals {
    String name = "";

    // constructor
    Animals() {
        this.name = "";
    }

    Animals(String name) {
        this.name = name;
    }

    // method
    public void eat() {
        System.out.println(name + "isEating");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.bark();

    }
}
