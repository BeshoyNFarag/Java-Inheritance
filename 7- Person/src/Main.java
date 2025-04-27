/*
7. Write a Java program to create a class known as Person with methods called getFirstName()
and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId()
and overrides the getLastName() method to include the employee's job title.
*/

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Smith");
        Employee employee = new Employee("Jack", "Harry", "HR Manager");

        person.getFirstName();
        person.getLastName();
        System.out.println();
        employee.getFirstName();
        employee.getLastName();


    }
}