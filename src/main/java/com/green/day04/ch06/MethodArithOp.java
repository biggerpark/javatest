package com.green.day04.ch06;

public class MethodArithOp {

    public static void main(String[] args) {
        /*System.out.printf("%d+%d=%d\n",n1,n2,(n1+n2));
        System.out.printf("%d+%d=%d\n",n1,n2,(n1-n2));
        System.out.printf("%d+%d=%d\n",n1,n2,(n1*n2));
        System.out.printf("%d+%d=%d\n",n1,n2,(n1/n2));
        System.out.printf("%d+%d=%d\n",n1,n2,(n1%n2));

        위 코드들을 method를 이용해 값을 출력


        */
        int n1=7;
        int n2=3;
        substract(7,3);
        multiply(4,5);
        System.out.println();
        float r=divide(10,3);
        System.out.println(r);
        System.out.println();
        int r2=mod(10,4);
        System.out.println(r2);



    }

    static void substract(int n1,int n2){
            System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
    }

    static void multiply(int n1,int n2){
        System.out.printf("%d x %d = %d",n1,n2,n1*n2);
    }

    static float divide(int n1,int n2){ //위의 비void 메소드안의 값이 int type 이기 때문에 매개변수 안에 int를 사용해야 한다.
         return (float)n1/n2;
    }
    static int mod(int n1, int n2){
        return n1%n2;
    }


}
