/*
Write a Java program that creates a class hierarchy for employees of a company.
The base class should be Employee, with subclasses Manager, Developer, and Programmer.
Each subclass should have properties such as name, address, salary, and job title.
Implement methods for calculating bonuses, generating performance reports, and managing projects
*/



abstract public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }



    public abstract double bonus();
    public abstract void generateReport();
    public abstract void managingProjects();

}
