/**
 * The Student class represents a student in a student administration system.
 * it holds the student details relevant in our context.
 *
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.March.8
 */
public class Student {

    // the student’s first name
    private String firstName;

    // the student’s last name
    private String lastName;

    // the student ID
    private String id;

    // the grade
    private int grade;

    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lName last name of student
     * @param sID student ID
     */
    public Student(String fName , String lName , String sID) {
        firstName = fName;
        lastName = lName;
        id = sID;
        grade = 0;
    }

    /**
     * set first name of student
     * @param inputFName firstname of student
     */

    public void setFirstName(String inputFName) {
        firstName = inputFName;
    }

    /**
     * set last name of student
     * @param inputLName lastname of student
     */
    public void setLastName(String inputLName) {
        lastName = inputLName;
    }

    /**
     * set ID of student
     * @param inputID ID of student
     */

    public void setId(String inputID) {
        id = inputID;
    }

    /**
     * set grade of student
     * @param inputGrade grade of student
     */
    public void setGrade(int inputGrade){
         grade = inputGrade;
    }

    /**
     * get the firstname of student
     * @return firstName field
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * get the lastname of student
     * @return lastName field
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * get the id of student
     * @return id field
     */
    public String getId(){
        return id;
    }

    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade(){
        return grade;
    }

    /**
     * Print the Student's Last name and ID number to the output terminal.
     */
    public void print(){
        System.out.println(firstName + " " + lastName + ", student ID: "
                + id + ",grade: " + grade);
    }
}
