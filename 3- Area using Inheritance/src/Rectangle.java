/*
Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the getArea()
method to calculate the area of a rectangle.
*/

public class Rectangle extends Shape{

    @Override
    public double getArea(double length, double width) {
        return length * width;
    }
}
