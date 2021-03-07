/*
 * A Program That Show Us 10X10 Multiplication Table
 * Auth : Alireza Zare Zeynabadi
 * 9931022
 * Version : 1.0
 * Date : 2021.March.1
 */
package zare.alireza;

public class JadvalZarb {
    public static void main(String[] args){
        System.out.println("        1    2    3    4    5    6    7    8    9    10\n       --------------------------------------------------");
        for (int i = 1 ; i <= 10 ; i++){
            if (i < 10)
                System.out.print(i + "      |");
            else System.out.print(i+ "     |");
            for (int j = 1 ; j <= 10 ; j++){
                System.out.printf("%-5d",i*j);
            }
            System.out.print("\n");
        }
    }

}
