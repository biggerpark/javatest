package com.green.day02.ch04;

public class ComAssignOp {
    public static void main(String[] args) {
        int n1=10;
        n1=n1+2;
        System.out.printf("n1: %d\n",n1);

        int n2=10;
        n2 +=2; // 복합대입연산자를 사용한것, 초기 n2값에 2를 더해서 n2에 대입시키는 것.
        System.out.printf("n2: %d\n",n2);
        for(n2=0;n2<20;n2+=3){
            System.out.println(n2);
        }

        int n3=5;
        n3=n3*3;
        System.out.printf("n3: %d\n",n3);

        //복합대입연산자를 활용하여 n3와 결과가 같도록 해주세요
        int n4=5;
        n4 *=3;
        System.out.printf("n4: %d\n",n4);
    }
}
