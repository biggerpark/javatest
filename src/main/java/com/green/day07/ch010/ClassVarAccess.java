package com.green.day07.ch010;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw=new AccessWay();//1, 생성자를 호출
        aw.increaseCnt();//2
        aw.num++;//3
        AccessWay.num++;//4
        System.out.printf("num:%d\n",AccessWay.num);//클래스명.static 변수 or 메소드 이렇게 사용하는게 적합하다.
        System.out.printf("num:%d\n",aw.num);// 이렇게 가능은 하나 static 때문에 객체화를 하지 않기 때문에 쓸 일이 잘 없다.

    }
}

class AccessWay{
    static int num=0;

    AccessWay(){
        increaseCnt();
    }

    void increaseCnt(){ //static 이 붙어있지 않은 메소드에서는 static 이 붙은 멤버필드의 클래스 변수를 호출할 수 있다. 그 반대는 안된다.
        num++;
    }
}
