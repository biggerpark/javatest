package com.green.day03.ch05;

public class MissionWhile3 {
    public static void main(String[] args) {
        /*
        1000이하 자연수 중, 2의 배수이자 7의 배수인 수를 모두 출력하고,
        그 숫자들의 갯수와 그 수들의 합을 구해서 출력하는 프로그램을 작성,
        while 문을 활용하여 작성
         */

        int n=1;
        int sum=0;
        int num=0;

        while(n<1001){
            if((n%2==0)&&(n%7==0)){
                System.out.println(n);
                sum+=n;
                num++;
            } ++n;
        }
        System.out.println("sum: "+ sum);
        System.out.println("num: "+ num);
    }
}
