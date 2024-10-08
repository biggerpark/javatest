package com.green.day02;

public class Mission01 {
    public static void main(String[] args) {
        int n1=10;
        int n2=3;

       //문제: n1/n2 나누셔서 3.3333 나올 수 있도록 해주세요



        //float n3= n1/n2; -> int/int 결과 type 은 int 이기 때문에 실수 값이 날아간다.
        //float n3= (float)n1/n2; -> n1만 float 으로 변환해줌으로써 float/int 가 되어 n2도 자동형변환이 되어 float type 의 결과값이 나온다.

        float n3= (float)n1/n2;

        float n4=(n1+n3);

        System.out.println(n4);

        System.out.println(n3);
    }
}
