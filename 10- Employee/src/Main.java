/*
Write a Java program that creates a class hierarchy for employees of a company.
The base class should be Employee, with subclasses Manager, Developer, and Programmer.
Each subclass should have properties such as name, address, salary, and job title.
Implement methods for calculating bonuses, generating performance reports, and managing projects
*/


public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Paul", "4 john wicked street", 2500.75, "Manager");
        Employee developer = new Developer("John","100 charming avenue", 2250, "Developer");
        Employee programmer = new Programmer("Smith", "87 Can Street", 2000, "Programmer");


        manager.generateReport();
        manager.managingProjects();
        manager.bonus();
        System.out.println();
        developer.generateReport();
        developer.managingProjects();
        developer.bonus();
        System.out.println();
        programmer.generateReport();
        programmer.managingProjects();
        programmer.bonus();


    }
}