package homeworkweek8;
/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        Scanner p15 = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = p15.nextInt();
        char c = '*';
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <=i; j++){
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}
