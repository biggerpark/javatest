package com.green.day02.ch04;

public class SCE {
    public static void main(String[] args) {
        /*
        &&연산자는 false 확률이 높은 연산을 왼쪽에 배치하고
        ||연산자는 true 확률이 높은 연산을 왼쪽에 배치한다.
        이렇게 하면 속도가 더 빨라진다.
         */
        int n1=0, n2=0;
        boolean result;
        result=((n1+=10)<0)&&((n2+=10)>0);

        System.out.printf("result: %b",result);
        System.out.println("n1:"+n1);
        System.out.println("n2: "+n2);
        //(n1+=10)<0 :false 이기 때문에 오른쪽 항은 실행되지 않아 n2 에는 값이 저장되지 않는다.

        int n3=0, n4=0;

        result=((n3+=10)>0||(n4+=10)>0);

        System.out.printf("result: %b\n",result);
        System.out.println("n3: "+n3);
        System.out.println("n4: "+n4);
    }
}

