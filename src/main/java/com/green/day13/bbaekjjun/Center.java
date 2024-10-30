package com.green.day13.bbaekjjun;

import java.util.List;

public class Center {
    /*
    중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
    정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
     */

    public static int solution(int[] array) {
//        int[] arr = new int[array.length];
        int min = array[0];
        int i = 0;
//
//        try {
//            for (int i = 0; i < array.length; i++) {
//                if(array[i]<min){
//                    min=array[i];
//                }
//            }arr[0]=min;
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        array[0] = min;

        try {
            while (i + 1 < array.length) {
                if (array[i + 1] > array[i + 2]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i + 2];
                    array[i + 2] = temp;
                }
                if (array.length % 2 == 1) {
                    throw new Exception();
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println("배열의 길이가 홀수가 아닙니다");
        }
        return array[1];
    }

    public static void main(String[] args) {
        int[] arr={6,4,5,1,8,9,2};
        System.out.println(Center.solution(arr));
    }

}



