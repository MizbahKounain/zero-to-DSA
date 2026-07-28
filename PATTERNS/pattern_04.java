package PATTERNS;

import java.util.Scanner;

/*
   *
  ***
 *****
*******
*/
public class pattern_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = (row - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * (i - 1) + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}
