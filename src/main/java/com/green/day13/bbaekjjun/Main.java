package com.green.day13.bbaekjjun;

import java.util.Scanner;

public class Main {
    /*
    두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다.
    예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
    두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
     */



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("숫자를 두개 입력하세요>");
        int n1=scan.nextInt();
        int n2=scan.nextInt();

        int input=scan.nextInt();


        int[] arr1=new int[100];
        int[] arr2=new int[100];



        for(int i=0;i<arr1.length;i++){
            arr1[i]=n1*(i+1);
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=n2*(i+1);
        }

        outer:
        for(int n:arr1){
            for(int i=0;i<arr2.length;i++){
                if(n==arr2[i]){
                    System.out.println(arr2[i]);
                    break outer;
                }
            }
        }

    }
}
