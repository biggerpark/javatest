package com.green.day15.ch18;

public class ExceptionStudy2 {
    public static void main(String[] args) {
        /*

        메소드 호출하는 코드를 작성을 했는데 빨간줄이고 , 마우스를 올려서 메시지를 확인해보니 Unhandled Exception 이라는 내용이 보이면
        해당 메소드는 예외를 던지고(throw) 있기 때문에 ❗❗❗호출하는 부분에서 try-catch 로 해결해 주어야 한다. (호출 부분을 감싸줘야 한다)❗❗❗

         */

        int r=0;
        try{
            r=div(10,0); //2) 런타임exception(매개변수가 그냥 Exception으로 되었있으면) 을 throw 하는 메소드가  아니면 빨간줄이 뜬다. 이걸 해결하려면 메인 메소드 안에서 try-catch 문으로 감싸야한다.
        }catch (Exception e){ // Exception e 예외를 받으면 이렇게 처리하겠다 라는 코드
//            e.getMessage();
           throw new RuntimeException(e);
        }


        System.out.println("r:"+r);
    }

    public static int div(int n1, int n2) throws Exception{ //1) 예외가 발생 한다면 호출한 곳으로 던지겠다. 즉 예외처리는 호출한 곳에서 try-catch 로 해결해야한다.
            return n1/n2;
    }
}
