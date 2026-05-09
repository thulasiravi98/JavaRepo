package org.testleaf.week3.day1;

import java.util.Arrays;

public class ArrayAssigment {
   static class printDuplicate {
        int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };
    }

    public static void main(String[] args) {
        printDuplicate pd = new printDuplicate();
        Arrays.sort(pd.num);
        System.out.println("Duplicate Values are:");
        for (int i = 0; i < pd.num.length - 1; i++) {
            if (pd.num[i] == pd.num[i + 1]) {
                System.out.println(pd.num[i]);
            }
        }
    }
}

