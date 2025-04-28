/*
9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle,
with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make,
model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled,
and maximum speed.
*/


public class MotorCycle extends Vehicle {


    public MotorCycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }


    @Override
    public void distanceTraveled(){
        System.out.println(205 + "KM");

    }

    @Override
    public void maxSpeed(){
        System.out.println(140);
    }


    @Override
    public void fuelEffeciency(){
        System.out.println("this needs more information to calculate");
    }
}
