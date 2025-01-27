package com.section03;

import java.util.Scanner;

public class Ex1008 {

    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);

        System.out.println("입력 문자열 : ");
        str = in.nextLine(); // Hello

        int len = str.length(); // 5

        String rev1 = "";
        for (int i = len - 1; i >= 0; i--)
            rev1 = rev1 + str.charAt(i); // o + l + l + e + H

        System.out.println("String 클래스의 역순 문자열 : " + rev1);

        // StringBuilder 클래스의 역순 문자열
        StringBuilder rev2 = new StringBuilder(str);
        rev2.reverse();

        System.out.println("StringBuilder 클래스의 역순 문자열 : " + rev2);
    }
}
