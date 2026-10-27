package com.mycompany.runanimal;

import java.util.Scanner;

public class RunAnimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = sc.nextLine();

        Animal animal = null;

        if (choice.equalsIgnoreCase("B")) {
            animal = new Bird();
        } else if (choice.equalsIgnoreCase("C")) {
            animal = new Cat();
        } else if (choice.equalsIgnoreCase("D")) {
            animal = new Dog();
        }

        if (animal != null) {
            animal.eat();
            animal.sleep();
            animal.makeSound();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

package com.mycompany.runanimal;
abstract class Animal {

    abstract void eat();

    abstract void sleep();

    abstract void makeSound();
}

package com.mycompany.runanimal;
class Bird extends Animal {

    void eat() {
        System.out.println("Birds love to eat seeds and.");
    }

    void sleep() {
        System.out.println("sleep for 10-12 hours a day.");
    }

    void makeSound() {
        System.out.println("Tweet tweet");
    }
}

package com.mycompany.runanimal;

class Cat extends Animal {

    void eat() {
        System.out.println("Cat love to eat fish and.");
    }

    void sleep() {
        System.out.println("sleep for 12-14 hours a day.");
    }

    void makeSound() {
        System.out.println("Meow meow");
    }
}

package com.mycompany.runanimal;
class Dog extends Animal {

    void eat() {
        System.out.println("Dog love to eat meat and.");
    }

    void sleep() {
        System.out.println("sleep for 12-14 hours a day.");
    }
  
    void makeSound() {
        System.out.println("Woof woof");
    }
                
}


