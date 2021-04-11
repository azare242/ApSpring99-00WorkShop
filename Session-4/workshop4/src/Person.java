/**
 * A Class That Contains A Person Details
 * @author Alireza ZareZeynabadi
 * @version 1.0
 * @since 2021.april.8
 */
public class Person {

    private final String firstName;
    private final String lastName;

    /**
     * Constructor
     * @param firstName First Name of Person
     * @param lastName Last Name of Person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Get First Name Of Person
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get Last Name Of Person
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * To String Method
     * @return Full Name
     */
    @Override
    public String toString() {
        return this.firstName + ' ' + this.lastName;
    }
}
