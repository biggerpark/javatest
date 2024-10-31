package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer[] arr = {10000, 20, 30, 40, 100, 200, 400, 700, 900, 1000, 1000};
        Function<Integer[], Integer> fn = arr2 -> {
            int max = arr2[0];
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] > max) {
                    max = arr2[i];
                }
            }
            return max;
        };


        //배열 안에서 가장 큰 숫자 리턴
        int maxValue = fn.apply(arr);
        System.out.println("maxValue:" + maxValue);
    }
}
