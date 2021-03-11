/**
 * Run Class for 3 Objects from Student Class And an Object from Lab Class
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.March.8
 */
public class Run {
    ///Driver Program
    public static void main(String[] args) {

        Student std1 = new Student("Ehsan","Edalat","9031066");
        Student std2 = new Student("Seyed","Ahmadpanah","9031806");
        Student std3 = new Student("Ahmad","Asadi", "9031054");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();



        System.out.println("\n========================================================\n");
        //Array of Student Objects
        Student[] students = new Student[3];
        //Assign Students To the Array
        students[0] = std1;
        students[1] = std2;
        students[2] = std3;
        // Lab Object
        Lab workShop = new Lab(3,"monday");
        //set Students
        workShop.setStudents(students);
        //set grade in lab list
        workShop.setInLabStudentGrade(1,students[0].getGrade());
        workShop.setInLabStudentGrade(2,students[1].getGrade());
        workShop.setInLabStudentGrade(3,students[2].getGrade());
        //print lab details
        workShop.print();
    }
}
