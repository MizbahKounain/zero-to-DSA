package BASICS;

import java.util.Scanner;

public class no_of_factors {
    public static int factors(int n) {
        int count = 2;
        if (n <= 0)
            return 0;
        else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= (n / 2); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factors(n));
        sc.close();
    }
}
