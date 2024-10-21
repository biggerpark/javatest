package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    public static void main(String[] args) {
        /*
        다음 메소드는 int형 1차원 배열에 저장된 값을 두번째 매개변수로 전달된 값의 크기만큼
        전부 증가시킨다.

        public static void addOneDArr(int[] arr,int add){


        }
         */


        int[] arr={1,2,3,4,5};
        addOneDArr(arr,3); // 두번째 인자의 값을 모든 방에 더해준다.
        System.out.println(Arrays.toString(arr));

        int[][]arr2={
                {1,2,3},
                {4,5,6}
        };
        addTwoDArr(arr2,4);//메소드 재활용성을 극대화 시킨다.
        System.out.println(Arrays.deepToString(arr2));

    }

    //void 메소드로 바로 출력하지 않고 그냥 값을 바꿔줄 수 있다. 이렇게 하면 메소드 호출 한번 함으로써 재활용성이 좋아진다.
    public static void addOneDArr(int[] arr2,int add){
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr2[i]+add;
        }
    }

    //int[] : 객체의 각 방의 타입: int
    //int[][]: 객체의 각 방의 타입: int 배열=int[]

    public static void addTwoDArr(int[][] arr,int add) {
        for (int i = 0; i < arr.length; i++) {
//            for (int n = 0; n < arr[i].length; n++) {
//                arr[i][n] = arr[i][n] + add;
            addOneDArr(arr[i],add); // 만들어놓은 메소드 활용
        }
    }
}


