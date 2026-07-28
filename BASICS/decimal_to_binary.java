package BASICS;

import java.util.Scanner;

public class decimal_to_binary {
    public static String decToBin(int n) {
        String s = "";
        while (n > 0) {
            int rem = n % 2;
            s += rem;
            n /= 2;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decToBin(n));
        sc.close();
    }
}

/* Keep dividing the number by 2 and note the reminder and store in string */
