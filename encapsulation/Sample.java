package encapsulation;

/**
 * Human
 */
class Human {
    private int age = 21;
    private String name = "Dinesh";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Sample {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 10;
        // obj.name = "John";
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
