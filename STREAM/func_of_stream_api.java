package STREAM;

import java.util.*;

public class func_of_stream_api {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        /*
         * Checking the even numbers -> doubling it -> summing up (This entire operatio
         * can be done using normal for loop but streams make it even easier)
         */
        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum += n;
        // }
        // }
        // System.out.println(sum);

        /* Performing the above operation easily using Stream API */

        /*
         * // Printing list using stream
         * Stream<Integer> s1 = nums.stream();
         * s1.forEach(n -> System.out.println(n)); // o/p: 1,2,3,4
         * 
         * // Checking any condition
         * Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
         * s2.forEach(n -> System.out.println(n)); //o/p: 2,4
         * 
         * // Perform operation (doubling the value)
         * Stream<Integer> s3 = s2.map(n -> n * 2);
         * s3.forEach(n -> System.out.println(n)); //o/p: 4,8
         * 
         * // Sum up the values (It gives a single value)
         * int result = s3.reduce(0, (c, e) -> c + e);
         * System.out.println(result); // o/p: 12
         */

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // The above is implementing the normal for loop using Stream API
    }
}
