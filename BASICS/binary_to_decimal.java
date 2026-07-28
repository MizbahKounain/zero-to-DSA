package BASICS;

import java.util.Scanner;

public class binary_to_decimal {
    public static int binToDec(String s) {
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                sum += Math.pow(2, i);
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(binToDec(s));
        sc.close();
    }
}
