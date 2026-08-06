package ARRAYS.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Check_SortedArray {
    public static boolean isSorted(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(isSorted(list));
        sc.close();
    }

}
