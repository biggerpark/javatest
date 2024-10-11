package com.green.day04.ch05;

public class LabelBreakPoint {
    public static void main(String[] args) {
    //구구단에서 곱의 결과가 72인 결과를 딱 하나만 보여라.

        outer: // 첫번째 for 문 앞에 outer 를 사용하면 break outer 코드가 젤 처음 for 를 빠져나올 수 있다.
        for(int i=1;i<10;i++){
            sub: // sub 는 굳이 필요없다.  기능은 안의 for 문을 빠져나온다.
            for(int z=1;z<10;z++){
                if((i*z)==72){
                    System.out.printf("%d x %d = %d\n",i,z,(i*z));
                    break outer; // break outer; 를 사용하면서 첫번째 for 문을 빠져나오면서 모든 반복문을 빠져나온다.
                }
            }
        }

        // while 반복문도 outer: break outer; 적용 가능하다.
        int n =1;

        outer:
        while(true){
            while(true){
                if(n==10) {
                    break outer; // while 반복문도 outer: 적용이 가능하다.
                } n++;
            }
        }
        System.out.println("aaaa");

        System.out.println("---끝---");
    }
}
