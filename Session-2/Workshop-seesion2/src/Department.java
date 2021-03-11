/**
 * The Department class represents a Department in a Department administration system.
 * it holds the Department details relevant in our context.
 *
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.March.10
 */
public class Department {
    //the Department name
    private String name;

    //the Department labs
    private Lab[] labs;

    //the Department Labs capacity
    private int capacity;

    //the Department labs enrolled
    private int currentLabsSize;

    //the Department average
    private int avg;


    /**
     * Initialize Labs Array
     */
    private void initializeLabsArray(){
        for (Lab lab : labs) lab = new Lab(0,"");
    }
    /**
     * Create a new student with a given name and ID number.
     *
     * @param name name of Department
     * @param cap capacity of Department
     */
    public Department(String name,int cap){
        this.name = name;
        capacity = cap;
        avg = 0;
        currentLabsSize = 0;
        labs = new Lab[capacity];
        initializeLabsArray();

    }

    /**
     * set labs capacity of Department
     * @param capacity Labs capacity of Department
     */
    public void setCapacity(int capacity){
        if (capacity <= 0 ) System.out.println("Invalid Input for capacity");
        else this.capacity = capacity;
    }

    /**
     * Enrol Labs in Department
     * @param lab Lab
     */
    public void enrollLab(Lab lab){
        if (currentLabsSize <= capacity) {
            labs[currentLabsSize] = lab;
            currentLabsSize++;
        }
    }

    /**
     * Set Labs In Department
     * @param labs Labs
     */
    public void setLabs(Lab[] labs){
        for (int i = 0 ; i < labs.length ; i++)
            enrollLab(labs[i]);
    }
    /**
     * Set Name For Department
     * @param input name of department
     */
    public void setName(String input){
        name = input;
    }

    /**
     * Calculate Department Average
     */
    public void calculateAverage(){
        int sum = 0;
        for (Lab lab : labs) sum += lab.getAvg();
        avg = sum / currentLabsSize;
    }

    /**
     * get labs object array
     * @return labs array
     */
    public Lab[] getLabs() {
        return labs;
    }

    /**
     * get Department average
     * @return department average
     */
    public int getAvg(){
        return avg;
    }

    /**
     * get Department Average
     * @return department average
     */
     public int getCapacity(){
        return capacity;
     }


    /**
     * Get Department Name
     * @return department name
     */
    public String getName(){
         return name;
     }

    /**
     * Print Details of Department with Labs Details
     */
    public void print(){
         System.out.println(name + "-Department :");
         for (int i = 0 ; i < labs.length ; ++i){
             System.out.println("lab number: " + (i + 1)
                                + "\nStudents Count: " + labs[i].getCapacity());
             labs[i].print();

             System.out.println("==========================================================");
         }
         calculateAverage();
         System.out.println(name + "-Department AVG:" + avg);
     }

    public static void main(String[] args) {

        //Simple Students Array for Lab1 of Department
        Student[] lab1Students = new Student[3];
        lab1Students[0] = new Student("linus","torvalds","0123456789");
        lab1Students[1] = new Student("richard","stallman","9876543210");
        lab1Students[2] = new Student("Denis","Ritchie","0000000000");
        lab1Students[0].setGrade(15);
        lab1Students[1].setGrade(13);
        lab1Students[2].setGrade(20);


        //Simple Students Array for Lab2 of Department
        Student[] lab2Students = new Student[3];
        lab2Students[0] = new Student("bill","gates","0213546879");
        lab2Students[1] = new Student("steve","jobs","9768435210");
        lab2Students[2] = new Student("Elon","Mask","1111111111");
        lab2Students[0].setGrade(11);
        lab2Students[1].setGrade(14);
        lab2Students[2].setGrade(20);

        //Simple Students Array for Lab2 of Department
        Student[] lab3Students = new Student[3];
        lab3Students[0] = new Student("lionel","messi","100000000");
        lab3Students[1] = new Student("xavi","hernandez","600000000");
        lab3Students[2] = new Student("andres","iniesta","800000000");
        lab3Students[0].setGrade(10);
        lab3Students[1].setGrade(15);
        lab3Students[2].setGrade(20);

        //Simple Labs Array for Department
        Lab[] labs = new Lab[3];
        labs[0] = new Lab(3,"sunday");
        labs[0].setStudents(lab1Students);
        labs[1] = new Lab(3,"saturday");
        labs[1].setStudents(lab2Students);
        labs[2] = new Lab(3,"tuesday");
        labs[2].setStudents(lab3Students);


        //Set Student Grade in Lab For Calculate Average
        labs[0].setInLabStudentGrade(1,15);
        labs[0].setInLabStudentGrade(2,13);
        labs[0].setInLabStudentGrade(3,20);
        labs[1].setInLabStudentGrade(1,11);
        labs[1].setInLabStudentGrade(2,14);
        labs[1].setInLabStudentGrade(3,20);
        labs[2].setInLabStudentGrade(1,10);
        labs[2].setInLabStudentGrade(2,15);
        labs[2].setInLabStudentGrade(3,20);


        //Department Object
        Department computerEngineering= new Department("Computer Engineering",3);
        computerEngineering.setLabs(labs);


        //Print Details of Department
        computerEngineering.print();

    }
}
