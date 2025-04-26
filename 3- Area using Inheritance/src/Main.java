/*
Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the getArea()
method to calculate the area of a rectangle.
*/

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape rectangle = new Rectangle();
        System.out.println(shape.getArea(1.2,3.2));
        System.out.println(rectangle.getArea(1.2,3.2));
    }
}