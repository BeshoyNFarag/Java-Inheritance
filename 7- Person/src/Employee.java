/*
7. Write a Java program to create a class known as Person with methods called getFirstName()
and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId()
and overrides the getLastName() method to include the employee's job title.
*/

public class Employee extends Person {

    private String title;
    public Employee(String firstName, String lastName, String title){
        super(firstName, lastName);
        this.title = title;
    }


    @Override
    public void getFirstName(){
        System.out.println(title + " " + firstName);

    }


    @Override
    public void getLastName(){
        System.out.println(title + " " + lastName);

    }
}
