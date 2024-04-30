package com.section03;

public class Ex1006 {

    public static void main(String[] args) {
        String str1 = "www.naver.com";
        String[] arrStr1 = str1.split("\\.");

        for (int i = 0; i < arrStr1.length; i++) // 속성 length
            System.out.println(arrStr1[i]);

        String str2 = "Java";
        System.out.println(str2);
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());

        for (int i = 0; i < str2.length(); i++) // 함수 length()
            System.out.print(str2.charAt(i) + " . ");

        String str3 = str2.replace('a', 't');
        System.out.println("\n" + str3);

        String str4 = "I like to eat ice cream.";
        System.out.println(str4.substring(14).toUpperCase()); // 배열 14번째부터 시작
        System.out.println(str4.indexOf("ice")); // ice는 몇 번째 배열부터 시작하는지, 없는 단어 입력 시 -1 출력
    }
}
