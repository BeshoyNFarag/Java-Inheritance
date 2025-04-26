/*
 Write a Java program to create a class called Vehicle with a method called drive().
 Create a subclass called Car that overrides the drive() method to print "Repairing a car".
*/


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();

        vehicle.drive();
        car.drive();


    }
}