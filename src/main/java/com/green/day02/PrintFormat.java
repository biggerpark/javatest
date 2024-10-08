package com.green.day02;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을때 사용
         */

        String name = "홍길동";
        int age = 28;
        float height = 172.5f;
        char bloodType = 'o';
        boolean isMan = true;


        System.out.printf("%s 의 나이는 %d 살 키는 %f 혈액형은 %c형 입니다. 그는 남자입니까? %b\n", name, age, height, bloodType, isMan);
        System.out.printf("%s 의 나이는 %s 살 키는 %s 혈액형은 %s형 입니다. 그는 남자입니까? %s\n", name, age, height, bloodType, isMan);
        System.out.printf("키는 %.1f\n", 172.584968); // %.1f, %.2f 를 사용하면 실수를 첫번째 자리 반올림, 두번째 자리 반올림을 해줄 수 있다. .1은 실수를 나타내는 길이
        System.out.printf("키는 %012.1f\n", 172.584968); // %f 사이의 값을 주어서 기능을 활용할 수 있다. 12는 총 12칸을 차지한다.012는 12칸을 사용하는데 빈칸이 없으면 빈칸을
        // 0으로 채운다.
        System.out.printf("키는 %-12.1f 입니다\n",172.3548); // 왼쪽 정렬
        System.out.printf("키는 %12.1f 입니다\n",172.3548); // 오른쪽 정렬

        int won=230000000;
        System.out.printf("won: %d원\n",won);
        System.out.printf("won: %,d원\n",won);//정수 사이에 ,를 입력
        System.out.printf("won: %12d원\n",won);//12자리 정수 오른쪽 정렬
        System.out.printf("won: %-12d원\n",won);//12자리 정수 왼쪽정렬
        System.out.printf("won: %012d원",won);//오른쪽 정렬 후 0을 남은 자리에 채워줌





    }
}

