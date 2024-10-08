package com.green.day02;

public class UnderFlow {
    public static void main(String[] args) {

        //OverFlow는 위로 넘쳤을때 다시 제일 밑으로 가서 그 값이 출력
        //UnderFlow는 밑으로 넘어갔을때 다시 제일 위로 가서 그 값이 출력
        byte var1=-128;
        System.out.printf("var1: %d\n", var1);

        byte var2=(byte)-129;
        System.out.printf("var2: %d\n", var2); // -128을 넘었으므로 위로 돌아가 127이 나온다.

    }
}
