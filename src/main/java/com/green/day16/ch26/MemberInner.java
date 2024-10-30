package com.green.day16.ch26;

public class MemberInner {
    public static void main(String[] args) {
        Outer2 o1=new Outer2();
        Outer2 o2=new Outer2();

        Outer2.Member o1m1=o1.new Member();
        Outer2.Member o2m2=o2.new Member();
        o1m1.add(10);
        o2m2.add(30);

        System.out.println(o1m1.get());
        System.out.println(o1.parentGet());
        System.out.println("--------------");
        System.out.println(o2m2.get());
        System.out.println(o2.parentGet());
    }
}
class Outer2{
    private int num=0; // 밑의 Member 가 객체화가 될때마다 새로운 멤버필드의 공간이 생길거다.


    class Member{ // 멤버필드에도 static 이 없으므로 멤버필드에 접근가능하다. 멤버필드에만 static 이 붙어있어도 사용가능하다.
        void add(int val){
            num+=val;
        }
        int get(){
            return num;
        }
    }
    int parentGet(){
        return num;
    }


}