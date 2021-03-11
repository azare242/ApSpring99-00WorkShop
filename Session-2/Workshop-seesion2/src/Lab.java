/**
 * The Lab class represents a Lab in a Lab administration system.
 * it holds the Lab details relevant in our context.
 *
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.March.8
 */
public class Lab {

    // the Lab Students
    private Student[] students;

    // the lab Students' grade Average
    private int avg;

    // the Lab Day
    private String day;

    // the capacity of Lab
    private int capacity;

    // the students are in Lab
    private int currentSize;

    /**
     * I Use This Methode because in java An Array at first must be initialized by a size
     * and we need initialized elements one-by-one by not-null
     */
    private void initializeStudentCapacity(){
        students = new Student[capacity];
        for (Student student :students) student = new Student("","","");
    }

    /**
     * Create a new Lab with a given day and capacity number.
     *
     * @param cap capacity of the lab
     * @param d Lab day
     */
    public Lab(int cap,String d){
        capacity = cap;
        day = d;
        avg = 0;
        currentSize = 0;
        initializeStudentCapacity();
    }
    /**
     * Enrol Student to the Lab with a given Student Object
     * @param std Student Object
     */
    public void enrollStudent(Student std){
        if (currentSize < capacity) {
            students[currentSize] = new Student(std.getFirstName(),std.getLastName(),std.getId());
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * set capacity of Lab
     * @param capacity capacity of Lab
     */
    public void setCapacity(int capacity){
        if (capacity <= 0 ) System.out.println("Invalid Input for capacity");
        else this.capacity = capacity;
    }

    /**
     * Boolean Function for check input String for setDay
     * @param input input day
     * @return true/false
     */
    public static Boolean checkInputForDay(String input){
        String[] daysOfWeek = new String[]{"saturday","sunday","monday","tuesday","thursday","wednesday","friday"};
        for (String day : daysOfWeek) {
            if (day.equalsIgnoreCase(input)) return true;
        }
        return false;
    }
    /**
     * Set Lab Day
     * @param d Lab Day
     */
    public void setDay(String d){
        if(checkInputForDay(d)) day = d;
        else System.out.println("Invalid Input for day");
    }

    /**
     * set students for the labs
     * @param students array of students object
     */
    public void setStudents(Student[] students) {
        for (int i = 0 ; i < students.length ; ++i){
            enrollStudent(students[i]);
        }
    }

    /**
     * Set student grade by given number of student
     * @param studentNumber student number in Lab
     * @param inputGrade Input Grade
     */
    public void setInLabStudentGrade(int studentNumber,int inputGrade){
        students[studentNumber - 1].setGrade(inputGrade);
    }
    /**
     * Calculate Average of Students' Grade
     */
    public void calculateAvg() {
        int sum = 0;
        for (Student student : students) sum += student.getGrade();
        avg = sum / currentSize;
    }

    /**
     * get students Object Array
     * @return students array
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * get average of Lab
     * @return avg
     */
    public int getAvg(){
        calculateAvg();
        return avg;
    }

    /**
     * get Lab day
     * @return day
     */
    public String getDay(){
        return day;
    }

    /**
     * get capacity of Lab
     * @return capacity
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     * Print Details of Lab
     */
    public void print() {
        //we can also use for (Student student : students)
        for (int i = 0 ; i < students.length ; ++i){ // Debug : students.size() are unavailable
            System.out.println("std fname: " + students[i].getFirstName()
                                + " lname: " + students[i].getLastName()
                                +" std id:" + students[i].getId()
                                +" std grade:"+students[i].getGrade());
        }
        calculateAvg();
        System.out.println("Lab AVG:" + avg);
    }

}
