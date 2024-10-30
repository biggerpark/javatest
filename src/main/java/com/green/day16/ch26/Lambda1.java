package com.green.day16.ch26;

public class Lambda1 {
    public static void main(String[] args) {

        //파라미터가 하나일 경우 () 소괄호 생략 가능
        PrintableVer2 printableVer2=(s)-> System.out.println(s);

        printableVer2.print("하하");


        //중괄호{} 생략시 return 도 생략 가능, 중괄호 생략시 return 키워드 작성 불가
        Calc sumCalc=(n1,n2)->n1+n2;
        System.out.println(sumCalc.calc(5,13));
        System.out.println(sumCalc.calc(2,3));


        //중괄호를 넣게 되면 이렇게 작성해줘야한다. 중괄호 안에 return 이 붙어야 한다.
        Calc minusCalc=(n1,n2)->{return n1-n2;};
        System.out.println(minusCalc.calc(10,7));
        System.out.println(minusCalc.calc(100,13));


    }
}

@FunctionalInterface
interface PrintableVer2{
    void print(String str); // 추상메소드 1개
}


@FunctionalInterface
interface Calc{
    int calc(int n1,int n2);
}