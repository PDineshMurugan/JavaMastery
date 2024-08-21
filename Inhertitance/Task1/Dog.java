package Inhertitance.Task1;

public class Dog extends Animals {
    String name = "";

    // constructor
    Dog() {
        this.name = "";
    }

    Dog(String name) {
        super(name);
        this.name = name;
    }

    // method
    public void bark() {
        System.out.println(name + "is Barking");
    }
}
