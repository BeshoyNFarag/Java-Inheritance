/*
Write a Java program to create a class called Animal with a method called makeSound().
Create a subclass called Dog that overrides the makeSound() method to bark.
*/

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal animal = new Animal();
        dog.makeSound();
        animal.makeSound();


    }
}