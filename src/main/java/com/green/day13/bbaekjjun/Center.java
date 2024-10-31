package com.green.day13.bbaekjjun;

import java.util.List;

public class Center {
    /*
    중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
    정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
     */


    public static int solution(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int n=0;n<i;n++){
                if(array[i]<array[n]){
                    int temp=array[i];
                    array[i]=array[n];
                    array[n]=temp;
                }
            }
        }return array[2];
    }






    public static void main(String[] args) {
        int[] array={8,9,1,3,4,6,7};
        System.out.println(Center.solution(array));
    }

}



