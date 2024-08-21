// Scenario: Zoo Management System
// Objective:
// Create a program that manages different types of animals in a zoo, showcasing their unique behaviors and characteristics through the use of interfaces, inheritance, constructors, and polymorphism.

// Steps:
// Define the Interface:

// Create an interface Animal that includes methods for makeSound, move, and eat.
// Create a Base Class:

// Implement a base class Mammal that provides some common properties and methods for mammals and implements the Animal interface.
// Extend the Base Class:

// Create derived classes Lion and Elephant that extend the Mammal class and provide specific implementations of the makeSound, move, and eat methods.
// Create Another Base Class:

// Implement another base class Bird that implements the Animal interface and provides common behaviors for birds.
// Extend the Bird Class:

// Create derived classes Eagle and Parrot that extend the Bird class and provide specific implementations of the makeSound, move, and eat methods.
// Polymorphism:

// Use polymorphism to manage different types of animals in a zoo using an array or a list.
package ZooManagement;

import java.util.Scanner;

public class ZooManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of animals in the zoo: ");
        int k = sc.nextInt();
        String zoo[] = new String[k];
        int i = 0, part = 0, liion = 0, elephant = 0, eag = 0;
        System.out.println("Enter the number of animal you want to add to the zoo: \n");

        while (i < k) {
            System.out.println("1.Mammals \n 2.Birds");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the type of mammal you want to add to the zoo: ");
                    System.out.println("1.Lion \n 2.Elephant");
                    int m = sc.nextInt();
                    switch (m) {
                        case 1:
                            Lion lion = new Lion();
                            liion++;
                            if (i < k) {
                                zoo[i] = "Lion";
                                i++;

                            }
                            lion.makeSound();
                            lion.move();
                            lion.eat();
                            break;
                        case 2:
                            Elephant ele = new Elephant();
                            elephant++;
                            if (i < k) {
                                zoo[i] = "Elephant";
                                i++;
                            }
                            ele.makeSound();
                            ele.move();
                            ele.eat();
                            break;
                        default:
                            System.out.println("invalid");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter the type of Birds add in the zoo");
                    System.out.println("1.Eagle \n 2.Parrot");
                    int b = sc.nextInt();
                    switch (b) {
                        case 1:
                            Eagle eagle = new Eagle();
                            eag++;
                            if (i < k) {
                                zoo[i] = "Eagle";
                                i++;

                            }
                            eagle.makeSound();
                            eagle.move();
                            eagle.eat();
                            break;
                        case 2:
                            Parrot par = new Parrot();
                            part++;
                            if (i < k) {
                                zoo[i] = "Parrot";
                                i++;
                                System.out.println(i);
                            }
                            par.makeSound();
                            par.move();
                            par.eat();
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                default:
                    System.out.println("invalid");
                    break;
            }

        }
        System.out.print("[");
        for (i = 0; i < k; i++) {
            System.out.print(" " + zoo[i] + " ");
        }
        System.out.print("]");
        System.out.println("\nLion:" + liion + "\nElephant:" + elephant + "\nParrot:" + part + "\n" + "Eagle:" + eag);

    }
}

/**
 * Animal
 */
interface Animal {
    public void makeSound();

    public void move();

    public void eat();
}

class mammals implements Animal {

    public void eat() {
        System.out.println("Animals eat");
    }

    public void makeSound() {
        System.out.println("Animals makeSound");
    }

    public void move() {
        System.out.println("Animals move");
    }

}

class Elephant extends mammals {
    public void eat() {
        System.out.println("Elephant eat");
    }

    public void makeSound() {
        System.out.println("Elephant makeSound");
    }

    public void move() {
        System.out.println("Elephant move");
    }
}

class Lion extends mammals {

    public void eat() {
        System.out.println("Lion eat");
    }

    public void makeSound() {
        System.out.println("Lion makeSound");
    }

    public void move() {
        System.out.println("Lion move");
    }
}

class birds implements Animal {
    public void eat() {
        System.out.println("Birds eat");
    }

    public void makeSound() {
        System.out.println("Birds makeSound");
    }

    public void move() {
        System.out.println("Birds move");
    }

}

class Eagle extends birds {
    public void eat() {
        System.out.println("Eagle eat");
    }

    public void makeSound() {
        System.out.println("Eagle makeSound");
    }

    public void move() {
        System.out.println("Eagle move");
    }

}

class Parrot extends birds {
    public void eat() {
        System.out.println("Parrot eat");
    }

    public void makeSound() {
        System.out.println("Parrot makeSound");
    }

    public void move() {
        System.out.println("Parrot move");
    }

}
