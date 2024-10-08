package com.green.day02.ch04;

public class LogicalOp {
    public static void main(String[] args) {
        /*
        논리연산자 : &&,||,!
         */

        int n1=11,n2=22;
        boolean result;

        result=(1<n1)&&(n1<100); //true, 1~100 사이인지 or 2이상 99이하 , 두개 다 true 이어야 true, 하나라도 false 면 false

        System.out.printf("%d은 1초과 100미만인가? : %b\n",n1,result);

        result=((n2%2==0)||(n2%3==0));// 2의 배수인지, 3의 배수인지 하나라도 true 면 true
        System.out.printf("%d는 2또는 3의 배수인가? %b\n",n2,result);

        result=!(n1!=0);
        System.out.printf("%d는 0인가? %b\n",n1,result);
        System.out.printf("%d는 0인가? %b\n",n1,n1==0);




    }
}
