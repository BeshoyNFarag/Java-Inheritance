/*
8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate
the area and perimeter of a circle.
*/


import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle(5);
        shape.getArea();
        shape.getPerimeter();
        System.out.println();
        circle.getArea();
        circle.getPerimeter();




    }
}