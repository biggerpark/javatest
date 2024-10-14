package com.green.day05.ch06;

public class Mission06_1_2 {
    public static void main(String[] args) {
        /*
       점수 둘을 인자로 전달 받아서, 두 수의 차의 절댓값을 계산하여 출력하는 메소드와
       이 메소드를 호출하는 main 메소드를 정의해보자. 단 메소드 호출 시 전달되는 값의 순서에 상관없이
       절대값이 계산되고 출력되어야 한다.
         */
        int i=(int)(Math.random()*30)+1;
        int n=(int)(Math.random()*30)+1;
        System.out.println(i);
        System.out.println(n);
        System.out.println("-----------");
        absOp(i,n);
    }

    static void absOp(int i, int n){
//        if((i-n<0)){
//            System.out.println(-1*(i-n));
//        }else{
//            System.out.println(i-n);
//        }

        System.out.println(i-n<0?n-i:i-n);
    }
}


