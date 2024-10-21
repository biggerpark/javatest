package com.green.day09.ch13;

public class EnhancedFor {
    //향상된 for 문, 강화된 for 문, foreach 문

    public static void main(String[] args) {
        int[] arr={10,22,7,4,80};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("---------------");


        //enhanced for 문은 아래처럼 동작한다.
        for(int item:arr){
            System.out.println(item);
        }
        /*

        sequence 가 있는 콜렉션에서 사용가능하다.
        예를 들어 0,1,2번방 같은 순차적으로 값을 읽어어고 쓰는 콜렉션에서는 사용가능하다.
        Array(배열), ArrayList 등에서 주로 사용

        enhanced for 문은 보통 값을 읽어올 때 사용한다.

        배열의 각 방안에 값을 넣을려면 for 문을 이용하여 넣어줘야한다.

        위의 enhanced for 문은 아래의 문장들과 똑같다 볼 수 있다.

        int item=arr[0];
        System.out.println(item)

        int item=arr[1];
        System.out.println(item)

        int item=arr[2];
        System.out.println(item)

         */


    }


}
