package com.green.day15.ch18;

public class ExceptionEx12 {
    public static void main(String[] args) {
       try{
            method1();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("---끝---");

    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{ //void 메소드를 이용하여 예외 던지기
        throw new Exception("하하"); //예외를 일부러 발생시킨것.
        //throws 메소드에서만 사용할 수 있는게 아니고 예외를 일부로 발생시키고 싶을때
        //Exception 클래스의 객체를 만들어서 던짐
    }
}
