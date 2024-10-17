package com.green.day08.ch13;

import java.util.Arrays;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr={10,15,23,1,8,8,1,2,58,2,3,4}; // arr 배열 생성과 동시에 초기화 해준것


        int[] copyArr=new int[arr.length]; //arr 의 배열과 똑같은 크기의 copyArr 배열을 만든다



        for(int i=0;i<arr.length;i++){ //이를 딥카피(깊은복사)라고 한다. 동등성
            copyArr[i]=arr[i];
        }

        System.out.println(Arrays.toString(copyArr));

        int[] arr2=copyArr;//이를 얕은 복사(주소값을 복사)라고 한다.
        System.out.println("arr2==copyArr:"+(arr2==copyArr)); // == 결과값이 true 면 같은 주소로 향하는지 못는거다. 즉 얕은 복사는 true 가 나온다.

        System.out.println("arr==copyArr: "+(arr==copyArr));
        //참조변수(레퍼런스변수)끼리의 ==비교는 동일성(같은 주소값)을 묻는다 . 동일(주소값이 같아야한다)하진 않지만 값이 같기 때문에 동등하다

        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]:%d\n",i,arr[i]);
        }

        System.out.println("----------");
        for(int i=0;i<copyArr.length;i++){
            System.out.printf("copyArr[%d]:%d\n",i,copyArr[i]);
        }




    }
}
