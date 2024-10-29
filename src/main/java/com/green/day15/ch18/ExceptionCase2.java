package com.green.day15.ch18;

public class ExceptionCase2 {
    /*
    예외처리 하기(에러나지 않게 처리하는 방법)
     */
    public static void main(String[] args) {
        int n1=10;
        int n2=0;


        /*
        ❗❗❗try-catch 문(예외처리)❗❗❗
        try 문 안에 에러가 날 가능성이 있는 코드를 위치한다.
        만약에 예외(에러)가 발생이 된다면 catch 부분이 실행이 된다.
        예외(에러)가 발생되지 않는다면 catch 부분이 실행이 되지 않는다.
        if 문과 유사하다.
         */
        try{
            System.out.printf("%d / %d = %d\n",n1,n2,(n1/n2)); // 1) 에러나는 코드를 try 안에 넣음
        }catch(ArithmeticException e){ //2) catch 문 작성
            e.printStackTrace(); // 4) try-catch 문이 없었다면 콘솔에 나왔을 에러 문장이 나온다.
            //5) catch(ArithmeticException e) 은 수학적 예외(에러) 만 출력되어 나온다.
            //3) catch () 괄호 안에 에러와 관련된 모든 관련 객체의 주소값이 들어온다. 이 객체주소값의 정보인 getMessage 메소드를 통해 출력이 된다.
            System.out.println(e.getMessage());
        }
        System.out.println("--종료--");
    }
}
