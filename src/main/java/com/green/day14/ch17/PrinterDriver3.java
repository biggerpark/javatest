package com.green.day14.ch17;

public class PrinterDriver3 {
    public static void main(String[] args) {

    }
}

interface ColorPrintable extends Printable{
    //❗❗❗인터페이스가 인터페이스를 상속받을 수 있다.❗❗❗

    //인터페이스가 인터페이스를 상속 받을 때 키워드: extends
    //class 가 인터페이스를 상속받을때 키워드: implements
    //인터페이스가 class 를 상속받을 수는 없다.
    void printCMYK(String doc); //컬러프린터블 클래스의 추상메소드
}

class Prn909Drv implements ColorPrintable{ // 상속받는 인터페이스가 다른 인터페이스를 상속받았으므로  인터페이스를 implements 하면 두개의 추상메소드를 써줘야함.

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("From MD-090 black & white ver");
        System.out.println(doc);
    }
}



//Prn909Drv 객체의 주소값 담을 수 있는 타입:Printable, ColorPrintable, Prn909rv
//Prn909Drv 객체의 주소값으로 호출할 수 있는 메소드:printCMYK(), print()
//ColorPrintable 객체의 주소값으로 호출할 수 있는 메소드:printCMYK()
//Printable 객체의 주소값으로 호출할 수 있는 메소드:print()




