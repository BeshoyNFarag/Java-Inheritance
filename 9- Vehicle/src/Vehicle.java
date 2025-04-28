/*
9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle,
with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make,
model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled,
and maximum speed.
*/


public class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void distanceTraveled(){
        throw new UnsupportedOperationException("Not supported yet.");

    }
    public void maxSpeed(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void fuelEffeciency(){
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
