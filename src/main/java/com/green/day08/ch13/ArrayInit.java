package com.green.day08.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr=new int[5];
        /*
        0:10 -->arr[0]=10
        1:20 -->arr[1]=20
        2:30 -->arr[2]=30
        3:40 -->arr[3]=40
        4:50 -->arr[4]=50
         */
        System.out.println(arr.length);

        //퀴즈)제일 밑의 코드를 건드리지 않고 위의 값이 출력되도록 해보자.
        for(int i=0;i<arr.length;i++){
            arr[i]=(10*i)+10;
        }


        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]:%d\n",i,arr[i]);
        }
    }
}
