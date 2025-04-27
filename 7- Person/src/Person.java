/*
7. Write a Java program to create a class known as Person with methods called getFirstName()
and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId()
and overrides the getLastName() method to include the employee's job title.
*/


public class Person {
    protected String firstName;
    protected String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFirstName() {
        System.out.println(firstName);
    }
    public void getLastName() {
        System.out.println(lastName);
    }

}
