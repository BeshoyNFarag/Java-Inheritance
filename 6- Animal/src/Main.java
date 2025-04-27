/*
Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.
*/

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cheetah cheetah = new Cheetah();

        animal.move();
        System.out.println();
        cheetah.move();
    }
}