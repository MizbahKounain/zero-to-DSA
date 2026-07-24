//Find & remove the last digit of a number
package BASICS;

import java.util.*;

public class Find_remove_last_digit {
    public static int Find_last(int n) {
        int res1 = n % 10;
        return res1;
    }

    public static int remove_last(int n) {
        int res2 = n / 10;
        return res2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Last digit number is " + Find_last(n));
        System.out.println("Removed last digit number from " + remove_last(n));
        sc.close();
    }
}
