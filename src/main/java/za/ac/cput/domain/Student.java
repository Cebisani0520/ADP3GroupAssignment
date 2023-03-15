/** Student.java
 *  This is a POJO class
 *  Andrea Jacobs 218024266
 *  15 March 2023
 */
package za.ac.cput.domain;

public class Student {
    private String firstName;
    private String lastName;

    public Student() {}

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
