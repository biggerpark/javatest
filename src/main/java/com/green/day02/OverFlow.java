package com.green.day02;

public class OverFlow {
    public static void main(String[] args) {
        /*
        5리터 짜리 컵에 5리터 이상의 물을 넣었을때, 물이 넘치게 된다.
        이 현상을 오버플로우
        100까지 저장할수 있는 곳에 101이상을 저장하게 되면 오버플로우 현상이 나타난다. 다만 현실과는 다르다.


        byte type: 정수 -128~127 까지 저장 가능하다.
         */

        byte var1=127;

        System.out.printf("var1 : %d\n",var1);

        byte var2= (byte)128;//오버플로우 현상이 되면서 byte 에 저장될 수 있는 범위인 127을 넘어서 -128로 간다.

        System.out.println(var2); // var2=-128이 된다.




    }
}
