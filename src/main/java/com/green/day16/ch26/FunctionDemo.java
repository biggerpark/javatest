package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer[] arr = {10000, 20, 30, 40, 100, 200, 400, 700, 900, 1000, 1000};
//        Function<Integer[], Integer> fn = arr2 -> {
//            int max = arr2[0];
//            for (int i = 0; i < arr2.length; i++) {
//                if (arr2[i] > max) {
//                    max = arr2[i];
//                }
//            }
//            return max;

        Function<Integer[], Integer[]> fn = arr2 -> {
            for (int i = 0; i < arr2.length; i++) {
                for (int n = 0; n < i; n++) {
                    if (arr2[i] > arr2[n]) {
                        int temp = arr2[n];
                        arr2[n] = arr2[i];
                        arr2[i] = temp;
                    }
                }
            }return arr2;
        };




        //배열 안에서 가장 큰 숫자 리턴
//        int maxValue = fn.apply(arr);
//        System.out.println("maxValue:" + maxValue);

        // 배열안에서 숫자 내림차순 정렬을 람다식을 활용하여 작성
        List<Integer> arr2=new ArrayList<>();

        for(int i=0;i<fn.apply(arr).length;i++){
            arr2.add(fn.apply(arr)[i]);
        }
        System.out.println(arr2);

    }
}
