package com.green.day02.ch05;

public class IEIE {
    public static void main(String[] args) {

        int n=0;

        while(n<110){
            if(n<=0){
            System.out.printf("%d는 0미만\n",n);
        }else if(n<50){
            System.out.printf("%d는 50미만\n",n);
        }else if(n<100){
            System.out.printf("%d는 100미만\n",n);
        }else{
            System.out.printf("%d는 100이상\n",n);
        } ++n;
            System.out.println(n);
        }

        /* if-else if-else 는 그룹이 된다. 그 중 하나만 실행이 된다.
        위에서 순차적으로 내려오면서 만족하는 조건이 있으면 바로 실행이 된다.
        else 가 없으면 하나도 실행 안될 수 있지만, else 가 있으면 무조건 하나는 실행이 된다.
         */
    }
}
