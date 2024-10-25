package com.green.day14.ch17;

public class PrintDriver2 {
    public static void main(String[] args) {
        String myDoc="This is a report about...";

        Printable prn1=new Prn204Drv(); // 다형성을 활용한 부모 객체에 자식 주소값 넣음
        Printable prn2=new Prn731Drv();

        prn1.print(myDoc); // 메소드 호출은 객체기준으로 실행하고 객체에 없으면 부모로 올라간다. 만약 부모에도 없으면 더 부모로 올라간다.
        System.out.println();
        prn2.print(myDoc);
    }

}
class Prn204Drv implements Printable{

    @Override
    public void print(String doc) {
        System.out.println("FROM MD-204 printer");
        System.out.println(doc);
    }
}

class Prn731Drv implements Printable{

    @Override
    public void print(String doc) {
        System.out.println("FROM MD-731 printer");
        System.out.println(doc);

    }
}