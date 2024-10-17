package com.green.day07.ch010;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt ic1=new InstCnt();//insNum=1,value:1
        InstCnt ic2=new InstCnt();//insNum=2,value:1
        InstCnt ic3=new InstCnt();//insNum=3,value:1
        InstCnt ic4=new InstCnt();//insNum=4,value:1

    }
}

class InstCnt{
    static int insNum=0; // static 이 붙으면 별도의 공간에 변수가 선언이 된다. 즉 객체가 생성될때마다 새로운 주소값이 부여되는 것이 아니다.
    int value; // static 이 붙지 않은 멤버필드의 인스턴스 변수는 객체가 생성될때마다 새로운 주소값이 부여된다.

    InstCnt(){
        insNum++;
        value++;
        System.out.println("insNum:"+InstCnt.insNum);
        System.out.println("value:"+ value);
    }
}
