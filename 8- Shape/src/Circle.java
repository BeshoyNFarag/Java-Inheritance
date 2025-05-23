/*
8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate
the area and perimeter of a circle.
*/



public class Circle extends Shape{

    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(  Math.PI * Math.pow(radius, 2) );

    }

    @Override
    public void getPerimeter(){
        System.out.println( 2 * Math.PI * radius );
    }


}
