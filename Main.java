class Dog {
    String name;
    int age;
    String breed;

    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void displayInfo() {
        System.out.println("Dog Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }

    void checkAge() {
        if (age < 2) {
            System.out.println(name + " is a puppy.");
        } else {
            System.out.println(name + " is an adult dog.");
        }
    }

    void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {

        // Jenkins ke liye direct values
        Dog dog1 = new Dog("Tommy", 3, "Labrador");

        dog1.displayInfo();
        dog1.checkAge();
        dog1.bark();
    }
}
