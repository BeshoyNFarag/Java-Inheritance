/*
9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle,
with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make,
model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled,
and maximum speed.
*/


public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Tesla", "Latest", 2021," Electric");
        Vehicle truck = new Truck("Mercedes", "Latest", 2024," Gasoline");
        Vehicle motorcycle = new MotorCycle("Yamaha", "Latest", 2025," Gasoline");


        car.distanceTraveled();
        car.fuelEffeciency();
        car.maxSpeed();
        System.out.println();
        truck.distanceTraveled();
        truck.fuelEffeciency();
        truck.maxSpeed();
        System.out.println();
        motorcycle.distanceTraveled();
        motorcycle.fuelEffeciency();
        motorcycle.maxSpeed();



    }
}