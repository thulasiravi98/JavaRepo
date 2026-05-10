package org.testleaf.week3.day2;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Thulasipriya";
        String rev = "";
       char[] chars = name.toCharArray();
        for (int i = chars.length-1;  i >= 0; i--) {
            rev = rev + chars[i];
        }
        System.out.println("Reverse of the String is:" + rev);
    }

}
