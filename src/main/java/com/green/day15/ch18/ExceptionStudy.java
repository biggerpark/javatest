package com.green.day15.ch18;

public class ExceptionStudy {
    public static void main(String[] args) {
        String str1 = "123";
        int intVal1 = myParseInt(str1);
        System.out.println("int intVal1:"+(intVal1+1));

        String str2="12a3";
        int intVal2=myParseInt(str2);
        //문제가 발생이 되면 예외터트리지 않고 0을 리턴하는 메소드를 만들어서 예외 처리를 해주자
        System.out.println(intVal2);
        System.out.println("intVal2:"+intVal2);

    }

    public static int myParseInt(String string) {
        try{
            return Integer.parseInt(string);//String 을 정수형으로 바꿔주는 메소드
        }catch (Exception e){
            return 0;
        }
    }
}
