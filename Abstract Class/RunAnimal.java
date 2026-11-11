import java.util.Scanner;

public class RunAnimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("B")) {
            Animal bird = new Bird();
            bird.eat();
            bird.sleep();
            bird.makeSound();
        } else if (choice.equalsIgnoreCase("C")) {
            Animal cat = new Cat();
            cat.eat();
            cat.sleep();
            cat.makeSound();
        } else if (choice.equalsIgnoreCase("D")) {
            Animal dog = new Dog();
            dog.eat();
            dog.sleep();
            dog.makeSound();
        } else {
            System.out.println("Invalid choice");
        }
    }
}

abstract class Animal {

    abstract void eat();

    abstract void sleep();

    abstract void makeSound();
}

class Bird extends Animal {

     @Override
     void eat() {
        System.out.println("Birds love to eat seeds and.");
    }

     @Override
     void sleep() {
        System.out.println("sleep for 10-12 hours a day.");
    }

     @Override
    void makeSound() {
        System.out.println("Tweet tweet");
    }
}

class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("Cats love to eat fish and. ");
    }

    @Override
    void sleep() {
        System.out.println("sleep for 12-16 hours a day. ");

    }

    @Override
    void makeSound() {
        System.out.println("Meow meow");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dogs love to eat meat and. ");
    }

    @Override
    void sleep() {
        System.out.println("sleep for 12-14 hours a day.");
    }

    @Override
    void makeSound() {
        System.out.println("Woof woof");
    }
}
