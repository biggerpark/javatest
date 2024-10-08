package com.green.day02.ch05;

public class SwitchBasic {
    public static void main(String[] args) {
                int n=2;
                //switch(변수){}: 변수가 case 의 경우일때 중괄호 안의 {} 코드가 실행된다.
                //break 는 빼도 된다. break 는 if 문에서 마지막 }와 같다.
                // switch 문은 case 에 진입하게 되면 break 를 만날때까지 계속 실행된다. 즉 n이 1인데, case 1에 break가 없다면 case2까지 실행되고 멈춘다.
                // switch 문은 관계연산자는 사용할 수 없다.
                // swich 문은 정수,실수 type 에는 그렇게 적절하지 않다.
                switch(n) {
                    case 1:
                        System.out.println("Simple Java");
                        break;
                    case 2:
                        System.out.println("Funny Java");
                        break;
                    case 3:
                        System.out.println("Fantastic Java");
                        break;
                    default: //if 문에서 else 와 같다.
                        System.out.println("The best language");
                        break;

                }

                //밑의 if 문과 위의 switch 는 같다.

                if(n==1){
                    System.out.println("Simple Java");
                }else if(n==2){
                    System.out.println("Funny Java");
                }else if(n==3){
                    System.out.println("Fantastic Java");
                }else{
                    System.out.println("The best language");
                }
    }
}
