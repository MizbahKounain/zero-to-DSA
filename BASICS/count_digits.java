package BASICS;

import java.util.Scanner;

public class count_digits {
    public static int count(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int Stringcount(String n) {
        int length = n.length();
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // If number starts from a non-zero then use this logic
        int n = sc.nextInt();
        System.out.println(count(n));

        // If a number starts from zero then use this logic
        String s = sc.next();
        System.out.println(Stringcount(s));

        sc.close();
    }
}

// n = 099
// If a number starts with zero it is treated as a octal number in
// java,
// so if the input starts from zero then java ignores that zero and takes the
// input
// after zero but to also include zero then take the input as string.
