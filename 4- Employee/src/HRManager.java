/*
Write a Java program to create a class called Employee with methods called work() and getSalary().
Create a subclass called HRManager that overrides the work() method and adds a new method called
addEmployee().
*/

public class HRManager extends Employee {

    @Override
    public void work(){
        System.out.println("HR is working");
    }

    public void addEmployee(String name){
        System.out.println("Employee " + name + " added");
    }
}
