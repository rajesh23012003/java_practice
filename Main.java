import java.util.Scanner;

class Dog {
    // Variables
    String name;
    int age;
    String breed;

    // Constructor
    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Method to display dog information
    void displayInfo() {
        System.out.println("\n--- Dog Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
    }

    // Method with if-else
    void checkAge() {
        if (age < 2) {
            System.out.println(name + " is a puppy.");
        } else {
            System.out.println(name + " is an adult dog.");
        }
    }

    // Method for dog sound
    void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter dog name: ");
        String name = input.nextLine();

        System.out.print("Enter dog age: ");
        int age = input.nextInt();

        input.nextLine(); // Clear input buffer

        System.out.print("Enter dog breed: ");
        String breed = input.nextLine();

        // Creating Dog object
        Dog dog1 = new Dog(name, age, breed);

        // Calling methods
        dog1.displayInfo();
        dog1.checkAge();
        dog1.bark();

        input.close();
    }
}
