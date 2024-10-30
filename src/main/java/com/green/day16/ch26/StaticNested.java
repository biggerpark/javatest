package com.green.day16.ch26;


public class StaticNested {
    //p.642
    //네스티드 클래스와 이너 클래스
    //네스티드 클래스는 아 이런것만 있구나 하고 넘기자.
    public static void main(String[] args) {
        Outer.Nested1 nst1=new Outer.Nested1(); // Nested1 은 Outer class 안에 있기 때문에 객체화를 할려면 이런 식으로 해줘야한다.즉 Nested1 은 static 이지만 객체화가 가능하다.
        nst1.add(10);
        nst1.add(2);

        Outer.Nested2 nst2=new Outer.Nested2();
        System.out.println(nst2.get());

    }

}
class Outer{
    private static int num;

    //Static Nested class
    static class Nested1{
        void add(int val){
            num+=val;
        }
    }
    static class Nested2{
        int get(){
            return num;
        }
    }
}