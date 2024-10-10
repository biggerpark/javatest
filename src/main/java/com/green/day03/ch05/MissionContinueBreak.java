package com.green.day03.ch05;

public class MissionContinueBreak {
    public static void main(String[] args) {
        /*
        자연수 1부터 시작해서 모든 홀수를 더해나간다.
        그리고 그 합이 언제(몇을 더했을때) 1000을 넘어서는지,
        그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력
         */

        int n=0;
        int sum=0;
        int num=0;

        while(true){
            n++;
            if(n%2==1){
                sum+=n;  // 복합연사자를 사용
                num+=1;
                System.out.printf("%d.%d\n",num,n);}
            if(sum>1000){
                break;
            }
        }
        System.out.println("마지막 더한 값:"+n);
        System.out.println("sum:"+sum);
    }
}
