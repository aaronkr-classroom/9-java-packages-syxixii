package com.section03;

public class Ex1007 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello ");

        str.append("Programing"); // 추가
        System.out.println(str);

        str.insert(6, "Java "); // 삽입
        System.out.println(str);

        str.replace(1, 4, "Good"); // 배열 4 앞부분까지
        System.out.println(str);

        str.delete(1, 5); // 삭제
        System.out.println(str);

        str.reverse(); // 거꾸로
        System.out.println(str);

    }
}
