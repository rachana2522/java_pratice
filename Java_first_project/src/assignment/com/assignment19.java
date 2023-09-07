//Write a Java program to create a base class Animal with methods eat() and sound(). Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats. In addition, override the sound() method to make a specific sound for each animal.

package assignment.com;
class Animal {
    void eat() {
        System.out.println("The animal is eating");
    }

    void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("The lion eats meat");
    }

    @Override
    void sound() {
        System.out.println("The lion roars");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("The tiger eats meat and occasionally hunts in water");
    }

    @Override
    void sound() {
        System.out.println("The tiger growls");
    }
}

class Panther extends Animal {
    @Override
    void eat() {
        System.out.println("The panther is a carnivore");
    }

    @Override
    void sound() {
        System.out.println("The panther purrs softly");
    }
}
public class assignment19 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        System.out.println("Generic Animal:");
        animal.eat();
        animal.sound();

        System.out.println("\nLion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}


