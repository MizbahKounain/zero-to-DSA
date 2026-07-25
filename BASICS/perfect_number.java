//Perfect number: number that equals the sum of its proper positive divisors, 
//excluding the number itself
//if n = 6 -> 1,2,3 -> 1+2+3 = 6
package BASICS;

import java.util.Scanner;

public class perfect_number {
    public static boolean perfect(int n) {
        int sum = 1;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(perfect(n));
        sc.close();
    }

}
