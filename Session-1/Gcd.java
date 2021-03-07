/*
 * A Program That Show Us GCD Of Two Number is 1 or not
 * Auth : Alireza Zare Zeynabadi
 * 9931022
 * Version : 1.0
 * Date : 2021.March.1
 */
package zare.alireza;
import java.util.Scanner;
public class Gcd {

    static int gcd(int num1, int num2) {

        if (num1 == num2)
            return num1;

        if (num1 > num2)
            return gcd(num1-num2, num2);

        return gcd(num1, num2-num1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt(), num2 = in.nextInt();

        if (gcd(num1,num2) == 1) System.out.println("" + num1 +" va "+ num2 + " nesbat be ham aval hastand");

        else System.out.println("" + num1 +" va "+ num2 + " nesbat be ham avan nistand" + " (" +num1 + " , " + num2 +")" + " = " + gcd(num1,num2));

    }
}

