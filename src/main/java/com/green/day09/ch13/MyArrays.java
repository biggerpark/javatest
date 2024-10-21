package com.green.day09.ch13;

import java.util.Arrays;


//❗❗❗String 공부하기❗❗❗
public class MyArrays {


    public static String toString(int[] arr) { // 배열을 문자열로 출력해주는 메소드
        StringBuilder sb = new StringBuilder("[");
        int lastIdx = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i == lastIdx) {
                break;
            }
            sb.append(",");
        }
        return sb.append("]").toString(); // StringBuilder 를 String 으로 바꿈
    }

    public static String toString2(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(arr[i]);
        }
        return "[" + sb + "]"; // sb에 자동으로 toString()이 붙는다. 왜냐하면 "[" 가 문자열 이기 때문에 자동으로 객체주소값인 sb가 문자열 으로 바꿔준다
    }

    public static String toString3(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(",");
            sb.append(arr[i]);
        }
        return sb.append("]").toString();
    }


//    public static int[] copyOf(int[] arr) {
//        int[] temp = new int[arr.length];//새로운 배열을 만들엇기 때문에 주소값은 틀림, 즉 deep copy 한것.
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        return temp; // deep copy 해준것. 주소값은 틀림
//    }


    public static int[] copyOf2(int[] arr, int k) {
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static int[] copyOf(int[] arr){
        return copyOf2(arr,arr.length);
    }


}









