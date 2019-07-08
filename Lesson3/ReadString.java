package Lesson3;

import java.util.Scanner;

public class ReadString {

    public String write () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите строку:");
        String str = sc.nextLine();
        return str;
    }

    public char [] strToArray (String str) {
        char[] s = str.toCharArray();
        return s;
    }
}
