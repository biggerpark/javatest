package com.green.day13.bbaekjjun;

import java.util.ArrayList;
import java.util.List;

public class Nannoogi {
    public static void main(String[] args) {
        System.out.println(solution(60,124,678,21873));
    }
    public static List<Integer> solution(int number1, int denom1, int number2, int denom2) {

        if(denom1==denom2){
            List<Integer> arr=new ArrayList<>();
            arr.add(number1+number2);
            arr.add(denom1);

            return arr;
        }else {
            int number=1;
            List<Integer> arr=new ArrayList<>();
            List<Integer> arr2=new ArrayList<>();
            List<Integer> answer=new ArrayList<>();


            while (true){
                arr.add(denom1*number);
                arr2.add(denom2*number);
                number++;
                if(number==100000){
                    break;
                }
            }

            int num=0;
            outer:
            for(int n:arr){
                for(int i=0;i<arr2.size();i++){
                    if(n== arr2.get(i)){
                        num=n;
                        break outer;
                    }
                }
            }

            int num1=num/denom1;
            int num2=num/denom2;

            answer.add((number1*num1)+(number2*num2));
            answer.add(num);

            return answer;

        }
    }

}


