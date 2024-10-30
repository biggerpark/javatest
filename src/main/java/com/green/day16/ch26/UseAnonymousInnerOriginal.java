package com.green.day16.ch26;

public class UseAnonymousInnerOriginal {
    public static void main(String[] args) {

        Printable p=new PrintableImpl();
        p.print();

    }
}

//원래는 이런식으로 클래스가 인터페이스를 임플리먼츠 받아서 그 클래스를 객체화 해서 사용해야한다.
class PrintableImpl implements Printable{
    @Override
    public void print(){
        System.out.println("이름 있는 클래스 print");
    }
}
