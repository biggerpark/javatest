package com.green.day03.ch05;

public class InfinityLoop {
    public static void main(String[] args) {
        int n=1;
        while(true){ // while(true)을 쓰면 무한루프를 돌리는것.
            if((n%6==0)&&(n%14==0)){
                break;
            }n++;
        }
        System.out.printf("n: %d\n",n); // 반복문을 못 빠져나오므로 변수값이 대입되지 않는다.
    }
}
