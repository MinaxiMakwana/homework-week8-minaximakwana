package homeworkweek8;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9 {
    public static void main(String[] args) {    //main method
        Scanner p9 = new Scanner(System.in);    //declaring scanner
        System.out.println("Enter number of Fibonacci series");     //print statement to enter fibonacci series
        int t = p9.nextInt();       //assigning scanner
        int t1 = 1, t2 = 1;
        System.out.println("Fibonacci Series " + t1 + " " + t2 + " " );
        for (int i = 3; i <= t; i++){           //calculating fibonacci series
            int sum = t1 + t2;                  //adding two int
            System.out.println(sum + " ");
            t1 = t2;
            t2 = sum;
            p9.close();         //closing scanner
        }
    }
}
