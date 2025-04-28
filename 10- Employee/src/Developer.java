/*
Write a Java program that creates a class hierarchy for employees of a company.
The base class should be Employee, with subclasses Manager, Developer, and Programmer.
Each subclass should have properties such as name, address, salary, and job title.
Implement methods for calculating bonuses, generating performance reports, and managing projects
*/


public class Developer extends Employee{

    public Developer(String name, String address, double salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }

    @Override
    public double bonus(){

        return 0.07 * salary;
    }

    @Override
    public void generateReport(){
        System.out.printf("Name: %s%nProfession: %s%nAddress: %s%nSalary: %.2f%nBonus: %.2f%n",name, jobTitle, address, salary, bonus());

    }


    @Override
    public  void managingProjects(){
        System.out.println("Creating software architect");
    }
}
