package BASICS;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Using 3rd variable
        // int c = a;
        // a = b;
        // b = c;
        // System.out.println("Swap without a 3rd variable: a - " + a + ", b - " + b);

        // Without a 3rd variable(Ovrflow error)
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // System.out.println("Swap without a 3rd variable: a - " + a + ", b - " + b);

        // Using XOR op(Eliminate overflow error)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swap without a 3rd variable: a - " + a + ", b - " + b);

    }

}
